package pt.lsts.ripples2.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.lsts.ripples2.model.ships.ShipInfo;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/ships")
public interface ShipsRepo extends CrudRepository<ShipInfo, Long>{

    ShipInfo findByMmsi(@Param("mmsi") long mmsi);
    ShipInfo findByName(@Param("name") String name);

    default List<ShipInfo> findWithin(
            @Param("lat1") double lat1,
            @Param("lon1") double lon1,
            @Param("lat2") double lat2,
            @Param("lon2") double lon2) {
        return new ArrayList<>();
    }

}
