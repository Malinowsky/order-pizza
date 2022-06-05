package io.artmal.order.order.entity;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "telephone",nullable = false)
    private String telephone;
    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "street",nullable = false)
    private String street;
    @Column(name = "zip_code",nullable = false)
    private Long zipCode;
    @Column(name = "number_of_the_building",nullable = false)
    private String numberBuilding; //number of the building
    @Column(name = "city",nullable = false)
    private String city;

    @Column(name = "floor")
    private String floor;
    @Column(name = "code_to_the_gate")
    private String codeGate; // code to the gate
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "additional_note")
    private String additionalNote;

    public Person(String firstName, String lastName, String telephone, String email, String street, Long zipCode, String numberBuilding, String city, String floor, String codeGate, String companyName, String additionalNote) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.email = email;
        this.street = street;
        this.zipCode = zipCode;
        this.numberBuilding = numberBuilding;
        this.city = city;
        this.floor = floor;
        this.codeGate = codeGate;
        this.companyName = companyName;
        this.additionalNote = additionalNote;
    }

    public Person() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getZipCode() {
        return zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }

    public String getNumberBuilding() {
        return numberBuilding;
    }

    public void setNumberBuilding(String numberBuilding) {
        this.numberBuilding = numberBuilding;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getCodeGate() {
        return codeGate;
    }

    public void setCodeGate(String codeGate) {
        this.codeGate = codeGate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAdditionalNote() {
        return additionalNote;
    }

    public void setAdditionalNote(String additionalNote) {
        this.additionalNote = additionalNote;
    }
}
