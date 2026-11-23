# Utilisation de l'IA pour le TP 1 — Youssra Akaili

## Outil utilisé
- **Claude** (Anthropic), en conversation, le 22 et 23/11/2026.

## Ce que l'IA a fait
- A écrit le panel "debug" et le `toggleSwitch` dans `index.xhtml`.
- A modifié `Bb.java` : propriétés `debug`, `texteRequeteJson`, `texteReponseJson`,
  injection de `JsonAdapterPourGemini` et appel de `envoyerRequete`.
- A écrit le record `LlmInteraction` et la classe `RequeteException`.
- A complété les 2 endroits de `LlmClientPourGemini` (lecture de `GEMINI_KEY`, URL de l'endpoint).
- M'a aidée à diagnostiquer les erreurs (JDK perdu par IntelliJ, modèle Gemini plus disponible,
  problème de réseau, historique perdu après "Nouveau chat").
- M'a aidée à rédiger l'explication du JSON pour le mail.

## Ce que j'ai fait moi-même
- Création de le `pom.xml` du TP 1 à partir de celui du TP 0.
- Création de la clé Gemini, du dépôt GitHub et du projet dans IntelliJ.
- Exécution de l'application sur Payara et tous les tests.
- Provocation des 2 erreurs (clé fausse, rôle "system") et retour au code avec `git restore .`.
- Choix du rôle système "Coach de révision" git add .ai.
- Commits et push sur GitHub.

## Code fourni par le prof (non généré par l'IA)
- `JsonAdapterPourGemini.java` (seul le nom du package a été modifié).
- Squelette de `LlmClientPourGemini.java`.
- `index.xhtml`, `Bb.java`, CSS et JS repris du TP 0.