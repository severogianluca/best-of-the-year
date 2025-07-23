package org.lessons.java.best_of_the_year.classes;

public class Song {
    private int id;
    private String titolo;
    private String nomeArtista;

    public Song() {

    }

    public Song(int id, String titolo, String nomeArtista) {
        this.id = id;
        this.titolo = titolo;
        this.nomeArtista = nomeArtista;
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

    public String getNomeArtista() {
        return this.nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }
}
