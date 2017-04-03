package com.gmail.trokhymchuk.andrii.User;

/**
 * Created by andrew on 3/20/17.
 */
public enum  UserRole {
    ADMIN, ANONIMOUS;

    @Override
    public String toString(){
        return "ROLE_" + name();
    }

}
