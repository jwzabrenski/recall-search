package com.johnz.recallsearch.models;

import java.util.List;

/**
 * Created by John on 12/10/2016.
 */
public class CombinedCPSCResponse {
    public CombinedCPSCResponse(List<RecallResponse> productNames, List<RecallResponse> descriptions){
        this.productNames = productNames;
        this.descriptions = descriptions;
    }
    public List<RecallResponse> productNames;
    public List<RecallResponse> descriptions;

}
