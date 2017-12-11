package pt.lsts.ripples2.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.lsts.ripples2.model.assets.Asset;

@RequestMapping("/assets")
public interface AssetRepository extends CrudRepository<Asset, Integer> {
    Asset findById(int id);
    Asset findByName(@Param("name") String name);
}

