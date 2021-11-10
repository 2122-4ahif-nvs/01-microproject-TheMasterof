package at.htl.Controller;

import at.htl.Entity.Pilot;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class PilotRepositoryTest {
    @Inject
    EntityManager em;

    @Inject
    PilotRepository pilotRepository;

    @Test
    public void testSave(){
        Pilot stevens = new Pilot("steven", "stevens", 3000);
        pilotRepository.save(stevens);

    }
}
