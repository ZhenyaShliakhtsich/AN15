package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.edituser;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.User;

public interface UserService {
    User editFirstName(User user);
    User editLastName(User user);
    User editEmail(User user);
    User editLogin(User user);
    User editPassword(User user);
    User editBlog(User user);
}
