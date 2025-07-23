package org.lessons.java.best_of_the_year.classes;


public class Movie {
    private int id;
    private String titolo;
    private int durataMin;

    Movie() {

    }

    public Movie(int id, String titolo, int durataMin) {
        this.id = id;
        this.titolo = titolo;
        this.durataMin = durataMin;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurataMin() {
        return this.durataMin;
    }

    public void setDurataMin(int durataMin) {
        this.durataMin = durataMin;
    }

    public String getTitle(){
        return String.format("%s, ", titolo);
    }

}
