package com.revature.models;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Boolean Uploader;

    public User(Integer id, String username, String password, Boolean uploader) {
        this.id = id;
        this.username = username;
        this.password = password;
        Uploader = uploader;
    }

    public User(int id, String username, String password) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getUploader() {
        return Uploader;
    }

    public void setUploader(Boolean uploader) {
        Uploader = uploader;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Uploader=" + Uploader +
                '}';
    }
}
