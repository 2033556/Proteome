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
        nomCourt.compareTo(o.nomCourt);
        if(nomCourt > o.nomCourt){
            return -1;
        }
        if(nomCourt < o.nomCourt){
            return 1;
        }
        if(nomCourt == o.nomCourt){
            return 0;
        }
    }
}
