package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.userparameters.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.LineReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.LineReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.userparameters.UserParametersService;

public class UserParametersServiceEmailImpl implements UserParametersService {
    @Override
    public User setParameter(User user) {
        User user1 = user;
        String str;
        String regex = "^(.+)@(.+)$";
        LineReaderService line = new LineReaderServiceImpl();
        do {
            str = line.readLine("Введите email пользователя");
        }
        while (!str.matches(regex));
        user1.setUserEmail(str);
        return user1;
    }
}
