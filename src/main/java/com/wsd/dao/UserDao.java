package com.wsd.dao;

import com.wsd.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by tm on 2018/7/19.
 * 用户dao接口
 */
@Repository
public interface UserDao {
    /**
     * 查询用户方法
     * @return
     */
     User queryUser();

    /**
     * 删除用户方法
     * @return
     */
    int deleteUser();
}
