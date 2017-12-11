package pt.lsts.ripples2.controller;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import pt.lsts.ripples2.model.assets.Asset;

public interface AssetRepository extends PagingAndSortingRepository<Asset, Integer> {
    Asset findById(@Param("id") Integer id);
    Asset findByName(@Param("name") String name);
}

