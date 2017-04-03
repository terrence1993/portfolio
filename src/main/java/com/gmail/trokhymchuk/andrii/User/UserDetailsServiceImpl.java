package com.gmail.trokhymchuk.andrii.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by andrew on 3/20/17.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

   @Autowired
    private UserService userService;

   @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException{
       CustomUser customUser = userService.getUserByLogin(login);
       if (customUser == null)
           throw new UsernameNotFoundException("Administrator " + login + " not found. Please enter login correctly or enter as user");

       Set<GrantedAuthority> roles = new HashSet<>();
       roles.add(new SimpleGrantedAuthority(customUser.getRole().toString()));

       return new User(customUser.getLogin(), customUser.getPassword(), roles);
   }

}
