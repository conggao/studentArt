package com.gk.entity.media.protocol;

public class LoadMovieInfoRsp {
    private Long movieFileId;
    private String movieName;
    private String title;
    private String introduction;
    private String result;
    private Integer code;

    public LoadMovieInfoRsp(Long movieFileId, String movieName, String title, String introduction, String result, Integer code) {
        this.movieFileId = movieFileId;
        this.movieName = movieName;
        this.title = title;
        this.introduction = introduction;
        this.result = result;
        this.code = code;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Long getMovieFileId() {
        return movieFileId;
    }

    public void setMovieFileId(Long movieFileId) {
        this.movieFileId = movieFileId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
