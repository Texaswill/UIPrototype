package com.example.jddpbackend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dish", schema = "jddp", catalog = "")
public class DishEntity {
    private Integer dishId;
    private String name;
    private String description;
    private String flavor;
    private int price;
    private int location;
    private int type;
    private int taste;

    private double cos;

    public double getCos() {
        return cos;
    }

    public void setCos(double cos) {
        this.cos = cos;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "dish_id")
    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "flavor")
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Basic
    @Column(name = "price")
    public int getPrice(){return price;}

    @Basic
    @Column(name = "location")
    public int getLocation(){return location;}
    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    @Basic
    @Column(name = "taste")
    public int getTaste(){return taste;}

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setTaste(int taste) {
        this.taste = taste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DishEntity that = (DishEntity) o;

        if (dishId != null ? !dishId.equals(that.dishId) : that.dishId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (flavor != null ? !flavor.equals(that.flavor) : that.flavor != null) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = dishId != null ? dishId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (flavor != null ? flavor.hashCode() : 0);

        return result;
    }

}
