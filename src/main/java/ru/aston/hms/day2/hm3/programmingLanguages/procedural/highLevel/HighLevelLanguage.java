package ru.aston.hms.day2.hm3.programmingLanguages.procedural.highLevel;

import ru.aston.hms.day2.hm3.programmingLanguages.Translator;
import ru.aston.hms.day2.hm3.programmingLanguages.procedural.ProceduralLanguage;

public abstract class HighLevelLanguage extends ProceduralLanguage {
    public HighLevelLanguage(Translator translator, String documentation) {
        super(translator, documentation);
    }
}
