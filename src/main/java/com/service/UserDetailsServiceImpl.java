package com.service;

import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    IUserService userService;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userService.findUserByName(username);
//        if (user == null) {
//            System.out.println("User not found! " + username);
//            throw new UsernameNotFoundException("User " + username + " was not found in the database");
//        }
//
//        List<GrantedAuthority> grantList = new ArrayList<>();
//
//
//            // ROLE_USER, ROLE_ADMIN,..
//                grantList.add(user.getRole().);
//        UserDetails userDetails = (UserDetails) new User(user.getName(), //
//                user.getPass(), grantList);
//       return userDetails;
//    }
}
