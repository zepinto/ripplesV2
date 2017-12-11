package pt.lsts.ripples2.model.assets;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
public class Asset {

    @Id
    int id;

    String name;

    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    AssetCapabilities capabilities;

    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    AssetPlan plan;

    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    AssetState lastReceived;

    AssetState getEstimatedState() {

        AssetState ret = new AssetState();
        ret.time = Instant.now().toEpochMilli()/1000.0;

        // TODO use plan to generate state
        return ret;
    }

    AssetState getNextCheckpoint() {
        // TODO use plan to generate state
        return null;
    }
}
