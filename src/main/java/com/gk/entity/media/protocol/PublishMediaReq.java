package com.gk.entity.media.protocol;

public class PublishMediaReq {
    private String title;
    private String introduction;
    private Long movieId;
    private Long coverId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroduction() {
        return introduction;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getCoverId() {
        return coverId;
    }

    public void setCoverId(Long coverId) {
        this.coverId = coverId;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
