package br.com.fparuce.challengebackend.domain.model;

public class ClientModel {
    private Long id;
    private String name;
    private String document;
    private String email;
    private AddressModel addressModel;

    public ClientModel(){}

    public ClientModel(Long id, String name, String document, String email, AddressModel addressModel) {
        this.id = id;
        this.name = name;
        this.document = sanitizeDocument(document);
        this.email = email;
        this.addressModel = addressModel;
    }

    public ClientModel(String name, String document, String email, AddressModel addressModel) {
        this.name = name;
        this.document = sanitizeDocument(document);
        this.email = email;
        this.addressModel = addressModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = sanitizeDocument(document);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressModel getAddressModel() {
        return addressModel;
    }

    public void setAddressModel(AddressModel addressModel) {
        this.addressModel = addressModel;
    }

    private String sanitizeDocument(String document) {
        return document.replaceAll("[^0-9]", "");
    }
}
