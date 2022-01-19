package com.nivahata.locationapp.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName = "location_index")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
@Id
private String locationInfo;
public String getLocationInfo()
{
    return locationInfo;
}

public void setLocationInfo( String locationInfo)
{
    this.locationInfo = locationInfo;
}
    
}
