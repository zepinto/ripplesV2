package pt.lsts.ripples2.model.assets;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Hashtable;

@Data
@Entity
public class Checkpoint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long uid;

    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    AssetState state;

    Hashtable<String, String> settings = new Hashtable<>();
}
