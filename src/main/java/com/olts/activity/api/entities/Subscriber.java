package com.olts.activity.api.entities;

/**
 * o.tsoy
 * 23.03.2017
 */
public class Subscriber {

    private int id;
    private String name;


    private String refTariff;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRefTariff() {
        return refTariff;
    }

    public void setRefTariff(String refTariff) {
        this.refTariff = refTariff;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", refTariff='" + refTariff + '\'' +
                '}';
    }
}
