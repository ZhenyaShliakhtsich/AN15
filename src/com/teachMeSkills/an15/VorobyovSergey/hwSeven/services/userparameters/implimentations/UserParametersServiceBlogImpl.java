package com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.userparameters.implimentations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.Blog;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.models.User;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.LineReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.readers.implementations.LineReaderServiceImpl;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.services.userparameters.UserParametersService;

public class UserParametersServiceBlogImpl implements UserParametersService {
    @Override
    public User setParameter(User user) {
        User user1 = user;
        LineReaderService line = new LineReaderServiceImpl();
        Blog blog = new Blog();
        blog.setBlogName(line.readLine("Введите имя вашего блога"));
        user1.setUserBlog(blog);
        return user1;
    }
}
