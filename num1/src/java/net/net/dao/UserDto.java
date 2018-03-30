package net.dao;

import net.model.User;
import org.hibernate.*;
import org.slf4j.*;
import java.util.*;
import org.springframework.stereotype.Repository;

import javax.websocket.Session;


@Repository
public class UserDto implements IUserDto {

    private static final Logger logger = LoggerFactory.getLogger(UserDto.class);

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private SessionFactory sessionFactory;


    @Override
    public void addUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
        logger.info("User successfully saved. User details: " + user);
    }


    @Override
    public void deleteUser(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user =  (User) session.load(User.class, new Integer(id));

        if( user != null){
            session.delete(user);
        }
        logger.info("User successfully delete. User details: " + user);
    }

    @Override
    public User getUserById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, new Integer(id));
        logger.info("Usser successfully load: " + user);
        return null;
    }

    @Override
    @SuppressWarnings("uncked")
    public List<User> UserList() {
        Session session = this.sessionFactory.getCurrentSession();
        List<User>  userList =session.createQuery("from User").list();

        for(User user: userList){
            logger.info("User list " + user);
        }return null;
    }
}
