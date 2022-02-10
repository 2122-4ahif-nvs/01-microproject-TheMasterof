package at.htl.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(
                name = "Plane.findAll",
                query = "select p from Plane p"
        )
})
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    @OneToMany
    private List<Passenger> passenger;
    int maxPassangerAmount;

    public Plane(String model, List<Passenger> passenger, int MAXPASSANGERAMOUNT) {
        this.model = model;
        this.passenger = passenger;
        this.maxPassangerAmount = MAXPASSANGERAMOUNT;
    }

    public Plane() {

    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Passenger> getPassenger() {
        return passenger;
    }

    public void setPassenger(List<Passenger> passenger) {
        this.passenger = passenger;
    }
}
