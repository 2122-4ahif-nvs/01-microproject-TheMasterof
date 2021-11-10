package at.htl.Controller;

import at.htl.Entity.Pilot;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class PilotRepositoryTest {
    @Inject
    EntityManager em;

    @Inject
    PilotRepository pilotRepository;

    @Test
    public void savePilot(){
        Pilot stevens = new Pilot("steven", "stevens", 3000);
        pilotRepository.save(stevens);
        var pilots = em.createNamedQuery("Pilot.findAll",Pilot.class).getResultList();
        // assertThat(pilots.size()).isEqualTo(8);
    }
}
