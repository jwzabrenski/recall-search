
package com.johnz.recallsearch.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class RecallResponse implements Parcelable{

//    public RecallResponse(String recallDate, String description, String title) {
//        this.recallDate = recallDate;
//        this.description = description;
//        this.title = title;
//    }

    //Read data
    public RecallResponse (Parcel parcel) {
        recallDate = parcel.readString();
        description = parcel.readString();
        title = parcel.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    //Marshall data
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(recallDate);
        dest.writeString(description);
        dest.writeString(title);
    }

    public static Parcelable.Creator<RecallResponse> CREATOR = new Parcelable.Creator<RecallResponse>() {

        @Override
        public RecallResponse createFromParcel(Parcel source) {
            return new RecallResponse(source);
        }

        @Override
        public RecallResponse[] newArray(int size) {
            return new RecallResponse[size];
        }

    };

    @SerializedName("RecallID")
    @Expose
    private Integer recallID;
    @SerializedName("RecallNumber")
    @Expose
    private String recallNumber;
    @SerializedName("RecallDate")
    @Expose
    private String recallDate;
    @SerializedName("Description")
    @Expose
    private String description;
//    @SerializedName("URL")
//    @Expose
//    private String uRL;
    @SerializedName("Title")
    @Expose
    private String title;
//    @SerializedName("ConsumerContact")
//    @Expose
//    private Object consumerContact;
//    @SerializedName("LastPublishDate")
//    @Expose
//    private String lastPublishDate;
//    @SerializedName("Products")
//    @Expose
//    private List<Product> products = new ArrayList<Product>();
//    @SerializedName("Inconjunctions")
//    @Expose
//    private List<Object> inconjunctions = new ArrayList<Object>();
//    @SerializedName("Images")
//    @Expose
//    private List<Object> images = new ArrayList<Object>();
//    @SerializedName("Injuries")
//    @Expose
//    private List<Object> injuries = new ArrayList<Object>();
//    @SerializedName("Manufacturers")
//    @Expose
//    private List<Manufacturer> manufacturers = new ArrayList<Manufacturer>();
//    @SerializedName("ManufacturerCountries")
//    @Expose
//    private List<ManufacturerCountry> manufacturerCountries = new ArrayList<ManufacturerCountry>();
//    @SerializedName("ProductUPCs")
//    @Expose
//    private List<Object> productUPCs = new ArrayList<Object>();
//    @SerializedName("Hazards")
//    @Expose
//    private List<Hazard> hazards = new ArrayList<Hazard>();
//    @SerializedName("Remedies")
//    @Expose
//    private List<Object> remedies = new ArrayList<Object>();
//    @SerializedName("Retailers")
//    @Expose
//    private List<Object> retailers = new ArrayList<Object>();
//
//
    /**
     *
     * @return
     *     The recallID
     */
    public Integer getRecallID() {
        return recallID;
    }

    /**
     *
     * @param recallID
     *     The RecallID
     */
    public void setRecallID(Integer recallID) {
        this.recallID = recallID;
    }

    /**
     *
     * @return
     *     The recallNumber
     */
    public String getRecallNumber() {
        return recallNumber;
    }

    /**
     *
     * @param recallNumber
     *     The RecallNumber
     */
    public void setRecallNumber(String recallNumber) {
        this.recallNumber = recallNumber;
    }

    /**
     * 
     * @return
     *     The recallDate
     */
    public String getRecallDate() {
        return recallDate;
    }

    /**
     * 
     * @param recallDate
     *     The RecallDate
     */
    public void setRecallDate(String recallDate) {
        this.recallDate = recallDate;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The Description
     */
    public void setDescription(String description) {
        this.description = description;
    }
//
//    /**
//     *
//     * @return
//     *     The uRL
//     */
//    public String getURL() {
//        return uRL;
//    }
//
//    /**
//     *
//     * @param uRL
//     *     The URL
//     */
//    public void setURL(String uRL) {
//        this.uRL = uRL;
//    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The Title
     */
    public void setTitle(String title) {
        this.title = title;
    }
//
//    /**
//     *
//     * @return
//     *     The consumerContact
//     */
//    public Object getConsumerContact() {
//        return consumerContact;
//    }
//
//    /**
//     *
//     * @param consumerContact
//     *     The ConsumerContact
//     */
//    public void setConsumerContact(Object consumerContact) {
//        this.consumerContact = consumerContact;
//    }
//
//    /**
//     *
//     * @return
//     *     The lastPublishDate
//     */
//    public String getLastPublishDate() {
//        return lastPublishDate;
//    }
//
//    /**
//     *
//     * @param lastPublishDate
//     *     The LastPublishDate
//     */
//    public void setLastPublishDate(String lastPublishDate) {
//        this.lastPublishDate = lastPublishDate;
//    }
//
//    /**
//     *
//     * @return
//     *     The products
//     */
//    public List<Product> getProducts() {
//        return products;
//    }
//
//    /**
//     *
//     * @param products
//     *     The Products
//     */
//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }
//
//    /**
//     *
//     * @return
//     *     The inconjunctions
//     */
//    public List<Object> getInconjunctions() {
//        return inconjunctions;
//    }
//
//    /**
//     *
//     * @param inconjunctions
//     *     The Inconjunctions
//     */
//    public void setInconjunctions(List<Object> inconjunctions) {
//        this.inconjunctions = inconjunctions;
//    }
//
//    /**
//     *
//     * @return
//     *     The images
//     */
//    public List<Object> getImages() {
//        return images;
//    }
//
//    /**
//     *
//     * @param images
//     *     The Images
//     */
//    public void setImages(List<Object> images) {
//        this.images = images;
//    }
//
//    /**
//     *
//     * @return
//     *     The injuries
//     */
//    public List<Object> getInjuries() {
//        return injuries;
//    }
//
//    /**
//     *
//     * @param injuries
//     *     The Injuries
//     */
//    public void setInjuries(List<Object> injuries) {
//        this.injuries = injuries;
//    }
//
//    /**
//     *
//     * @return
//     *     The manufacturers
//     */
//    public List<Manufacturer> getManufacturers() {
//        return manufacturers;
//    }
//
//    /**
//     *
//     * @param manufacturers
//     *     The Manufacturers
//     */
//    public void setManufacturers(List<Manufacturer> manufacturers) {
//        this.manufacturers = manufacturers;
//    }
//
//    /**
//     *
//     * @return
//     *     The manufacturerCountries
//     */
//    public List<ManufacturerCountry> getManufacturerCountries() {
//        return manufacturerCountries;
//    }
//
//    /**
//     *
//     * @param manufacturerCountries
//     *     The ManufacturerCountries
//     */
//    public void setManufacturerCountries(List<ManufacturerCountry> manufacturerCountries) {
//        this.manufacturerCountries = manufacturerCountries;
//    }
//
//    /**
//     *
//     * @return
//     *     The productUPCs
//     */
//    public List<Object> getProductUPCs() {
//        return productUPCs;
//    }
//
//    /**
//     *
//     * @param productUPCs
//     *     The ProductUPCs
//     */
//    public void setProductUPCs(List<Object> productUPCs) {
//        this.productUPCs = productUPCs;
//    }
//
//    /**
//     *
//     * @return
//     *     The hazards
//     */
//    public List<Hazard> getHazards() {
//        return hazards;
//    }
//
//    /**
//     *
//     * @param hazards
//     *     The Hazards
//     */
//    public void setHazards(List<Hazard> hazards) {
//        this.hazards = hazards;
//    }
//
//    /**
//     *
//     * @return
//     *     The remedies
//     */
//    public List<Object> getRemedies() {
//        return remedies;
//    }
//
//    /**
//     *
//     * @param remedies
//     *     The Remedies
//     */
//    public void setRemedies(List<Object> remedies) {
//        this.remedies = remedies;
//    }
//
//    /**
//     *
//     * @return
//     *     The retailers
//     */
//    public List<Object> getRetailers() {
//        return retailers;
//    }
//
//    /**
//     *
//     * @param retailers
//     *     The Retailers
//     */
//    public void setRetailers(List<Object> retailers) {
//        this.retailers = retailers;
//    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof RecallResponse) {
            RecallResponse temp = (RecallResponse) obj;
            if(this.recallNumber.equals(temp.recallNumber)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(recallNumber);
    }
}
