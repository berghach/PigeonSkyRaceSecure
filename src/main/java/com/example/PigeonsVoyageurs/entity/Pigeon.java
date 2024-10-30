package com.example.PigeonsVoyageurs.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "pigeons")
public class Pigeon {
    @Id
    private String bagueNumber;
    private char sexe;
    private int age;
    private String color;
    // Relation Many-to-One avec Breeder
    @DBRef
    private Breeder breeder;
    // Relation Many-to-Many avec Competition
    @DBRef
    private List<Competition> competitions;

    public Pigeon(String bagueNumber, char sexe, int age, String color, Breeder breeder) {
        this.bagueNumber = bagueNumber;
        this.sexe = sexe;
        this.age = age;
        this.color = color;
        this.breeder = breeder;
    }

    public String getBagueNumber() {
        return bagueNumber;
    }

    public void setBagueNumber(String bagueNumber) {
        this.bagueNumber = bagueNumber;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Breeder getBreeder() {
        return breeder;
    }

    public void setBreeder(Breeder breeder) {
        this.breeder = breeder;
    }

    // Getters and Setters
}