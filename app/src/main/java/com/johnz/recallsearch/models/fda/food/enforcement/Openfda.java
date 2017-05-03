
package com.johnz.recallsearch.models.fda.food.enforcement;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Openfda implements Serializable, Parcelable
{

    public final static Parcelable.Creator<Openfda> CREATOR = new Creator<Openfda>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Openfda createFromParcel(Parcel in) {
            Openfda instance = new Openfda();
            return instance;
        }

        public Openfda[] newArray(int size) {
            return (new Openfda[size]);
        }

    }
    ;
    private final static long serialVersionUID = -9087210499889376189L;

    public void writeToParcel(Parcel dest, int flags) {
    }

    public int describeContents() {
        return  0;
    }

}
