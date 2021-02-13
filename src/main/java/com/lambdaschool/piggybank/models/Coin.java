package com.lambdaschool.piggybank.models;

import javax.persistence.*;

@Entity
@Table(name = "coins")

public class Coin
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long coinid;
    private String name;
    private String nameplural;
    private double value;
    private int quantity;

    public Coin(String coinname, String coinnameplural, double value, int quantity) {
        this.name = coinname;
        this.nameplural = coinnameplural;
        this.value = value;
        this.quantity = quantity;
    }

    public Coin()
    {

    }

    public long getCoinid() {
        return coinid;
    }

    public void setCoinid(long coinid) {
        this.coinid = coinid;
    }

    public String getName() {
        return name;
    }

    public void setName(String coinname) {
        this.name = coinname;
    }

    public String getNameplural() {
        return nameplural;
    }

    public void setNameplural(String coinnameplural) {
        this.nameplural = coinnameplural;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "coinid=" + coinid +
                ", coinname='" + name + '\'' +
                ", coinnameplural='" + nameplural + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}
