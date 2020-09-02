package com.securityoauth2.demo.service.impl;

import com.securityoauth2.demo.mapper.UserMapper;
import com.securityoauth2.demo.pojo.SysUser;
import com.securityoauth2.demo.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public SysUser getOneUserByUsername(String username) {
        SysUser user_one = userMapper.selectOneUserByUserName(username);
        return user_one;
    }

}
