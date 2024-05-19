package day2.hm3.programmingLanguages.declarative.logical;

import day2.hm3.programmingLanguages.Translator;
import day2.hm3.programmingLanguages.declarative.DeclarativeLanguage;

public abstract class LogicalLanguage extends DeclarativeLanguage {
    public LogicalLanguage(Translator translator, String documentation) {
        super(translator, documentation);
    }
}
