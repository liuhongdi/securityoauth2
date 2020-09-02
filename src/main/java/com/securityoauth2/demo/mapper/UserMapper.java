package com.securityoauth2.demo.mapper;

import com.securityoauth2.demo.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface UserMapper {
    public SysUser selectOneUserByUserName(String username);
}