package net.service;

import net.dao.IUserDto;
import net.model.*;
import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService implements IUserService {
    private IUserDto iUserDto;

    public void setiUserDto(IUserDto iUserDto) {
        this.iUserDto = iUserDto;
    }

    @Override
    @Transactional
    public void addUser(User user) {

    }

    @Override
    @Transactional
    public void removeUser(User user) {

    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return null;
    }

    @Override
    @Transactional
    public List<User> UserList() {
        return null;
    }

}
