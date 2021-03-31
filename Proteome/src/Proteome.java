import java.util.TreeSet;

public class Proteome {
    TreeSet<Proteines> proteinesTreeSet = new TreeSet<Proteines>();

    public void ajouterProteine(Proteines proteines){
        proteinesTreeSet.add(proteines);
    }


    public Proteines rechercherNomCourtExact(String nomCourt) {
       Proteines proteines = new Proteines(nomCourt);
       if(proteinesTreeSet.contains(proteines)== true){
           return proteines;
       }
       else{
           return null;
       }
    }
}
