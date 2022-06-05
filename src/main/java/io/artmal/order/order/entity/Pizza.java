package io.artmal.order.order.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name="pizzas")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="dough",nullable = false)
    private String dough;

    @Column(name="baseSauce",nullable = false)
    private String baseSauce;

    @Column(name="cheese")
    private String cheese;

    @Column(name="vegetables")
    private String vegetables;

    @Column(name="meat")
    private String meat;

    @Column(name="orgSauces",nullable = false)
    private String orgSauces;

    @Column(name="finish",nullable = false)
    private String finish;

    @Column(name="string")
    private String string;

    public Pizza(){

    }

    public Pizza(String dough, String baseSauce, String cheese, String vegetables, String meat, String orgSauces, String finish, String string) {
        this.dough = dough;
        this.baseSauce = baseSauce;
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.meat = meat;
        this.orgSauces = orgSauces;
        this.finish = finish;
        this.string = string;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getBaseSauce() {
        return baseSauce;
    }

    public void setBaseSauce(String baseSauce) {
        this.baseSauce = baseSauce;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getOrgSauces() {
        return orgSauces;
    }

    public void setOrgSauces(String orgSauces) {
        this.orgSauces = orgSauces;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
