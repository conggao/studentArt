package com.gk.web;

import com.gk.entity.file.protocol.UploadFileRsp;
import com.gk.entity.media.protocol.PublishMediaReq;
import com.gk.entity.media.protocol.PublishMovieRsp;
import com.gk.model.file.UploadFileInfo;
import com.gk.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/publish")
public class UploadController {
    @Autowired
    UploadFileService uploadFileService;

    @RequestMapping(value = "/upload")
    public UploadFileRsp upload(@RequestParam("file") MultipartFile clientFile, HttpServletRequest request) {
        UploadFileRsp rsp = new UploadFileRsp();
        String result = "上传成功";
        String fileName = clientFile.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        String newFileName = UUID.randomUUID() + suffixName;
        ServletContext sc = request.getSession().getServletContext();
        // classpath 地址
        String Root = "";
        // class 文件夹
        File rootDir;
        try {
            Root = ResourceUtils.getURL("classpath:").getPath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (!clientFile.isEmpty()) {
            rootDir = new File(Root);
            if (!rootDir.exists()) {
                rootDir = new File("");

            }
            try {
                String serverUrl = rootDir.getAbsolutePath() + "\\upload\\file\\";
                serverUrl = "d:/file/gk/";
                File serverDir = new File(serverUrl);
                if (!serverDir.exists()) {
                    serverDir.mkdirs();
                }
                String url = serverDir.getAbsolutePath() + "/" + newFileName;

                System.out.println("客户端文件 " + clientFile.getOriginalFilename() + " 文件大小： " + clientFile.getSize());

                File serverFile = new File(url);
                clientFile.transferTo(serverFile);
                //url = url.replace("\\","/");
                String path = "gk/" + newFileName;
                UploadFileInfo info = new UploadFileInfo(null, path, 1, fileName, 10L, 1, null, 1L, null, new Date(), false);
                info = uploadFileService.uploadFile(info);
                if (info.equals(null)) {
                    result = "存入数据库失败";
                }
                rsp.setId(info.getId());
                rsp.setUrl(info.getPath());
                return rsp;
            } catch (Exception e) {
                result = "复制文件失败";
                rsp.setResult(result);
                e.printStackTrace();
            }
        } else {
            result = "网络传输失败";
            return rsp;
        }
        rsp.setResult(result);
        return rsp;
    }

    @RequestMapping(value = "/movie")
    public PublishMovieRsp movieInfo(PublishMediaReq req) {
        PublishMovieRsp rsp = uploadFileService.publishMovie(req);
        return rsp;
    }
}