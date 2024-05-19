package ru.aston.hms.day2.hm3.programmingLanguages.procedural.lowLevel;

import ru.aston.hms.day2.hm3.programmingLanguages.Translator;
import ru.aston.hms.day2.hm3.programmingLanguages.procedural.ProceduralLanguage;

public abstract class LowLevelLanguage extends ProceduralLanguage {
    public LowLevelLanguage(Translator translator, String documentation) {
        super(translator, documentation);
    }
}