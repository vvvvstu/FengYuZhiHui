package com.qf.dao;

import com.qf.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author zzz
 * @Date 2021/7/6 21:46
 */
@Repository
public interface AdminMapper {

    Admin findAdminByName(String name);
}