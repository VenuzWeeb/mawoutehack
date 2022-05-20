package me.earth.earthhack.impl.modules.misc.announcer.util;

public enum AnnouncementType {
    Distance() {
        @Override
        public String getDefaultMessage() {
            return "Acabo de caminar <NUMBER> de bloques ermano, gracias mawoutehack";
        }

        @Override
        public String getFile() {
            return PATH + "Announcer_Distance.txt";
        }
    },
    Mine() {
        @Override
        public String getDefaultMessage() {
            return "acabo de minar <NUMBER> de <NAME> gracias mawoutehacccc";
        }

        @Override
        public String getFile() {
            return PATH + "Announcer_Mine.txt";
        }
    },
    Place() {
        @Override
        public String getDefaultMessage() {
            return "acabo de poner <NUMBER> de <NAME> gracias mawouteclien!";
        }

        @Override
        public String getFile() {
            return PATH + "Announcer_Place.txt";
        }
    },
    Eat() {
        @Override
        public String getDefaultMessage() {
            return "acabo de comer <NUMBER> de <NAME> gracias a chulohack!";
        }

        @Override
        public String getFile() {
            return PATH + "Announcer_Eat.txt";
        }
    },
    Join() {
        @Override
        public String getDefaultMessage() {
            return "hola pobreton llamado <NAME>";
        }

        @Override
        public String getFile() {
            return PATH + "Announcer_Join.txt";
        }
    },
    Leave() {
        @Override
        public String getDefaultMessage() {
            return "adios noob, se pro <NAME>";
        }

        @Override
        public String getFile() {
            return PATH + "Announcer_Leave.txt";
        }
    },
    Totems() {
        @Override
        public String getDefaultMessage() {
            return "facilitos <NUMBER> pops <NAME>, todo gracias al legendario mawouteware";
        }

        @Override
        public String getFile() {
            return PATH + "Announcer_Totems.txt";
        }
    },
    Death() {
        @Override
        public String getDefaultMessage() {
            return "q facil estuvo la pelea ermano, owneado por chulohack.com.ve <NAME>!";
        }

        @Override
        public String getFile() {
            return PATH + "Announcer_Death.txt";
        }
    },
    Miss() {
        @Override
        public String getDefaultMessage() {
            return "buen tiro <NAME>, pero intenta pegarla manco, fallas mas q mi abuela zzzzz";
        }

        @Override
        public String getFile() {
            return PATH + "Announcer_Miss.txt";
        }
    };

    private static final String PATH = "earthhack/util/";

    public abstract String getDefaultMessage();

    public abstract String getFile();

}
