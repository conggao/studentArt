package com.gk.web;

import com.gk.entity.media.protocol.LoadMovieInfoRsp;
import com.gk.entity.media.protocol.LoadMovieReq;
import com.gk.entity.media.protocol.LoadMovieRsp;
import com.gk.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;

@RestController
@RequestMapping(value = "/load")
public class LoadController {
    @Autowired
    LoadService loadService;
    @Autowired
    ResourceLoader resourceLoader;

    @RequestMapping(value = "/movie")
    public LoadMovieRsp loadMovie(LoadMovieReq req) {
        LoadMovieRsp rsp = loadService.findMovieList(req);
        return rsp;
    }

    @RequestMapping(value = "/movieInfo")
    public LoadMovieInfoRsp loadMovieInfo(Long movieId) {
        LoadMovieInfoRsp rsp = loadService.findMovieInfo(movieId);
        return rsp;
    }

    @RequestMapping(value = "/file/{fileId}")
    public ResponseEntity<byte[]> loadFile(@PathVariable Long fileId) {
        File file;
        ResponseEntity<byte[]> response = null;
        String fileUrl = loadService.findFileUrl(fileId);
        String fileName = fileUrl.substring(fileUrl.lastIndexOf("/"));
        try {
            file = resourceLoader.getResource("file:/d:/file/" + fileUrl).getFile();
            FileInputStream in = new FileInputStream(file);
            byte[] b = new byte[in.available()];
            in.read(b);
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Disposition", "attachment;filename=" + fileName);
            if (fileName.substring(fileName.lastIndexOf(".")).equals("mp4")) {
                headers.set(CONTENT_TYPE,"audio/mp4");
            }
            HttpStatus status = HttpStatus.OK;
            response = new ResponseEntity<byte[]>(b, headers, status);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

}
