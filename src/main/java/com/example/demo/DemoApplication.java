package com.example.demo;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.service.UserService;
import com.example.demo.utility.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        User user = new User();
        user.setFirstName("Vladimir");
        user.setLastName("Malakhov");
        user.setUsername("admin");
        user.setPassword(SecurityUtility.passwordEncoder().encode("admin"));
        user.setEmail("name.smtp@gmail.com");

        Set<UserRole> userRoles = new HashSet<>();

        Role role = new Role();
        role.setId(2L);
        role.setName("ROLE_ADMIN");
        userRoles.add(new UserRole(user, role));

        userService.createUser(user, userRoles);
    }
}