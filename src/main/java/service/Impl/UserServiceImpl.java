package service.Impl;

import dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;
import service.UserService;

/**
 * @Auther: ShallowDream7
 * @Date: 2019/3/7 00:32
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper UserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return UserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return UserMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return UserMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return UserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return UserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return UserMapper.updateByPrimaryKey(record);
    }
}
