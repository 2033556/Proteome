import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class
Proteome {
    private TreeSet<Proteines> proteinesTreeSet = new TreeSet<Proteines>();


    public void ajouterProteine(Proteines proteines) {
        proteinesTreeSet.add(proteines);
    }

    public List<Proteines> rechercherNomCourtExact(String nomCourt) {
        List<Proteines> proteinesList = new ArrayList<>();
        Proteines proteines = new Proteines(nomCourt);
        if (proteinesTreeSet.contains(proteines)) {
            proteinesList.add(proteinesTreeSet.floor(proteines));
            return proteinesList;
        } else {
            return rechercherNomLong(nomCourt);
        }
    }
    public List<Proteines> rechercherNomLong(String string){
        List<Proteines> proteinesList = new ArrayList<>();
        for(Proteines proteines:proteinesTreeSet){
            if(proteines.getNomLong().contains(string)){
                proteinesList.add(proteines);
            }
        }
        return proteinesList;
    }
    public List<Proteines> rechercherSequence(String sequence){
        List<Proteines> proteinesList = new ArrayList<>();
        Map<AcideAmines, Integer> mapSequenceUtilisateur = AcideAmines.lireAcidesAmines(sequence);

        for(Proteines proteines:proteinesTreeSet){
            Map<AcideAmines, Integer> mapSequenceProteine = AcideAmines.lireAcidesAmines(proteines.getSequence());
            for(AcideAmines acideAmines:mapSequenceProteine.keySet()){
                int nbsAcide = mapSequenceUtilisateur.get(acideAmines);
                if(nbsAcide > a)
                }

            }

                proteinesList.add(proteines);

        }
     return proteinesList;
    }
}
