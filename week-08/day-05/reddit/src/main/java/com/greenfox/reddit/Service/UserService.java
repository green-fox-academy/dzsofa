package com.greenfox.reddit.Service;

import com.greenfox.reddit.models.User;
import com.greenfox.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User login(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public static HttpSession getSession() {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpSession session = attr.getRequest().getSession(true);
        return session;
    }

    public static void destroySession() {
        getSession().removeAttribute("username");
    }


    public static boolean isNotLoggedIn() {
        if (UserService.getSession().getAttribute("username") == null) {
            return true;
        }
        return false;
    }

    public void save(String username, String password) {
        userRepository.save(new User(username, password));
    }
}
