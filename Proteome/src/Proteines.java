public class Proteines implements Comparable<Proteines> {

    private String nomCourt;

    public String getNomCourt() {
        return nomCourt;
    }

    public void setNomCourt(String nomCourt) {
        this.nomCourt = nomCourt;
    }

    @Override
    public int compareTo(Proteines o) {
        if(nomCourt > o.nomCourt
    }
}
