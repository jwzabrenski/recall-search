
package com.johnz.recallsearch.models.fda.food.enforcement;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta implements Serializable, Parcelable
{

    @SerializedName("disclaimer")
    @Expose
    private String disclaimer;
    @SerializedName("terms")
    @Expose
    private String terms;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;
    @SerializedName("results")
    @Expose
    private Results results;
    public final static Parcelable.Creator<Meta> CREATOR = new Creator<Meta>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Meta createFromParcel(Parcel in) {
            Meta instance = new Meta();
            instance.disclaimer = ((String) in.readValue((String.class.getClassLoader())));
            instance.terms = ((String) in.readValue((String.class.getClassLoader())));
            instance.license = ((String) in.readValue((String.class.getClassLoader())));
            instance.lastUpdated = ((String) in.readValue((String.class.getClassLoader())));
            instance.results = ((Results) in.readValue((Results.class.getClassLoader())));
            return instance;
        }

        public Meta[] newArray(int size) {
            return (new Meta[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8439404962914251073L;

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(disclaimer);
        dest.writeValue(terms);
        dest.writeValue(license);
        dest.writeValue(lastUpdated);
        dest.writeValue(results);
    }

    public int describeContents() {
        return  0;
    }

}
