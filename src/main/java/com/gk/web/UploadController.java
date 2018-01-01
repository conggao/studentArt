package com.gk.web;

import com.gk.entity.file.protocol.UploadFileRsp;
import com.gk.entity.media.protocol.MediaReq;
import com.gk.mapper.file.UploadFileInfoMapper;
import com.gk.model.file.UploadFileInfo;
import com.gk.service.file.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class UploadController {
    @Autowired
    UploadFileService uploadFileService;

    @RequestMapping(name = "/movie", method = RequestMethod.POST)
    public UploadFileRsp movie(@RequestParam("file") MultipartFile clientFile, HttpServletRequest request) {
        UploadFileRsp rsp = new UploadFileRsp();
        String fileName = clientFile.getOriginalFilename();
        String newFileName = UUID.randomUUID() + fileName;
        ServletContext sc = request.getSession().getServletContext();
        String path = sc.getRealPath("/img") + "/";
        File serverDir = new File(path);
        if (!serverDir.exists()) {
            if (!serverDir.mkdirs()) {
                String result = "创建上传文件服务器文件夹失败";
                rsp.setResult(result);
                return rsp;
            }
        }
        if (!clientFile.isEmpty()) {
            try {
                String url = path + newFileName;
                FileOutputStream fos = new FileOutputStream(url);
                InputStream in = clientFile.getInputStream();
                int b;
                if ((b = in.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                in.close();
                UploadFileInfo info = new UploadFileInfo(null, url, 1, fileName, 10L, 1, null, 1L, null, new Date(), false);
                rsp.setUrl(url);
                return rsp;
            } catch (Exception e) {
                String result = "复制文件失败";
                rsp.setResult(result);
                e.printStackTrace();
            }
        } else {
            String result = "网络传输失败";
            return rsp;
        }
        return rsp;
    }

    @RequestMapping(name = "/info", method = RequestMethod.GET)
    public String movieInfo(MediaReq req) {
        String title = req.getTitle();
        String introduction = req.getIntroduction();
        return "hello";
    }
}