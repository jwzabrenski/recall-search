package com.johnz.recallsearch.models.cpsc;

import java.util.List;

/**
 * Created by John on 12/10/2016.
 */
public class CombinedCPSCResponse {
    public CombinedCPSCResponse(List<CPSCResponse> productNames, List<CPSCResponse> descriptions){
        this.productNames = productNames;
        this.descriptions = descriptions;
    }
    public List<CPSCResponse> productNames;
    public List<CPSCResponse> descriptions;

}
