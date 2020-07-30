package com.example.framework.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * 测试上传
 *
 * @author xnf
 * @date 2020/7/27
 */
@RestController
public class UploadController {
    /**
     *
     * @param file
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/uploadAttach",method = RequestMethod.POST)
    public String upload(@RequestParam("attach") MultipartFile file) throws Exception{
        //处理文件
        System.out.println("文件原名称："+file.getOriginalFilename());
        System.out.println("文件类型："+file.getContentType());

        //保存到硬盘
        file.transferTo(new File("c:/"+file.getOriginalFilename()));
        return "上传成功";
    }
}
