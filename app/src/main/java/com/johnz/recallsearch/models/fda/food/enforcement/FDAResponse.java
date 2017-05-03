
package com.johnz.recallsearch.models.fda.food.enforcement;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FDAResponse implements Serializable, Parcelable
{

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    public final static Parcelable.Creator<FDAResponse> CREATOR = new Creator<FDAResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public FDAResponse createFromParcel(Parcel in) {
            FDAResponse instance = new FDAResponse();
            instance.meta = ((Meta) in.readValue((Meta.class.getClassLoader())));
            in.readList(instance.results, (com.johnz.recallsearch.models.fda.food.enforcement.Result.class.getClassLoader()));
            return instance;
        }

        public FDAResponse[] newArray(int size) {
            return (new FDAResponse[size]);
        }

    }
    ;
    private final static long serialVersionUID = 6791968284854479213L;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(meta);
        dest.writeList(results);
    }

    public int describeContents() {
        return  0;
    }

}
