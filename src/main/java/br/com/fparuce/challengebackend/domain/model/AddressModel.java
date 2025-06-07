package br.com.fparuce.challengebackend.domain.model;

public class AddressModel {

    private Long id;
    private String street;
    private String number;
    private String complement;
    private String district;
    private String city;
    private String state;
    private String stateInitials;
    private String zipCode;
    private String country;

    public AddressModel(String street, String number, String complement, String district, String city, String state, String stateInitials, String zipCode, String country) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.district = district;
        this.city = city;
        this.state = state;
        this.stateInitials = stateInitials;
        this.zipCode = zipCode;
        this.country = country;
    }

    public AddressModel() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateInitials() {
        return stateInitials;
    }

    public void setStateInitials(String stateInitials) {
        this.stateInitials = stateInitials;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
