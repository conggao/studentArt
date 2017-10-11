package com.gk.dao.jpa.file;

import com.gk.Application;
import com.gk.entity.file.DirInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DirDAOTest {
    @Autowired
    DirDAO dirDAO;
    boolean isDel = false;

    @Test
    public void findBySchoolId() throws Exception {
    }

    @Test
    public void findByCreateUserId() throws Exception {
    }

    @Test
    public void findByNameLikeAndIdAndCreateUserIdAndSchoolIdAndParentIdNotNullAndDel() throws Exception {
    }

    @Test
    public void findByParentId() throws Exception {
        List<Long> result = dirDAO.findByParentId(1L,isDel);
        result.forEach(System.out::println);
    }

    @Test
    public void findByParentIdAndName() throws Exception {
        List<DirInfo> dirInfoList = dirDAO.findByParentIdAndName(1l, "hello");
        dirInfoList.forEach(e-> System.out.println(e.getId()));

    }

}