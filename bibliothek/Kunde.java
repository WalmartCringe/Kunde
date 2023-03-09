package bibliothek;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SID
 */
public class Kunde extends Person {

    private int kundenNr;
    private Buch[] buecherKunde = new Buch[5];

    public Kunde(String name, int kundenNr) {
        super(name);
        this.kundenNr = kundenNr;
    }

    public Kunde(String name, int KundenNr, Buch[] buecherKunde) {
        super(name);
        this.kundenNr = KundenNr;
        this.buecherKunde = buecherKunde;
    }

    public int getKundenNr() {
        return kundenNr;
    }

    public void setKundenNr(int kundenNr) {
        this.kundenNr = kundenNr;
    }

    public Buch[] getBuecherKunde() {
        return buecherKunde;
    }

    public void setBuecherKunde(Buch[] buecherKunde) {
        this.buecherKunde = buecherKunde;
    }

    public boolean buchAusleihen(Buch b) {
        boolean geklappt = false;
        for (int i = 0; i < buecherKunde.length; i++) {
            if (buecherKunde[i] == null && !b.isGeliehen()) {
                buecherKunde[i] = b;
                //Sehr wichtig, das Buch als geliehen markieren
                b.setGeliehen(true);
                geklappt = true;
                break;
            }
        }
        if (!geklappt) {
            System.out.println("--> Ein weiteres Buch darf der Kunde - "
                    + this.getName() + " - nicht ausleihen");
            System.out.println("--> Oder Das Buch - " + b.getTitel() + " - schon geliehen");
        }
        return geklappt;
    }

    public boolean buchZurueckgeben(Buch b) {
        boolean geklappt = false;
        
        /*while-Schleife zum Durchsuchen von Array (BuecherKunde)
        solange das Ende 
        */
        int i = 0;
        while(i < buecherKunde.length && buecherKunde[i]!=null){
            if(buecherKunde[i].getIsbn() == b.getIsbn()){
                buecherKunde[i] = null;
                geklappt = true;
                System.out.println("Das Buch - " + b.getTitel() + " - ist zurückgegeben worden");
                //Wichitg -> das Buch als nicht geliehen zu setzen
                b.setGeliehen(false);
            }
            i++;
        }
        /*//Mit Forschleife geht es auch
        for (int i = 0; i < buecherKunde.length; i++) {
            if(buecherKunde[i]!=null){
                if (buecherKunde[i].equals(b)) {
                    buecherKunde[i] = null;
                    geklappt = true;
                    System.out.println("Das Buch - " + b.getTitel() + " - ist zurückgegeben worden");
                }
            }
        }*/
        
        if (!geklappt) {
            System.out.println("Das Buch - " + b.getTitel() + " - kann NICHT zurückgegeben worden");
        }
        return geklappt;
    }

    public void gelieheneBuecherPrinten() {
        for (int i = 0; i < buecherKunde.length; i++) {
            if (buecherKunde[i] != null) {
                Buch buch = buecherKunde[i];
                System.out.print((i + 1) + "- " + buch.getTitel());
                System.out.println("");
            }else{
                System.out.println("");
            }

        }

    }

}
