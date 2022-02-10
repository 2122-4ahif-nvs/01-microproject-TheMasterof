package at.htl.controller;

import at.htl.entity.Passenger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PassengerRepository {

    @Inject
    EntityManager em;

    public void save(Passenger pilot) {
        em.persist(pilot);
    }
}
