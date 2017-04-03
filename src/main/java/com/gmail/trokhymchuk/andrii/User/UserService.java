package com.gmail.trokhymchuk.andrii.User;

import java.util.List;

/**
 * Created by andrew on 3/20/17.
 */
public interface UserService {

    CustomUser getUserByLogin(String login);
    boolean existsByLogin(String login);
    void addUser(CustomUser customUser);
    List<CustomUser>getAll();

}
