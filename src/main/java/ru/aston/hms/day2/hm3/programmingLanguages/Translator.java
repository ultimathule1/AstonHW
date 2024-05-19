package ru.aston.hms.day2.hm3.programmingLanguages;

import java.util.Date;

public class Translator {
    private String name;
    private String createdBy;
    private Date whenCreated;
    private String technicalDocumentation;
    private Translation translation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getWhenCreated() {
        return whenCreated;
    }

    public void setWhenCreated(Date whenCreated) {
        this.whenCreated = whenCreated;
    }

    public String getTechnicalDocumentation() {
        return technicalDocumentation;
    }

    public void setTechnicalDocumentation(String technicalDocumentation) {
        this.technicalDocumentation = technicalDocumentation;
    }

    public Translation getTranslation() {
        return translation;
    }

    public void setTranslation(Translation translation) {
        this.translation = translation;
    }

    public Translator(String name, String createdBy, Date whenCreated, String technicalDocumentation, Translation translation) {
        this.name = name;
        this.createdBy = createdBy;
        this.whenCreated = whenCreated;
        this.technicalDocumentation = technicalDocumentation;
        this.translation = translation;
    }
}
