package com.gk.dao.jpa.file;

import com.gk.Application;
import com.gk.entity.file.ViewUserResInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class FileDAOTest {
    @Autowired
    FileDAO fileDAO;
    @Autowired
    ViewUserResDAO viewUserResDAO;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void queryViewUserResInfoList() throws Exception {
        List<ViewUserResInfo> viewUserResInfos = viewUserResDAO.findByFileNameLikeAndDirIdAndCreateUserId(null, 1l, 1l);
        for (ViewUserResInfo v :
                viewUserResInfos) {
            System.out.printf(v.getFileName());
        }


    }

    @Test
    public void queryViewUserResInfoByFileUrl() throws Exception {
    }

}