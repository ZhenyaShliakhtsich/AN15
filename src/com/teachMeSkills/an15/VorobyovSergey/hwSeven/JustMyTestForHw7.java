package com.teachMeSkills.an15.VorobyovSergey.hwSeven;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.userparameters.UserParametersService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.userparameters.implimentations.UserParametersServiceBlogImpl;

public class JustMyTestForHw7 {
    public static void main(String[] args) {
        User user = new User();
        user.setUserFirstName("Max");
        System.out.println(user);
        UserParametersService service = new UserParametersServiceBlogImpl();
        service.setParameter(user);
        System.out.println(user);

    }
}
