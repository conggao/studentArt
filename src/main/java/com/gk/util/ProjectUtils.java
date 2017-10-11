package com.gk.util;

import org.springframework.util.Assert;

import java.io.File;

public class ProjectUtils {
    public static boolean clearDirUtil(File file) {
        Assert.notNull(file, "输入文件不能为空");
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (!f.getName().equals("protocol")) {
                    clearDirUtil(f);
                }
            }
            return true;
        } else {
            file.delete();
            return true;
        }
    }
}
