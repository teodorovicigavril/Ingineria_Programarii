package com.company;

abstract class Vehicule {
    Sosea locatie;
    private int nrRoti;
    private double dimensiune;

    abstract void scop();
    void afisare() {
        System.out.println("Sunt un vehicul!");
    }

    void afisareLocatie(){
        System.out.println("Ma aflu pe soseaua dintre intersectiile: " + locatie.getIntersectia1() + " si " + locatie.getIntersectia2() + ".");
    }

    public int getNrRoti() {
        return nrRoti;
    }

    public double getDimensiune() {
        return dimensiune;
    }

    public void setNrRoti(int nrRoti) {
        this.nrRoti = nrRoti;
    }

    public void setDimensiune(double dimensiune) {
        this.dimensiune = dimensiune;
    }
}

class Salvare extends Vehicule {
    private int nrPacienti;

    void scop() {
        System.out.println("Scopul meu este de a salva vieti!");
    }
    void afisare() {
        System.out.println("Sunt o salvare, am " + getNrRoti() + " roti, " + getDimensiune() + " tone si pot transporta " + nrPacienti + " pacienti.");
    }

    public String toString(){//overriding the toString() method
        String aux = "Sunt o salvare, am " + getNrRoti() + " roti, " + getDimensiune() + " tone si pot transporta " + nrPacienti + " pacienti.";
        return aux;
    }

    public int getNrPacienti() {
        return nrPacienti;
    }

    Salvare(int nrRoti, double dimensiune, int nrPacienti, int intersectia1, int intersectia2){
        this.setNrRoti(nrRoti);
        this.setDimensiune(dimensiune);
        this.nrPacienti = nrPacienti;

        locatie = new Sosea(intersectia1, intersectia2);
    }
}

class Pompieri extends Vehicule {
    private int capacitateApa;

    void scop() {
        System.out.println("Scopul meu este de a stinge incendiile!");
    }

    public String toString(){//overriding the toString() method
        String aux = "Sunt o masina de pompieri, am " + getNrRoti() + " roti, " + getDimensiune() + " tone si o capacitate de apa de " + capacitateApa + "litri!";
        return aux;
    }

    void afisare() {
        System.out.println("Sunt o masina de pompieri, am " + getNrRoti() + " roti, " + getDimensiune() + " tone si o capacitate de apa de " + capacitateApa + "litri!");
    }

    public int getCapacitateApa() {
        return capacitateApa;
    }

    Pompieri(int nrRoti, double dimensiune, int capacitateApa, int intersectia1, int intersectia2){
        this.setNrRoti(nrRoti);
        this.setDimensiune(dimensiune);
        this.capacitateApa = capacitateApa;

        locatie = new Sosea(intersectia1, intersectia2);
    }
}

class Autovehicul extends Vehicule {
    private String marca;
    private String model;

    public String toString(){//overriding the toString() method
        String aux = "Sunt un autovehicul " + marca + " "+ model + ", am " + getNrRoti() + " roti si dimensiunea de " + getDimensiune() + " tone.";
        return aux;
    }

    void scop() {
        System.out.println("Scopul meu este de a transporta oameni!");
    }

    void afisare() {
        System.out.println("Sunt un autovehicul " + marca + " "+ model + ", am " + getNrRoti() + " roti si dimensiunea de " + getDimensiune() + " tone.");
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    Autovehicul(int nrRoti, double dimensiune, String marca, String model,  int intersectia1, int intersectia2){
        this.setNrRoti(nrRoti);
        this.setDimensiune(dimensiune);
        this.marca = marca;
        this.model = model;

        locatie = new Sosea(intersectia1, intersectia2);
    }
}

class Sosea {
    private int intersectia1;
    private int intersectia2;

    public int getIntersectia1() {
        return intersectia1;
    }

    public int getIntersectia2() {
        return intersectia2;
    }

    Sosea(int intersectia1, int intersectia2) {
        this.intersectia1 = intersectia1;
        this.intersectia2 = intersectia2;
    }
}

public class Main {

    public static void main(String[] args) {

    Salvare a = new Salvare(6,3.4,2, 5, 7);
    a.afisare();
    a.afisareLocatie();
    a.scop();

    System.out.println("\n");

    Pompieri b = new Pompieri(8, 4, 200, 1, 2);
    b.afisare();
    b.afisareLocatie();
    b.scop();

    System.out.println("\n");

    Autovehicul c = new Autovehicul(8, 4, "Audi", "A4", 2, 10);
    c.afisare();
    c.afisareLocatie();
    c.scop();

        System.out.println("\n");
        System.out.println(c);
    }
}
