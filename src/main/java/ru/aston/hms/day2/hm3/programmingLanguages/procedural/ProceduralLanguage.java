package ru.aston.hms.day2.hm3.programmingLanguages.procedural;

import ru.aston.hms.day2.hm3.programmingLanguages.ProgramLanguage;
import ru.aston.hms.day2.hm3.programmingLanguages.Translator;

public abstract class ProceduralLanguage extends ProgramLanguage {
    public ProceduralLanguage(Translator translator, String documentation) {
        super(translator, documentation);
    }
}