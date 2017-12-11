package pt.lsts.ripples2.model.ships;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ShipInfo {

    @Id
    long mmsi;
    String name;

}
