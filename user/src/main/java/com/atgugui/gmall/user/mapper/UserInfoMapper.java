package com.atgugui.gmall.user.mapper;

import com.atguigu.gmall.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

public interface UserInfoMapper extends Mapper<UserInfo> {
    List<UserInfo> selectAllUser();

}
