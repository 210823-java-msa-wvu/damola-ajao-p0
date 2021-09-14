package com.revature.models;

public class Playlist {
    private Integer id;
    private String title;
    private User user;
    private Song song;

    public Playlist(Integer id, String title, Song song) {
        this.id = id;
        this.title = title;
        this.song = song;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                ", title='" + title + '\'' +
                ", user=" + user +
                ", song=" + song +
                '}';
    }



    //public void addPlaylist(Integer userid, String title, Integer songid) {
    
}
