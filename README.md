# Demo OpenRewrite
Simple projet de demo OprenRewrite 

Profile **rewrite** pour excuter les recettes simples de demo de l'outil

Utilisation des recettes OpenRewrite
----------------------------------

- Recettes permettant de rechercher et de mettre à une dépendance Maven
  - org.openrewrite.maven.search.DependencyInsight
  - org.openrewrite.maven.UpgradeDependencyVersion
- Recette permettant de moderniser le code Java
  - org.openrewrite.java.migrate.UpgradeToJava17
- Recette permettant de supprimer les imports inutilisés
  - org.openrewrite.java.RemoveUnusedImports