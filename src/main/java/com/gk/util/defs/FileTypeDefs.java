package com.gk.util.defs;

import com.gk.entity.file.FileType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FileTypeDefs {

    public static final Integer FILE_TYPE_IMAGE = 10;
    public static final Integer FILE_TYPE_AUDIO = 11;
    public static final Integer FILE_TYPE_VIDEO = 12;
    public static final Integer FILE_TYPE_FLASH = 13;
    public static final Integer FILE_TYPE_DOC = 20;
    public static final Integer FILE_TYPE_UNKNOWN = 99;

    public static List<FileType> listFileTypeInfo = new ArrayList<FileType>() {{
        add(new FileType(FILE_TYPE_IMAGE, "图片"));
        add(new FileType(FILE_TYPE_AUDIO, "音频"));
        add(new FileType(FILE_TYPE_VIDEO, "视频"));
        add(new FileType(FILE_TYPE_FLASH, "动画"));
        add(new FileType(FILE_TYPE_DOC, "文档"));
        add(new FileType(FILE_TYPE_UNKNOWN, "其它"));
    }};

    public static HashMap<String, Integer> mapFileTypeExt = new HashMap<String, Integer>() {
        {
            put("jpg", FILE_TYPE_IMAGE);
            put("jpeg", FILE_TYPE_IMAGE);
            put("png", FILE_TYPE_IMAGE);
            put("bmp", FILE_TYPE_IMAGE);
            put("gif", FILE_TYPE_IMAGE);
            put("wmf", FILE_TYPE_IMAGE);
            put("tiff", FILE_TYPE_IMAGE);
            put("mp3", FILE_TYPE_AUDIO);
            put("wav", FILE_TYPE_AUDIO);
            put("wma", FILE_TYPE_AUDIO);
            put("mid", FILE_TYPE_AUDIO);
            put("mp4", FILE_TYPE_VIDEO);
            put("wmv", FILE_TYPE_VIDEO);
            put("avi", FILE_TYPE_VIDEO);
            put("asf", FILE_TYPE_VIDEO);
            put("rm", FILE_TYPE_VIDEO);
            put("rmvb", FILE_TYPE_VIDEO);
            put("mpg", FILE_TYPE_VIDEO);
            put("dat", FILE_TYPE_VIDEO);
            put("mpeg", FILE_TYPE_VIDEO);
            put("swf", FILE_TYPE_FLASH);
            put("flv", FILE_TYPE_FLASH);
            put("doc", FILE_TYPE_DOC);
            put("docx", FILE_TYPE_DOC);
            put("ppt", FILE_TYPE_DOC);
            put("pptx", FILE_TYPE_DOC);
            put("xls", FILE_TYPE_DOC);
            put("xlsx", FILE_TYPE_DOC);
            put("pps", FILE_TYPE_DOC);
            put("pdf", FILE_TYPE_DOC);
            put("rtf", FILE_TYPE_DOC);
            put("txt", FILE_TYPE_DOC);
        }
    };
}
