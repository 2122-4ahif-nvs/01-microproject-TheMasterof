package at.htl.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NamedQueries({
        @NamedQuery(
                name = "Passenger.findAll",
                query = "select p from Passenger p"
        )
})
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String seatNum;
    AirplaneClass airplaneClass;

    public Passenger(String seatNum, AirplaneClass airplaneClass) {
        this.seatNum = seatNum;
        this.airplaneClass = airplaneClass;
    }

    public Passenger() {

    }


    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    public AirplaneClass getAirplaneClass() {
        return airplaneClass;
    }

    public void setAirplaneClass(AirplaneClass airplaneClass) {
        this.airplaneClass = airplaneClass;
    }
}
