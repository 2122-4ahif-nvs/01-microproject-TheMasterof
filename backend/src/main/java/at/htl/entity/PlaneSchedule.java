package at.htl.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NamedQueries({
        @NamedQuery(
                name = "Plane.findAll",
                query = "select p from PlaneSchedule p"
        )
})
public class PlaneSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    LocalDateTime departure;
    LocalDateTime arrival;
    String destination;
    String origin;

    public PlaneSchedule(LocalDateTime departure, LocalDateTime arrival, String destination, String origin) {
        this.departure = departure;
        this.arrival = arrival;
        this.destination = destination;
        this.origin = origin;
    }

    public PlaneSchedule() {

    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
