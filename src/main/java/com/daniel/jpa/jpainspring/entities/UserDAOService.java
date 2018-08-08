package com.daniel.jpa.jpainspring.entities;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by bautisj on 8/8/2018.
 */
@Repository
@Transactional
public class UserDAOService {

    private EntityManager entityManager;

    @PersistenceContext
    public long insert(User user){
        entityManager.persist(user);
        return user.getId();
    }
}
