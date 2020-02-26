package com.zhaoyumeng.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhaoyumeng.gmall.bean.UmsMember;
import com.zhaoyumeng.gmall.service.UserService;
import com.zhaoyumeng.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zhaoyumeng
 * @date 2020/2/19 - 12:13
 * @Program name
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }
}
