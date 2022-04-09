package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw11.task4;

public enum Sex {
    MAN("man"),
    WOMEN("woman");
    String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "sex='" + sex + '\'' +
                '}';
    }

}
