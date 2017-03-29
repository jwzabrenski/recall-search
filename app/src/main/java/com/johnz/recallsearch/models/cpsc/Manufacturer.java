
package com.johnz.recallsearch.models.cpsc;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Manufacturer {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("CompanyID")
    @Expose
    private String companyID;

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
     *     The companyID
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * 
     * @param companyID
     *     The CompanyID
     */
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

}
