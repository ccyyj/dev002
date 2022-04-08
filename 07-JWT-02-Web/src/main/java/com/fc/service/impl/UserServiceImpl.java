package com.fc.service.impl;

import com.fc.service.UserService;
import com.fc.vo.UserVo;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserVo login(String username, String password) {
        UserVo userVO = null;

        // 登录成功
        if (username.equals("易烊千玺") && password.equals("123456")) {
            userVO = new UserVo();
            userVO.setId(1);
            userVO.setUsername(username);
            userVO.setLastAccessTime(new Date());
        }

        return userVO;
    }
}
