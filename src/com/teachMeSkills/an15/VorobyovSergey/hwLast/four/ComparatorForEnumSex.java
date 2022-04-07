package com.teachMeSkills.an15.VorobyovSergey.hwLast.four;

import com.teachMeSkills.an15.VorobyovSergey.hwLast.one.People;
import com.teachMeSkills.an15.VorobyovSergey.hwLast.one.SexEnum;

import java.util.Comparator;

public class ComparatorForEnumSex implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        if (o1.getSex().getItem().equals(o2.getSex().getItem()))
            return 0;
        else if (o1.getSex().getItem().equals("man"))
            return 1;
        else
            return -1;
    }
}
