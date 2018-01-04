package com.gk.web;

import com.gk.entity.file.protocol.UploadFileRsp;
import com.gk.entity.master.LoginReq;
import com.gk.entity.master.LoginRsp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;

@Controller
@RequestMapping("/master")
public class MasterController {

    @RequestMapping("/login")
    public String login(LoginReq req, HttpSession session) {
        LoginRsp rsp = new LoginRsp();
        String password = req.getPassword();
        String userName = req.getUserName();
        session.setAttribute("userName", userName);
        return "login";
    }

}