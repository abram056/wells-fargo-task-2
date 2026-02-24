package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    
    @Id
    @GenerationValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @Column
    private String name;

    @Column
    private String creation_date;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    private Portfolio() {

    }

    public Portfolio (String name, String creation_date) {
        this.name = name;
        this.creation_date = creation_date;
    }

    public long getPorfolioId() {
        return this.portfolioId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatiionDate() {
        return this.creation_date;
    }

    public void setCreationDate(String creation_date) {
        this.creation_date = creation_date;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
