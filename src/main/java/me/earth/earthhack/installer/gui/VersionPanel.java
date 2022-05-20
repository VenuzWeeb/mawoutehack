package me.earth.earthhack.installer.gui;

import me.earth.earthhack.installer.Installer;
import me.earth.earthhack.installer.version.Version;
import me.earth.earthhack.installer.version.VersionUtil;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VersionPanel extends JPanel {
    public VersionPanel(Installer handler, List<Version> versions) {
        String[] columns = {"nombre", "forge", "MawouteWare", "valido"};
        List<Object[]> data = new ArrayList<>(versions.size());
        for (Version version : versions) {
            boolean earth = VersionUtil.hasEarthhack(version);
            boolean forge = VersionUtil.hasForge(version);
            boolean valid = VersionUtil.hasLaunchWrapper(version);
            data.add(new Object[]{version.getName(), forge, earth, valid});
        }

        JButton install = new JButton("instalar");
        install.setEnabled(false);

        JButton uninstall = new JButton("desinstalar");
        uninstall.setEnabled(false);

        JButton refresh = new JButton("refrescar");
        refresh.addActionListener(e -> handler.refreshVersions());

        Object[][] t = data.toArray(new Object[0][]);
        JTable jt = new JTable(t, columns);
        jt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jt.addMouseListener(new VersionMouseAdapter(jt, install, uninstall, t));

        install.addActionListener(e ->
        {
            int row = jt.getSelectedRow();
            if (row >= 0) {
                Version version = versions.get(row);
                handler.install(version);
            }
        });

        uninstall.addActionListener(e ->
        {
            int row = jt.getSelectedRow();
            if (row >= 0) {
                Version version = versions.get(row);
                handler.uninstall(version);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(install);
        buttonPanel.add(uninstall);
        buttonPanel.add(refresh);

        JButton installAll = new JButton("instala-todo");
        installAll.addActionListener(e ->
        {
            for (Version version : versions) {
                if (VersionUtil.hasLaunchWrapper(version)
                        && !VersionUtil.hasEarthhack(version)) {
                    if (handler.install(version)) {
                        return;
                    }
                }
            }
        });
        JButton uninstallAll = new JButton("desinstala-todo");
        uninstallAll.addActionListener(e ->
        {
            for (Version version : versions) {
                if (VersionUtil.hasEarthhack(version)) {
                    if (handler.uninstall(version)) {
                        return;
                    }
                }
            }
        });
        JButton updateForge = new JButton("actualiza forge");
        updateForge.addActionListener(e -> handler.update(true));
        JButton updateVanilla = new JButton("actualiza vanilla");
        updateVanilla.addActionListener(e -> handler.update(false));

        JPanel allPanel = new JPanel();
        allPanel.add(installAll);
        allPanel.add(uninstallAll);
        allPanel.add(updateForge);
        allPanel.add(updateVanilla);

        JButton exit = new JButton("salir");
        exit.addActionListener(e -> System.exit(0));

        JPanel exitPanel = new JPanel();
        exitPanel.add(exit);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JScrollPane(jt));
        add(buttonPanel);
        add(allPanel);
        add(exitPanel);
    }

}
