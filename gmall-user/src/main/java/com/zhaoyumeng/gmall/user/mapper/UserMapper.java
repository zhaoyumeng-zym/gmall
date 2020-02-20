package com.zhaoyumeng.gmall.user.mapper;

import com.zhaoyumeng.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author zhaoyumeng
 * @date 2020/2/19 - 12:13
 * @Program name
 */
public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
