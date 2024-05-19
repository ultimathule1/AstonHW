package ru.aston.hms.day2.hm3.programmingLanguages;

public abstract class ProgramLanguage {
    private Translator translator;
    private String documentation;

    public Translator getTranslator() {
        return translator;
    }

    public void setTranslator(Translator translator) {
        this.translator = translator;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public ProgramLanguage(Translator translator, String documentation) {
        this.translator = translator;
        this.documentation = documentation;
    }
}
