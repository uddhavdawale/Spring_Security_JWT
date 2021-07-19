package com.ud.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ud.demo.model.User;
import com.ud.demo.repository.UserRepository;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException
    {

        final User user = this.userRepository.findByUsername(userName);
        /*
        if (user == null) {
            throw new UsernameNotFoundException("User not found !!");
        } else {
            return new CustomUserDetails(user);
        }
s*/

       // user database `
/*
       if (userName.equals("uddhav")) {
           return 	new org.springframework.security.core.userdetails.User("uddhav","Test12345",new ArrayList<>());
       } else {
           throw new UsernameNotFoundException("User not found !!");
       }
*/
        if (user.getUsername().equals(userName)) {
            return 	new org.springframework.security.core.userdetails.User("uddhav","Test12345",new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found !!");
        }
    }
}
