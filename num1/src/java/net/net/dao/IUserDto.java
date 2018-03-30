package net.dao;

import net.model.*;
import java.util.*;

public interface IUserDto {

    public void addUser(User user);

    public void deleteUser(int id);

    public User getUserById(int id);

    public List<User> UserList();
}
