package com.example.restaurant.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String nom;

    private String adresse;

    private String telephone;

    private String email;

    private List<Table> tables = new ArrayList<>();

    private List<Reservation> reservations = new ArrayList<>();

    public Restaurant() {
    }

    public Restaurant(String nom, String adresse, String telephone, String email) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
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

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", tables=" + tables +
                ", reservations=" + reservations +
                '}';
    }

    public static Restaurant createRestaurant() {
        Restaurant restaurant = new Restaurant("Chez Maria", "1rue de la paix", "0134568793", "maria.t@gmail.com");
        restaurant.addTable(1, 6);
        restaurant.addTable(2, 2);
        restaurant.addTable(3, 4);
        restaurant.addTable(4, 2);
        return restaurant;
    }

    private void addTable(int numeroTable, int nombreCouvert) {

        tables.add(new Table());
    }
}
