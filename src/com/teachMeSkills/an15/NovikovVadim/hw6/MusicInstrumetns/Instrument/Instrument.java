package com.teachMeSkills.an15.NovikovVadim.hw6.MusicInstrumetns.Instrument;

public class Instrument {
    protected String nameObject;

    public String getNameObject() {
        return nameObject;
    }

    public String getNumber(int number, String[] param) {
        int r_100 = number % 100;
        int r_10 = r_100 % 10;

        String str = "";
        if (r_100 > 4 && r_100 < 21) {
            str = (number + " " + param[2]);
        } else {
            if (r_10 == 1) {
                str = (number + " " + param[0]);
            } else if (r_10 > 1 && r_10 < 5) {
                str = (number + " " + param[1]);
            } else {
                str = (number + " " + param[2]);
            }
        }
        return str;
    }
}
