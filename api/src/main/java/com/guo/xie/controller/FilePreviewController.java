package com.guo.xie.controller;

import com.guo.xie.bean.Person;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/**
 * Created by xie on 16/2/23.
 */

@Controller
public class FilePreviewController {

    @PostConstruct
    public void init() {
        System.out.println("init ing ...");
    }

    @RequestMapping("/xls")
    public void preview(HttpServletRequest request, HttpServletResponse response) {
        String path = this.getClass().getClassLoader().getResource("template/batch_monitor_template.xlsx").getPath();
        try {
            File file = new File(path);
            long length = file.length();
            response.setContentType("application/vnd.ms-excel");
            response.setContentLength((int) length);
//            response.setHeader("Content-disposition", "inline;filename='a.xlsx'");
            response.setHeader("Content-disposition", "attachment;filename='a.xlsx'");

            FileInputStream input = new FileInputStream(file);
            OutputStream out = response.getOutputStream();
            IOUtils.copy(input, out);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public void write(HttpServletRequest request, HttpServletResponse response) {
        try {
            OutputStream out = response.getOutputStream();
            out.write("controller".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @RequestMapping("/person")
    @ResponseBody
    public Object getBody(){
        Person person = new Person();
        person.setName("xxx");
        person.setAge(29);
        person.setBirthday("2015-08-01");
        return person;
    }
}
