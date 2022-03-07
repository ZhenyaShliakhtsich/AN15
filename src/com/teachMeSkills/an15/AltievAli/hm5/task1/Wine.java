package com.teachMeSkills.an15.AltievAli.hm5.task1;

import java.time.LocalDate;

public class Wine {

    public String getKindOfWine() {
        return kindOfWine;
    }

    public void setKindOfWine(String kindOfWine) {
        this.kindOfWine = kindOfWine;
    }

    public String getBrandOfWine() {
        return brandOfWine;
    }

    public void setBrandOfWine(String brandOfWine) {
        this.brandOfWine = brandOfWine;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public LocalDate getSpillDate() {
        return spillDate;
    }

    public LocalDate setSpillDate(LocalDate spillDate) {
        this.spillDate = spillDate;
        return spillDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private String kindOfWine;
    private String brandOfWine;
    private String madeIn;
    private LocalDate spillDate;
    private String note;


}



