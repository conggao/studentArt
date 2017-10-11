package com.gk;

import com.gk.util.ProjectUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class ClearDirTest {
    @Test
    public void clearTest() {
        File rootDir = new File("C:\\Users\\Administrator\\Desktop\\studentArt\\src\\main\\java\\com\\gk\\entity");
        Assert.assertTrue(ProjectUtils.clearDirUtil(rootDir));
    }
}
