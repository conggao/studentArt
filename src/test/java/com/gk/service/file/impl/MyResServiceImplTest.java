package com.gk.service.file.impl;

import com.gk.Application;
import com.gk.entity.file.protocol.DirListRsp;
import com.gk.entity.file.protocol.MyResDirListRsp;
import com.gk.entity.file.protocol.MyResDirReq;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MyResServiceImplTest {
    @Autowired
    MyResServiceImpl myResService;
    Integer schoolId;
    Long userId;

    @Before
    public void before() {
        schoolId = 1;
        userId = 1l;
    }

    //新建文件夹操作
    @Test
    public void addDir() throws Exception {
        MyResDirReq reqValue = new MyResDirReq();
        reqValue.setCondition(null);
        reqValue.setName("hello");
        reqValue.setParentId(1l);
        myResService.addDir(reqValue, schoolId, userId);
    }

    // 共享操作
    @Test
    public void share() throws Exception {
    }

    // 获取文件夹下列表操作
    @Test
    public void getListItems() throws Exception {
        MyResDirReq reqValue = new MyResDirReq();
        reqValue.setParentId(1l);
        // 调用服务层操作
        MyResDirListRsp rsp = myResService.getListItems(reqValue, schoolId, userId);
        rsp.getDirList().stream().forEach(e -> System.out.println(e.getName()));
    }
    // 选择文件夹操作

    @Test
    public void getDirList() throws Exception {
        //调用服务层操作
        MyResDirReq reqValue = new MyResDirReq();
        DirListRsp rsp = myResService.getDirList(reqValue, schoolId, userId);
        List<DirListRsp> dirList = rsp.getDirList();
        dirList.stream().forEach(e -> System.out.println(e.getName()));

    }

    //上传文件操作
    @Test
    public void addRes() throws Exception {
    }

    //删除文件操作
    @Test
    public void delete() throws Exception {
    }

    //重命名操作
    @Test
    public void rename() throws Exception {
    }
    // 复制移动操作

    @Test
    public void copy() throws Exception {
    }

}