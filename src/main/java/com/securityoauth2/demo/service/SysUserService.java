package com.securityoauth2.demo.service;

import com.securityoauth2.demo.pojo.SysUser;

public interface SysUserService {
    public SysUser getOneUserByUsername(String Username);
}
