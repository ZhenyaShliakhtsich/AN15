package com.teachMeSkills.an15.AltievAli.hm7;

import com.teachMeSkills.an15.AltievAli.hm7.service.RegistrationService;
import com.teachMeSkills.an15.AltievAli.hm7.service.impl.RegistrationImpl;

public class Main {
    public static void main(String[] args) throws Exception {

       RegistrationService service = new RegistrationImpl();
        service.registration();

    }
}
