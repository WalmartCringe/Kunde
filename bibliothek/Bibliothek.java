/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliothek;

import java.util.ArrayList;

/**
 *
 * @author SID
 */
public class Bibliothek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Autor> autoren1 = new ArrayList<>();
        //Buch b = new Buch("Java für Anfänger", 12345, autoren1);
        //System.out.println(b);
        
        ArrayList<Autor> autoren2 = new ArrayList<>();
        ArrayList<Autor> autoren3 = new ArrayList<>();
        ArrayList<Autor> autoren4 = new ArrayList<>();
        
        Autor a1 = new Autor("Hans Mustermann");
        Autor a2 = new Autor("Franz Macher");
        Autor a3 = new Autor("Peter Maler");
        Autor a4 = new Autor("PaulaKlam");
        Autor a5 = new Autor("Felix Daum");
        Autor a6 = new Autor("PeteraWoller");
        
        autoren1.add(a1);
        autoren1.add(a2);
        autoren1.add(a3);
        autoren2.add(a4);
        autoren3.add(a5);
        autoren4.add(a6);
        
        Buch b1 = new Buch("PHP für Anfänger (Buch1)", 1, autoren1);
        Buch b2 = new Buch("MySQL für Anfänger (Buch2)", 2, autoren1);
        Buch b3 = new Buch("HTML für Anfänger (Buch3)", 3, autoren2);
        Buch b4 = new Buch("CSS für Anfänger (Buch4)", 4, autoren3);
        Buch b5 = new Buch("Informatik für Anfänger (Buch5)", 5, autoren4);
        Buch b6 = new Buch("Suche nach dem Schatz (Buch6)", 6, autoren4);
        Buch b7 = new Buch("Werder Bremen - Top (Buch7)", 7, autoren4);
        
        
        b1.autorenPrinten();
        
        
        Kunde k1 = new Kunde("Kunde ist Köning", 1111);
        
        k1.buchAusleihen(b1);
        k1.buchAusleihen(b2);
        k1.buchAusleihen(b3);
        k1.buchAusleihen(b4);
        k1.buchAusleihen(b4);
        k1.buchAusleihen(b5);
        //k1.buchAusleihen(b6);
        
        System.out.println("-----");
        k1.gelieheneBuecherPrinten();
        System.out.println("-----");
        
        k1.buchZurueckgeben(b3);
        k1.buchZurueckgeben(b3);
        k1.buchZurueckgeben(b7);
        System.out.println("------");
        k1.gelieheneBuecherPrinten();

        //Buch[] bk1 = new Buch[5];
        //bk1 = k1.getBuecherKunde();
        //bk1[1].getTitel();
    }
    
}
