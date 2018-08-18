package service;

import daoModel.UserDao;
import model.RatesEntity;
import model.UsersEntity;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

    public UsersEntity findUser(int id){
        return userDao.findById(id);
    }
    public void saveUser(UsersEntity usersEntity){
        userDao.save(usersEntity);
    }
    public void deleteUser(UsersEntity user) {
        userDao.delete(user);
    }

    public void updateUser(UsersEntity user) {
        userDao.update(user);
    }

    public List<UsersEntity> findAllUsers() {
        return userDao.findAll();
    }

    public RatesEntity findRateById(int id) {
        return userDao.findRateById(id);
    }
}
