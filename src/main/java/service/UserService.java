package service;

import pojo.User;

/**
 * @Auther: ShallowDream7
 * @Date: 2019/3/7 00:31
 * @Description:
 */
public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
