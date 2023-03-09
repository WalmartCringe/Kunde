//extends
public class Mitarbeiter extends Person {
    private String id;
    private boolean arbeit;
    private int gehalt;
    //custom konstruktor
    Mitarbeiter (String name, String nachname, String id, boolean arbeit, int gehalt){
        super(name, nachname);
        this.id = id;
        this.arbeit = arbeit;
        this.gehalt = gehalt;
    }
//Getter
    public String getId() {
        return id;
    }

    public boolean isArbeit() {
        return arbeit;
    }

    public int getGehalt() {
        return gehalt;
    }
//strings keine leerzeichen machen!!   boolean mit name von klasse .isArbeit
    public static void main(String[] args){
        Mitarbeiter Jan = new Mitarbeiter( "Jan ", "Bartels \n", "AFK69 \n", true, 6666);
        System.out.println("Mitarbeiter1: "+ Jan.getName() + Jan.getNachname() + "- Id: " + Jan.getId()+ "- am arbeiten: "+ Jan.isArbeit());
    }
}
