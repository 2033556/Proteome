import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public enum AcideAmines {
    A("Alanine", "Ala", "A"),
    C("Cysteline", "Cys", "C"),
    D("Aspartate", "Asp", "D"),
    E("Glutamate", "Glu", "E"),
    F("Phenylalanie", "Phe", "F"),
    G("Glycine", "Gly", "G"),
    H("Histidine", "His", "H"),
    I("Isoleucine", "Ile", "I"),
    K("Lysine", "Lys", "K"),
    L("Leucine", "Leu", "L"),
    M("Methionine", "Met", "M"),
    N("Asparagine", "Asn", "N"),
    P("Proline", "Pro", "P"),
    Q("Glutamine", "Glu", "Q"),
    R("Arginine", "Arg", "R"),
    S("Serine", "Ser", "S"),
    T("Threonine", "Thr", "T"),
    V("Valine", "Val", "V"),
    W("Tryptophane", "Trp", "W"),
    Y("Tyrosine", "Tyr", "Y");

    private final String acideAmine;
    private final String nomLong;
    private final String nomCourt;

    AcideAmines(String acideAmine, String nomLong, String nomCourt) {

        this.acideAmine = acideAmine;
        this.nomLong = nomLong;
        this.nomCourt = nomCourt;
    }

    public static Map<AcideAmines, Integer> lireAcidesAmines(String sequence) {
        int chiffreSignificatif;
        Map<AcideAmines, Integer> map = new HashMap<>();
        Pattern patronSequence = Pattern.compile("^[ACDEFGHIKLMNPQRSTVWY]+$");
        for(int i = 0; i < sequence.length(); i++){
            Matcher matche = patronSequence.matcher(sequence.substring(i, i+1));
            if(!matche.find()) {
                chiffreSignificatif = Integer.parseInt(sequence.substring(i, i+1));
                System.out.println(chiffreSignificatif);

            }
            if(matche.find()){
               if (map.containsKey(AcideAmines.valueOf(sequence.substring(i, i + 1)))) {
                    map.replace(AcideAmines.valueOf(sequence.substring(i, i + 1)), map.get(AcideAmines.valueOf(sequence.substring(i, i + 1))) + 1);
                } else {
                    map.put(AcideAmines.valueOf(sequence.substring(i, i + 1)), 1);
                }
            }
        }



        /*if (matche.find()) {
            for (int i = 0; i < sequence.length(); i++) {
                if (map.containsKey(AcideAmines.valueOf(sequence.substring(i, i + 1)))) {
                    map.replace(AcideAmines.valueOf(sequence.substring(i, i + 1)), map.get(AcideAmines.valueOf(sequence.substring(i, i + 1))) + 1);
                } else {
                    map.put(AcideAmines.valueOf(sequence.substring(i, i + 1)), 1);
                }
            }
        }*/
        return map;
    }

}