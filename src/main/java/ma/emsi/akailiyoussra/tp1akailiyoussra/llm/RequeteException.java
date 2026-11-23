package ma.emsi.akailiyoussra.tp1akailiyoussra.llm;

/**
 * Exception lancée quand la requête envoyée à l'API du LLM ne s'est pas bien passée.
 * Elle peut contenir le texte JSON de la requête qui a provoqué l'erreur.
 */
public class RequeteException extends Exception {

    /**
     * Texte JSON de la requête qui a provoqué l'erreur (peut être null).
     */
    private String requeteJson;

    public RequeteException() {
        super();
    }

    public RequeteException(String message) {
        super(message);
    }

    public RequeteException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequeteException(String message, String requeteJson) {
        super(message);
        this.requeteJson = requeteJson;
    }

    public String getRequeteJson() {
        return requeteJson;
    }
}