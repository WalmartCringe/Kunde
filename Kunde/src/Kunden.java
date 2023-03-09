public class Kunden extends Person {
    private String Lieferaddresse;
    private int Alter;
//custom konstruktor  Super holt die attribute der Oberklasse
    Kunden ( String name, String nachname, int Alter, String Lieferaddresse){
        super (name, nachname);
        this.Alter = Alter;
        this.Lieferaddresse = Lieferaddresse;
    }
//generate getter
    public String getLieferaddresse() {
        return Lieferaddresse;
    }

    public int getAlter() {
        return Alter;
    }

    public static void main(String[] args) {
        Kunden Radmann = new Kunden("Radman", "Naderinejad", 19, "Erkelenzer");
        System.out.println("Kunde: "+ Radmann.getName() + " - " + Radmann.getNachname() + " ist " + Radmann.getAlter() + "Jahre alt");
    }
}
