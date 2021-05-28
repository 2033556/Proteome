package Utilitaires;

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
    O("Pyl", "Pyrrolysine", "O"),
    P("Proline", "Pro", "P"),
    Q("Glutamine", "Glu", "Q"),
    R("Arginine", "Arg", "R"),
    S("Serine", "Ser", "S"),
    T("Threonine", "Thr", "T"),
    U("Sec", "Sélénocystéine", "U"),
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

    public String rechercherUneProteine() {
        return "Nom court: " + nomCourt + ", nom long: " + nomLong + ", acide amine: " + acideAmine;
    }

    public static Map<AcideAmines, Integer> lireAcidesAmines(String sequence) throws IllegalArgumentException {
        int chiffreSignificatif = 0;
        Map<AcideAmines, Integer> map = new HashMap<>();
        Pattern lettresEtChiffres = Pattern.compile("^(([1-9][0-9]*)*[ACDEFGHIKLMNOPQRSTUVWY]+)*$");
        Matcher matcheChiffreEtLetrre = lettresEtChiffres.matcher(sequence);
        if (matcheChiffreEtLetrre.find()) {
            for (int i = 0; i < sequence.length(); i++) {
                Pattern patronSequence = Pattern.compile("[ACDEFGHIKLMNOPQRSTUVWY]");
                Matcher matche = patronSequence.matcher(sequence.substring(i, i + 1));
                if (!matche.find()) {
                    chiffreSignificatif = chiffreSignificatif * 10;
                    chiffreSignificatif += Integer.parseInt(sequence.substring(i, i + 1));
                } else {
                    if (chiffreSignificatif == 0) {
                        chiffreSignificatif = 1;
                    }
                    if (map.containsKey(AcideAmines.valueOf(sequence.substring(i, i + 1)))) {
                        map.replace(AcideAmines.valueOf(sequence.substring(i, i + 1)), map.get(AcideAmines.valueOf(sequence.substring(i, i + 1))) + chiffreSignificatif);
                    } else {
                        map.put(AcideAmines.valueOf(sequence.substring(i, i + 1)), chiffreSignificatif);

                    }
                    chiffreSignificatif = 0;
                }
            }
            return map;
        } else {
            throw new IllegalArgumentException("La string entrée n'est pas valide");
        }
    }
}