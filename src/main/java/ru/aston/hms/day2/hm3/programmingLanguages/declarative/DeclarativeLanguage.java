package ru.aston.hms.day2.hm3.programmingLanguages.declarative;

import ru.aston.hms.day2.hm3.programmingLanguages.ProgramLanguage;
import ru.aston.hms.day2.hm3.programmingLanguages.Translator;

public abstract class DeclarativeLanguage extends ProgramLanguage {
    public DeclarativeLanguage(Translator translator, String documentation) {
        super(translator, documentation);
    }
}