package com.daniel.jpa.jpainspring.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.daniel.jpa.jpainspring.entities.User;
import org.springframework.stereotype.Repository;


/**
 * Created by bautisj on 8/8/2018.
 */
@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user){
        entityManager.persist(user);
        return user.getId();
    }
}
