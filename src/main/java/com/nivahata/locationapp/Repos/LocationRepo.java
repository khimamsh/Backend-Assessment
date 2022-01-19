package com.nivahata.locationapp.Repos;

import com.nivahata.locationapp.model.Location;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface LocationRepo extends ElasticsearchRepository<Location,String> {


    
}
