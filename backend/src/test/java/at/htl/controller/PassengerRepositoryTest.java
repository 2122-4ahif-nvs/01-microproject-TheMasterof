package at.htl.controller;

import at.htl.entity.AirplaneClass;
import at.htl.entity.Passenger;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;

@QuarkusTest
class PassengerRepositoryTest {
    @Inject
    EntityManager em;

    @Inject
    PassengerRepository passengerRepository;

    @Test
    public void savePilot(){
        Passenger steven = new Passenger("D4", AirplaneClass.BUSINESS);
        passengerRepository.save(steven);
        var pilots = em.createNamedQuery("Passenger.findAll",Passenger.class).getResultList();
        // assertThat(pilots.size()).isEqualTo(8);
    }
}
