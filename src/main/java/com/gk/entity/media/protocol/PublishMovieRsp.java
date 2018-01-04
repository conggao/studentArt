package com.gk.entity.media.protocol;

public class PublishMovieRsp {
    private Long movieId;
    private String result;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
