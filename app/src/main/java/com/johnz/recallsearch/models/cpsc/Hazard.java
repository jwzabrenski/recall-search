
package com.johnz.recallsearch.models.cpsc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;


@Generated("org.jsonschema2pojo")
public class Hazard {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("HazardTypeID")
    @Expose
    private String hazardTypeID;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The hazardTypeID
     */
    public String getHazardTypeID() {
        return hazardTypeID;
    }

    /**
     * 
     * @param hazardTypeID
     *     The HazardTypeID
     */
    public void setHazardTypeID(String hazardTypeID) {
        this.hazardTypeID = hazardTypeID;
    }

}
