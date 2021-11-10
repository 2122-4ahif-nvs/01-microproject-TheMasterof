package at.htl.Entity;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(
                name = "Pilot.findAll",
                query = "select p from Pilot p"
        )
})
public class Pilot {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private double salary;

    //region Constructors
    public Pilot(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Pilot() {
    }
    //endregion

    //region Properties

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //endregion
}
