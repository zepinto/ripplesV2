package pt.lsts.ripples2.model.assets;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Hashtable;
import java.util.concurrent.CopyOnWriteArrayList;

@Data
@Entity
public class AssetPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long uid;

    CopyOnWriteArrayList<Checkpoint> checkpoints = new CopyOnWriteArrayList<>();
    Hashtable<String, String> settings = new Hashtable<>();
}
