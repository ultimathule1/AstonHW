package ru.aston.hms.day2.hm3.programmingLanguages.objectOriented;

import ru.aston.hms.day2.hm3.programmingLanguages.ProgramLanguage;
import ru.aston.hms.day2.hm3.programmingLanguages.Translator;

public abstract class ObjectOrientedLanguage extends ProgramLanguage {
    public ObjectOrientedLanguage(Translator translator, String documentation) {
        super(translator, documentation);
    }
}
