package com.gk.entity.media.protocol;

import java.util.List;

public class LoadAudioRsp {
    private List<Audio> audioList;
    private String result;

    public List<Audio> getAudioList() {
        return audioList;
    }

    public void setAudioList(List<Audio> audioList) {
        this.audioList = audioList;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    private class Audio {
        private Long audioId;
        private Long coverId;
        private String title;

        public Long getAudioId() {
            return audioId;
        }

        public void setAudioId(Long audioId) {
            this.audioId = audioId;
        }

        public Long getCoverId() {
            return coverId;
        }

        public void setCoverId(Long coverId) {
            this.coverId = coverId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
