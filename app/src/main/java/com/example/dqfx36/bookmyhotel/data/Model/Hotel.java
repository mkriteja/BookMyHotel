package com.example.dqfx36.bookmyhotel.data.Model;

/**
 * Created by DQFX36 on 9/7/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hotel {

    @SerializedName("starRating")
    @Expose
    private String starRating;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("loyaltyPointsEarned")
    @Expose
    private String loyaltyPointsEarned;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("hotelImageURL")
    @Expose
    private String hotelImageURL;
    @SerializedName("guestRating")
    @Expose
    private String guestRating;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("hotelName")
    @Expose
    private String hotelName;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("discountMessage")
    @Expose
    private String discountMessage;

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLoyaltyPointsEarned() {
        return loyaltyPointsEarned;
    }

    public void setLoyaltyPointsEarned(String loyaltyPointsEarned) {
        this.loyaltyPointsEarned = loyaltyPointsEarned;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHotelImageURL() {
        return hotelImageURL;
    }

    public void setHotelImageURL(String hotelImageURL) {
        this.hotelImageURL = hotelImageURL;
    }

    public String getGuestRating() {
        return guestRating;
    }

    public void setGuestRating(String guestRating) {
        this.guestRating = guestRating;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscountMessage() {
        return discountMessage;
    }

    public void setDiscountMessage(String discountMessage) {
        this.discountMessage = discountMessage;
    }
}


