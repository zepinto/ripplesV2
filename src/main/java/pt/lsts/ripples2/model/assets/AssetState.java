package pt.lsts.ripples2.model.assets;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class AssetState {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long uid;

    double latitude;
    double longitude;
    double time;
}
