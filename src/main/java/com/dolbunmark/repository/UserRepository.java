package com.dolbunmark.repository;

import com.dolbunmark.config.HibernateConfig;
import com.dolbunmark.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class UserRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public UserRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public User getUser(String email) {
        Query query = sessionFactory.getCurrentSession().createQuery("from User p where p.email = :email");
        query.setParameter("email", email);
        return (User) query.getSingleResult();
    }

    @PostConstruct
    public void init() {
        User user = new User("v@gmail.com","1Asdf!");
        Session session = sessionFactory.openSession();
        session.save(user);
    }


}
