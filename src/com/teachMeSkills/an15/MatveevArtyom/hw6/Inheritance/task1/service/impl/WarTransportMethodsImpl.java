package com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.service.impl;

import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.airTransport.WarTransport;
import com.teachMeSkills.an15.MatveevArtyom.hw6.Inheritance.task1.service.WarTransportMethods;

public class WarTransportMethodsImpl implements WarTransportMethods {
    @Override
    public void printShot(WarTransport warTransport) {
        if (warTransport.getCountOfRockets() != 0) {
            System.out.println("Ракета пошла..");
        } else System.out.println("Боеприпасы отсутствуют!");
    }

    @Override
    public void printEjection(WarTransport warTransport) {
        if (warTransport.isEjectionSystem()) {
            System.out.println("Катапультирование прошло успешно!");
        } else {
            System.out.println("У вас нет системы катапультирования!");
        }
    }
}
