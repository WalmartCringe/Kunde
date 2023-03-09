package bibliothek;

import java.util.ArrayList;

/**
 * @author SID
 */

public class Autor extends Person{
    private ArrayList<Buch> buecherVonAutor = new ArrayList<Buch>();

    //super(name) verwendet den Konstruktor der Superklasse
    public Autor(String name) {
        super(name);
    }
    
    public Autor(String name, ArrayList<Buch> buecherVonAutor) {
        super(name);
        this.buecherVonAutor = buecherVonAutor;
    }
    
    
    public ArrayList<Buch> getBuecherVonAutor() {
        return buecherVonAutor;
    }
    
    public void setBuecherVonAutor(ArrayList<Buch> buecherVonAutor) {
        this.buecherVonAutor = buecherVonAutor;
    }
    
    public void addBuch(Buch b){
        this.buecherVonAutor.add(b);
    }
    
    public void buecherVomAutorAusgeben(){
        /*Mit der For-Schleife die ArrayList buecherVomAutor durchlafen 
        und bei jedem Durchlauf das jeweilge Buch in x speichern
        und den Titel sowie die ISBN des jeweiligen Buches mit x.getTitel() 
        und x.Isbn ausgeben
        */
        //i dient nur für die Anzeige der vom Autor geschriebenen Bücher 
        int i= 1;
        for(Buch x:this.buecherVonAutor){
            //System.out.println(i);
            System.out.print(x.getTitel() + " " + x.getIsbn());
            System.out.println("");
        }
        
    }
    
}
