package com.revature.models;

public class Platform {
    private Integer Id;
    private Boolean iTunes;
    private Boolean PlayStore;
    private Boolean Soundcloud;
    private Boolean Spotify;
    private Boolean YoutubeRip;

    public Platform(Integer id, Boolean iTunes, Boolean playStore, Boolean soundcloud, Boolean spotify, Boolean youtubeRip) {
        Id = id;
        this.iTunes = iTunes;
        PlayStore = playStore;
        Soundcloud = soundcloud;
        Spotify = spotify;
        YoutubeRip = youtubeRip;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Boolean getiTunes() {
        return iTunes;
    }

    public void setiTunes(Boolean iTunes) {
        this.iTunes = iTunes;
    }

    public Boolean getPlayStore() {
        return PlayStore;
    }

    public void setPlayStore(Boolean playStore) {
        PlayStore = playStore;
    }

    public Boolean getSoundcloud() {
        return Soundcloud;
    }

    public void setSoundcloud(Boolean soundcloud) {
        Soundcloud = soundcloud;
    }

    public Boolean getSpotify() {
        return Spotify;
    }

    public void setSpotify(Boolean spotify) {
        Spotify = spotify;
    }

    public Boolean getYoutubeRip() {
        return YoutubeRip;
    }

    public void setYoutubeRip(Boolean youtubeRip) {
        YoutubeRip = youtubeRip;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "Id=" + Id +
                ", iTunes=" + iTunes +
                ", PlayStore=" + PlayStore +
                ", Soundcloud=" + Soundcloud +
                ", Spotify=" + Spotify +
                ", YoutubeRip=" + YoutubeRip +
                '}';
    }
}
