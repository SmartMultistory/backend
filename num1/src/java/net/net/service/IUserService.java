package net.service;

import net.model.*;
import java.util.*;

public interface IUserService {
    public void addUser(User user);
    public void removeUser(User user);
    public User getUserById(int id);
    public List<User> UserList();
}
