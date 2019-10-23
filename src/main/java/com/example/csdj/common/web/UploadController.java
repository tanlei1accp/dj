package com.example.csdj.common.web;/*
 *  @author changguiying
 *  @description
 *  @date 2019/10/21
 */

import com.example.csdj.common.utils.AliyunOSSUtil;
import com.example.csdj.common.utils.VerificationCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/ueditor")
public class UploadController {
    /**
     * 上传配置：即不走config.json，模拟config.json里的内容，解决后端配置项不正确，无法上传的问题
     * @return
     */
    @RequestMapping("/config")
    @ResponseBody
    public String uploadConfig(HttpServletRequest request, HttpServletResponse response) {
        ServletContext application = request.getServletContext();
        String s = "{\n" +
                "            \"imageActionName\": \"uploadimage\",\n" +
                "                \"imageFieldName\": \"upfile\", \n" +
                "                \"imageMaxSize\": 2048000, \n" +
                "                \"imageAllowFiles\": [\".png\", \".jpg\", \".jpeg\", \".gif\", \".bmp\"], \n" +
                "                \"imageCompressEnable\": true, \n" +
                "                \"imageCompressBorder\": 1600, \n" +
                "                \"imageInsertAlign\": \"none\", \n" +
                "                \"imageUrlPrefix\": \"\",\n" +
                "                \"imagePathFormat\": \"/ueditor/jsp/upload/image/{yyyy}{mm}{dd}/{time}{rand:6}\" }";
        return s;
    }


    @RequestMapping("upload")
    @ResponseBody
    public Map<String,String> upload(MultipartFile upfile) {
        String nonce_str = VerificationCodeUtil.getNonce_str();
        String url = AliyunOSSUtil.uploadObject2OSS(upfile);
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("state","SUCCESS");
        stringStringHashMap.put("url",url);
        stringStringHashMap.put("title", nonce_str);
        stringStringHashMap.put("original",nonce_str);
        return stringStringHashMap;
    }
}
