package com.model;

import org.springframework.security.acls.domain.GrantedAuthoritySid;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roleName;
    @OneToMany
    private List<User> userList;

    public Role(Long id, String roleName, List<User> userList) {
        this.id = id;
        this.roleName = roleName;
        this.userList = userList;
    }

    public Role(String roleName, List<User> userList) {
        this.roleName = roleName;
        this.userList = userList;
    }

    public Role() {
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String getAuthority() {
        return roleName;
    }
}
