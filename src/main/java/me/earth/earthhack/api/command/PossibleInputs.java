package me.earth.earthhack.api.command;

public class PossibleInputs {
    private String completion;
    private String rest;

    public PossibleInputs(String completion, String rest) {
        this.completion = completion;
        this.rest = rest;
    }

    public static PossibleInputs empty() {
        return new PossibleInputs("", "");
    }

    public String getFullText() {
        return completion + rest;
    }

    public String getCompletion() {
        return completion;
    }

    public PossibleInputs setCompletion(String completion) {
        this.completion = completion;
        return this;
    }

    public String getRest() {
        return rest;
    }

    public PossibleInputs setRest(String rest) {
        this.rest = rest;
        return this;
    }

}
