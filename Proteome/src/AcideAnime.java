public class AcideAnime {

    public enum CodeCouleur {
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

        private final String acideAnime;
        private final String nomLong;
        private final String nomCourt;

        CodeCouleur(String acideAnime, String nomLong, String nomCourt) {

            this.acideAnime = acideAnime;
            this.nomLong = nomLong;
            this.nomCourt = nomCourt;
        }
    }
}
