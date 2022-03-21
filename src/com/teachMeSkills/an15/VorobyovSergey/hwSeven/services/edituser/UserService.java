package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.edituser;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;

public interface UserService {
    User editFirstName(User user);
    User editLastName(User user);
    User editEmail(User user);
    User editLogin(User user);
    User editPassword(User user);
    User editBlog(User user);
}
