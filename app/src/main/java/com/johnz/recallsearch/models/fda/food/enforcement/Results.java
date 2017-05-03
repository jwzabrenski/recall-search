
package com.johnz.recallsearch.models.fda.food.enforcement;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results implements Serializable, Parcelable
{

    @SerializedName("skip")
    @Expose
    private Integer skip;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("total")
    @Expose
    private Integer total;
    public final static Parcelable.Creator<Results> CREATOR = new Creator<Results>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Results createFromParcel(Parcel in) {
            Results instance = new Results();
            instance.skip = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.limit = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.total = ((Integer) in.readValue((Integer.class.getClassLoader())));
            return instance;
        }

        public Results[] newArray(int size) {
            return (new Results[size]);
        }

    }
    ;
    private final static long serialVersionUID = -3770950692102322709L;

    public Integer getSkip() {
        return skip;
    }

    public void setSkip(Integer skip) {
        this.skip = skip;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(skip);
        dest.writeValue(limit);
        dest.writeValue(total);
    }

    public int describeContents() {
        return  0;
    }

}
