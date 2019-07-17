package com.example.demo.entity;


import javax.persistence.*;

@Entity
public class User {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "userName")
    private String userName;
    @Column(name = "role")
    private String role;
    @Column(name = "password")
    private String password;
    @Column(name = "permission")
    private String permission;





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", role='").append(role).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", permission='").append(permission).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
