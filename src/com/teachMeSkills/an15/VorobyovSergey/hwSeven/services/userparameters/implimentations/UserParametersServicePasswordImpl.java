package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.userparameters.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.LineReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.LineReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.userparameters.UserParametersService;

public class UserParametersServicePasswordImpl implements UserParametersService {
    @Override
    public User setParameter(User user) {
        User user1 = user;
        String password;
        String passwordConfirmed;
        LineReaderService line = new LineReaderServiceImpl();
        password = line.readLine("Введите пароль пользователя");
        passwordConfirmed = line.readLine("Повторите пароль пользователя");
        while (!password.equals(passwordConfirmed)) {
            System.out.println("Вы не смогли повторить пароль!!!! Пробуем еще раз!!!");
            password = line.readLine("Введите пароль пользователя");
            passwordConfirmed = line.readLine("Повторите пароль пользователя");
        }

        user1.setUserPassword(passwordConfirmed);
        return user1;
    }
}
