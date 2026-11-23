package ma.emsi.akailiyoussra.tp1akailiyoussra.llm;

/**
 * Résultat d'une interaction avec l'API du LLM.
 * L'ordre des membres correspond à l'appel fait dans JsonAdapterPourGemini.envoyerRequete.
 *
 * @param questionJson    le texte JSON de la requête envoyée à l'API du LLM (affiché en mode debug).
 * @param reponseJson     le texte JSON de la réponse de l'API du LLM (affiché en mode debug).
 * @param reponseExtraite la réponse du LLM sous forme de texte simple (affichée à l'utilisateur).
 */
public record LlmInteraction(String questionJson, String reponseJson, String reponseExtraite) {
}