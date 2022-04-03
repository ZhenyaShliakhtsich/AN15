package com.teachMeSkills.an15.AltievAli.hm9;

import com.teachMeSkills.an15.AltievAli.hm9.service.ReadAndWriteService;
import com.teachMeSkills.an15.AltievAli.hm9.service.impl.ReadAndWriteServiceImpl;

import java.io.IOException;

public class Dispatcher {
    public static void main(String[] args) throws IOException {

        ReadAndWriteService readAndWriteService = new ReadAndWriteServiceImpl();
        readAndWriteService.write();
    }
}
