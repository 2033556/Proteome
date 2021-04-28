public class Erreur extends Exception {
    private String messageErreur;

    public Erreur(String messageErreur) {
        this.messageErreur = messageErreur;
    }

    public Erreur(String message, String messageErreur) {
        super(message);
        this.messageErreur = messageErreur;
    }

    public Erreur(String message, Throwable cause, String messageErreur) {
        super(message, cause);
        this.messageErreur = messageErreur;
    }

    public Erreur(Throwable cause, String messageErreur) {
        super(cause);
        this.messageErreur = messageErreur;
    }

    public Erreur(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String messageErreur) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.messageErreur = messageErreur;
    }
}
