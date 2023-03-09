package bibliothek;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SID
 */
public class Buch {

    private String titel;
    private double preis;
    private boolean geliehen;
    private int isbn;
    private ArrayList<Autor> autoren = new ArrayList<Autor>();
    //ArrayList festplatten = new ArrayList<Festplatte>();

    /*Beim Erzeugen jedes Buches darauf achten, dass das Buch mindestens 
    einen Autor in seiner ArrayList hat. Geliehen muss erst immer false sein
    */
    public Buch(String titel, int isbn, ArrayList<Autor> autoren) {
        this.titel = titel;
        this.isbn = isbn;
        this.geliehen = false;
        if (autoren.isEmpty()) {
            throw new IllegalArgumentException("Das Buch muss mindestens einen Autor besitzen");
        } else {
            this.autoren = autoren;
        }
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public boolean isGeliehen() {
        return geliehen;
    }

    public void setGeliehen(boolean geliehen) {
        this.geliehen = geliehen;
    }
    

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public ArrayList getAutoren() {
        return autoren;
    }

    public void setAutoren(ArrayList autoren) {
        this.autoren = autoren;
    }

    public void addAutor(Autor weitrererAutor) {
        this.autoren.add(weitrererAutor);
        //Hier muss eigentlich auch dem Autor gesagt werden,
        //dass er ein Buch hat
        weitrererAutor.addBuch(this);
    }

    public void autorenPrinten() {
        /*Mit der For-Schleife die ArrayList autoren durchlafen 
        und bei jedem Durchlauf den jeweilgen Autor in x speichern
        und den Namen des jeweiligen Autors mit x.getName() ausgeben
        */
        // i dient nur für die Anzeige der Anzahl von Autoren
        int i =1;
        for(Autor x:this.autoren){
            System.out.print(i + "- ");
            System.out.print(x.getName());
            System.out.println("");
            i++;
        }
        
        
    }
}
