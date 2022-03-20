package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.edituser.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.LineReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.LineReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.edituser.UserParametersService;

public class UserParametersServiceLastNameImpl implements UserParametersService {
    @Override
    public User setParameter(User user) {
        User user1 = user;
        LineReaderService line = new LineReaderServiceImpl();
        user1.setUserLastName(line.readLine("Введите фамилию пользователя"));
        return user1;
    }
}
