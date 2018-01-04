package com.gk.entity.media.protocol;

import java.util.List;

public class LoadMovieRsp {
    private List<Movie> movieList;
    private String result;
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static class Movie {
        private Long movieId;
        private String title;
        private List<Cover> coverList;

        public Long getMovieId() {
            return movieId;
        }

        public void setMovieId(Long movieId) {
            this.movieId = movieId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<Cover> getCoverList() {
            return coverList;
        }

        public void setCoverList(List<Cover> coverList) {
            this.coverList = coverList;
        }
    }

    public static class Cover {
        private Long coverId;
        private Long coverFileId;

        public Long getCoverFileId() {
            return coverFileId;
        }

        public void setCoverFileId(Long coverFileId) {
            this.coverFileId = coverFileId;
        }

        private String url;

        public Long getCoverId() {
            return coverId;
        }

        public void setCoverId(Long coverId) {
            this.coverId = coverId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
