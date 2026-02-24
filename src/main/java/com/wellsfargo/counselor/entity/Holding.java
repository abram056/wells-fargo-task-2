package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Holding {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long holding_id;

    @Column
    private String purchased_date;

    @Column
    private String purchased_price;

    @Column
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Porfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "securityId")
    private Security security;

    protected Holding() {

    }

    public Holding (String purchased_date, String purchased_price, int quantity) {
        this.purchased_date = purchased_date;
        this.purchased_price = purchased_price;
        this.quantity = quantity;
    }

    public long getHoldingId() {
        return this.holding_id;
    }

    public String getPurchaseDate() {
        return this.purchased_date;
    }

    public void setPurchaseDate(String purchased_date) {
        this.purchased_date = purchased_date;
    }

    public String getPurchasePrice() {
        return this.purchased_price = purchased_price;
    }

    public void setPurchasePrice() {
        this.purchased_price = purchased_price;
    }

    public int getQuantity () {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPortfolio (Porfolio porfolio) {
        this.portfolio = portfolio;
    }

    public void setSecurity(Security securityId) {
        this.security = security;
    }
}

