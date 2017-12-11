package pt.lsts.ripples2.model.ships;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ShipDynamics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long uid;

    @ManyToOne
    ShipInfo ship;

    double latitude, longitude, course, speed, heading;
}
