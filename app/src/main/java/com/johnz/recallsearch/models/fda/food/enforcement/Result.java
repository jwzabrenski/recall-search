
package com.johnz.recallsearch.models.fda.food.enforcement;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result implements Serializable, Parcelable
{

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("reason_for_recall")
    @Expose
    private String reasonForRecall;
    @SerializedName("address_1")
    @Expose
    private String address1;
    @SerializedName("address_2")
    @Expose
    private String address2;
    @SerializedName("code_info")
    @Expose
    private String codeInfo;
    @SerializedName("product_quantity")
    @Expose
    private String productQuantity;
    @SerializedName("center_classification_date")
    @Expose
    private String centerClassificationDate;
    @SerializedName("distribution_pattern")
    @Expose
    private String distributionPattern;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("product_description")
    @Expose
    private String productDescription;
    @SerializedName("report_date")
    @Expose
    private String reportDate;
    @SerializedName("classification")
    @Expose
    private String classification;
    @SerializedName("openfda")
    @Expose
    private Openfda openfda;
    @SerializedName("recall_number")
    @Expose
    private String recallNumber;
    @SerializedName("recalling_firm")
    @Expose
    private String recallingFirm;
    @SerializedName("initial_firm_notification")
    @Expose
    private String initialFirmNotification;
    @SerializedName("event_id")
    @Expose
    private String eventId;
    @SerializedName("product_type")
    @Expose
    private String productType;
    @SerializedName("more_code_info")
    @Expose
    private Object moreCodeInfo;
    @SerializedName("recall_initiation_date")
    @Expose
    private String recallInitiationDate;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("voluntary_mandated")
    @Expose
    private String voluntaryMandated;
    @SerializedName("status")
    @Expose
    private String status;
    public final static Parcelable.Creator<Result> CREATOR = new Creator<Result>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Result createFromParcel(Parcel in) {
            Result instance = new Result();
            instance.country = ((String) in.readValue((String.class.getClassLoader())));
            instance.city = ((String) in.readValue((String.class.getClassLoader())));
            instance.reasonForRecall = ((String) in.readValue((String.class.getClassLoader())));
            instance.address1 = ((String) in.readValue((String.class.getClassLoader())));
            instance.address2 = ((String) in.readValue((String.class.getClassLoader())));
            instance.codeInfo = ((String) in.readValue((String.class.getClassLoader())));
            instance.productQuantity = ((String) in.readValue((String.class.getClassLoader())));
            instance.centerClassificationDate = ((String) in.readValue((String.class.getClassLoader())));
            instance.distributionPattern = ((String) in.readValue((String.class.getClassLoader())));
            instance.state = ((String) in.readValue((String.class.getClassLoader())));
            instance.productDescription = ((String) in.readValue((String.class.getClassLoader())));
            instance.reportDate = ((String) in.readValue((String.class.getClassLoader())));
            instance.classification = ((String) in.readValue((String.class.getClassLoader())));
            instance.openfda = ((Openfda) in.readValue((Openfda.class.getClassLoader())));
            instance.recallNumber = ((String) in.readValue((String.class.getClassLoader())));
            instance.recallingFirm = ((String) in.readValue((String.class.getClassLoader())));
            instance.initialFirmNotification = ((String) in.readValue((String.class.getClassLoader())));
            instance.eventId = ((String) in.readValue((String.class.getClassLoader())));
            instance.productType = ((String) in.readValue((String.class.getClassLoader())));
            instance.moreCodeInfo = ((Object) in.readValue((Object.class.getClassLoader())));
            instance.recallInitiationDate = ((String) in.readValue((String.class.getClassLoader())));
            instance.postalCode = ((String) in.readValue((String.class.getClassLoader())));
            instance.voluntaryMandated = ((String) in.readValue((String.class.getClassLoader())));
            instance.status = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    }
    ;
    private final static long serialVersionUID = 38816411260629458L;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getReasonForRecall() {
        return reasonForRecall;
    }

    public void setReasonForRecall(String reasonForRecall) {
        this.reasonForRecall = reasonForRecall;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCodeInfo() {
        return codeInfo;
    }

    public void setCodeInfo(String codeInfo) {
        this.codeInfo = codeInfo;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getCenterClassificationDate() {
        return centerClassificationDate;
    }

    public void setCenterClassificationDate(String centerClassificationDate) {
        this.centerClassificationDate = centerClassificationDate;
    }

    public String getDistributionPattern() {
        return distributionPattern;
    }

    public void setDistributionPattern(String distributionPattern) {
        this.distributionPattern = distributionPattern;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Openfda getOpenfda() {
        return openfda;
    }

    public void setOpenfda(Openfda openfda) {
        this.openfda = openfda;
    }

    public String getRecallNumber() {
        return recallNumber;
    }

    public void setRecallNumber(String recallNumber) {
        this.recallNumber = recallNumber;
    }

    public String getRecallingFirm() {
        return recallingFirm;
    }

    public void setRecallingFirm(String recallingFirm) {
        this.recallingFirm = recallingFirm;
    }

    public String getInitialFirmNotification() {
        return initialFirmNotification;
    }

    public void setInitialFirmNotification(String initialFirmNotification) {
        this.initialFirmNotification = initialFirmNotification;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Object getMoreCodeInfo() {
        return moreCodeInfo;
    }

    public void setMoreCodeInfo(Object moreCodeInfo) {
        this.moreCodeInfo = moreCodeInfo;
    }

    public String getRecallInitiationDate() {
        return recallInitiationDate;
    }

    public void setRecallInitiationDate(String recallInitiationDate) {
        this.recallInitiationDate = recallInitiationDate;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getVoluntaryMandated() {
        return voluntaryMandated;
    }

    public void setVoluntaryMandated(String voluntaryMandated) {
        this.voluntaryMandated = voluntaryMandated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(country);
        dest.writeValue(city);
        dest.writeValue(reasonForRecall);
        dest.writeValue(address1);
        dest.writeValue(address2);
        dest.writeValue(codeInfo);
        dest.writeValue(productQuantity);
        dest.writeValue(centerClassificationDate);
        dest.writeValue(distributionPattern);
        dest.writeValue(state);
        dest.writeValue(productDescription);
        dest.writeValue(reportDate);
        dest.writeValue(classification);
        dest.writeValue(openfda);
        dest.writeValue(recallNumber);
        dest.writeValue(recallingFirm);
        dest.writeValue(initialFirmNotification);
        dest.writeValue(eventId);
        dest.writeValue(productType);
        dest.writeValue(moreCodeInfo);
        dest.writeValue(recallInitiationDate);
        dest.writeValue(postalCode);
        dest.writeValue(voluntaryMandated);
        dest.writeValue(status);
    }

    public int describeContents() {
        return  0;
    }

}
