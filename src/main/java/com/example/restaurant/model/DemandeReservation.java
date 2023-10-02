package com.example.restaurant.model;

import java.time.LocalDateTime;

public class DemandeReservation {

    private int nombreCouvert;
    private LocalDateTime horaire;

    private String prenom;

    private String nom;

    public DemandeReservation() {
    }

    public DemandeReservation(int nombreCouvert, LocalDateTime horaire, String prenom, String nom) {
        this.nombreCouvert = nombreCouvert;
        this.horaire = horaire;
        this.prenom = prenom;
        this.nom = nom;
    }

    public int getNombreCouvert() {
        return nombreCouvert;
    }

    public void setNombreCouvert(int nombreCouvert) {
        this.nombreCouvert = nombreCouvert;
    }

    public LocalDateTime getHoraire() {
        return horaire;
    }

    public void setHoraire(LocalDateTime horaire) {
        this.horaire = horaire;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "DemandeReservation{" +
                "nombreCouvert=" + nombreCouvert +
                ", horaire=" + horaire +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
