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
        int delta = nomCourt.compareTo(o.nomCourt);
        if(delta > 0){
            return -1;
        }
        if(delta < 0){
            return 1;
        }
        else  {
            return 0;
        }
    }
}
