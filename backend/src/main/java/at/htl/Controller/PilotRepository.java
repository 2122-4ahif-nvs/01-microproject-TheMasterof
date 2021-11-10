package at.htl.Controller;

import at.htl.Entity.Pilot;
import org.hibernate.annotations.common.reflection.XMethod;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PilotRepository {

    @Inject
    EntityManager em;

    public void save(Pilot pilot) {
        em.persist(pilot);
    }
}
