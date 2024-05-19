package ru.aston.hms.day2.hm3.programmingLanguages.declarative.functional;

import ru.aston.hms.day2.hm3.programmingLanguages.Translator;
import ru.aston.hms.day2.hm3.programmingLanguages.declarative.DeclarativeLanguage;

public abstract class FunctionalLanguage extends DeclarativeLanguage {
    public FunctionalLanguage(Translator translator, String documentation) {
        super(translator, documentation);
    }
}
