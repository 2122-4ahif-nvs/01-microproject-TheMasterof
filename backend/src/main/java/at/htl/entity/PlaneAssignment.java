package at.htl.entity;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(
                name = "Plane.findAll",
                query = "select p from PlaneAssignment p"
        )
})
public class PlaneAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "plane_id")
    Plane plane;

    @ManyToOne
    @JoinColumn(name = "plane_schedule_id")
    PlaneSchedule planeSchedule;

    public PlaneSchedule getPlaneSchedule() {
        return planeSchedule;
    }

    public Plane getPlane() {
        return plane;
    }
}
