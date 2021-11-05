package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.security.PasswordResetToken;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface UserService {
    PasswordResetToken getPasswordResetToken(String token);

    void createPasswordResetTokenForUser(User user, String token);

//    User findById(Long id);

    User findByUsername(String username);

    User findByEmail(String email);

    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);

    List<User> findAll();

    void updateUserBilling(UserPayment userPayment, UserBilling userBilling, User user);

    void updateUserShipping(UserShipping userShipping, User user);

    void setUserDefaultPayment(Long userPaymentId, User user);

    void setUserDefaultShipping(Long userShippingId, User user);
}