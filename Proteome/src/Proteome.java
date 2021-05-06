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
    public boolean assezOuPasAssez(Map<AcideAmines, Integer> mapSequenceUtilisateur, Map<AcideAmines,Integer> mapSequenceProteine) {
        for (AcideAmines acideAmines : mapSequenceProteine.keySet()) {
            int nbsAcideProt = mapSequenceProteine.getOrDefault(acideAmines, 0);
            int nbsAcideUtilisateur = mapSequenceUtilisateur.getOrDefault(acideAmines, 0);
            if (nbsAcideProt > nbsAcideUtilisateur) {
                return false;
            }
        }
        return true;
    }
    public List<Proteines> rechercherSequence(String sequence){
        List<Proteines> proteinesList = new ArrayList<>();
        Map<AcideAmines, Integer> mapSequenceUtilisateur = AcideAmines.lireAcidesAmines(sequence);
        for(Proteines proteines:proteinesTreeSet){
            Map<AcideAmines, Integer> mapSequenceProteine = AcideAmines.lireAcidesAmines(proteines.getSequence());
            if (assezOuPasAssez(mapSequenceUtilisateur, mapSequenceProteine)){
                proteinesList.add(proteines);
            }
        }
     return proteinesList;
    }
}