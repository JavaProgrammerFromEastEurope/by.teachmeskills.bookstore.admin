package com.example.demo.utility;

import com.example.demo.entity.Order;
import com.example.demo.entity.User;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.internet.InternetAddress;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Objects;

@Component
public class MailConstructor {

    @Autowired
    private Environment env;

    @Autowired
    private TemplateEngine templateEngine;

    public SimpleMailMessage constructResetTokenEmail(
            String contextPath, Locale locale, String token, User user, String password) {

        String url = contextPath + "/newUser?token=" + token;
        val message = MessageFormat.format("\nPlease click on this link to verify your email " +
                "and edit your personal information. Your password is:\n{0}", password);

        val email = new SimpleMailMessage();
        email.setTo(user.getEmail());
        email.setSubject("BOOKSTORE - New User");
        email.setText(url + message);
        email.setFrom(Objects.requireNonNull(env.getProperty("support.email")));
        return email;
    }

    public MimeMessagePreparator constructOrderConfirmationEmail(User user, Order order, Locale locale){
        Context context = new Context();
        context.setVariable("order", order);
        context.setVariable("user", user);
        context.setVariable("cartItemList", order.getCartItemList());
        String text = templateEngine.process("orderConfirmationEmailTemplate", context);

        return mimeMessage -> {
            MimeMessageHelper email = new MimeMessageHelper(mimeMessage);
            email.setTo(user.getEmail());
            email.setSubject("Order Confirmation - " + order.getId());
            email.setText(text, true);
            email.setFrom(new InternetAddress(Objects.requireNonNull(env.getProperty("support.email"))));
        };
    }
}
