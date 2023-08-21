package dao;

import model.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void saveUser(User user) {
        entityManager.persist(user);
        entityManager.close();
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    @Transactional
    public void removeUserById(long id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }
}


