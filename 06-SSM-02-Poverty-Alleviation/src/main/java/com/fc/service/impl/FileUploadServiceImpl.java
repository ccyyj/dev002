package com.fc.service.impl;

import com.fc.service.FileUploadService;
import com.fc.vo.ResultVO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

@Service
public class FileUploadServiceImpl implements FileUploadService {
    @Override
    public ResultVO fileUpload(MultipartFile file, String type) {
        String path = "E:\\server(2)\\apache-tomcat-8.5.37\\webapps\\upload\\poverty_alleviation\\" + type;

        File pathFile = new File(path);

        if (!pathFile.exists()){
            pathFile.mkdirs();
        }

        String originalFilename = file.getOriginalFilename();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");

        String formatDate = formatter.format(new Date());

        String suffix = originalFilename.substring(originalFilename.lastIndexOf('.'));

        originalFilename = formatDate + suffix;

        ResultVO resultVO = new ResultVO();
        try {
            file.transferTo(new File(pathFile,originalFilename));

            HashMap<String, Object> map = new HashMap<>();

            map.put("imgurl" , "http://localhost:8081/upload/poverty_alleviation/" + type + "/" + originalFilename);

            resultVO.setCode(200);
            resultVO.setSuccess(true);
            resultVO.setMessage("上传成功");
            resultVO.setData(map);
        } catch (IOException e) {
            e.printStackTrace();

            resultVO.setCode(-1000);
            resultVO.setSuccess(false);
            resultVO.setMessage("上传失败");
        }
        return resultVO;
    }
}
