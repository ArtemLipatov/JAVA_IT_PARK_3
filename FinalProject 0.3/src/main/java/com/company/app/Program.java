package com.company.app;

import com.company.config.ApplicationContext;
import com.company.models.User;
import com.company.repositories.UsersRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ApplicationContext.class);

        User artem = User.builder()
                .name("Джа-джа")
                .email("Бинкс@gmail.com")
                .password("StarWars")
                .build();

        UsersRepository usersRepository = context.getBean(UsersRepository.class);
        usersRepository.save(artem);

    }
}
