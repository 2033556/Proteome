import java.util.Objects;

public class Proteines implements Comparable<Proteines> {

    private String nomCourt;

    public Proteines(String nomCourt) {
        this.nomCourt = nomCourt;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proteines proteines = (Proteines) o;
        return Objects.equals(nomCourt, proteines.nomCourt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomCourt);
    }
}
