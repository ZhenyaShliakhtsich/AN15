package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.editpost.implementations;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.models.Post;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.editpost.FillPostService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.LineReaderService;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.services.readers.implementations.LineReaderServiceImpl;

public class FillPostServiceImpl implements FillPostService {
    @Override
    public Post fillInPleas() {
        Post post = new Post();
        LineReaderService lineReaderService = new LineReaderServiceImpl();
        //Поменяли имя
        String name = lineReaderService.readLine("Введите имя поста:");
        post.setPostName(name);
        //Поменяли текст
        String text = lineReaderService.readLine("Введите текст поста:");
        if (text.length() <= 1000) {
            post.setPostText(text);
        } else {
            System.out.println("Пост длиннее чем 1000 символов, мы его чутка подрежем");
            text = text.substring(0, 1000);
            post.setPostText(text);
        }
        System.out.println("Твой новый пост - " + post);
        return post;
    }
}
