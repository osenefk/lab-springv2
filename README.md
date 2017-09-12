# lab-springv2
Ce projet est une mavenisation du projet lab-springv1. 
Il mets en oeuvre l'injection de dependances avec Spring via un fichier de configuration xml
L'application est repartie en trois couches à savoir :
- La couche persistence : contient les classes POJO
- La couche dao : contient les classes accés aux données (Interface + classe Implementant l'interface)
- La couche service : contient les classes implémentant la logique métier de l'application. 
La dependance entre la couche dao et la couche service est gérée par spring : Injection de l'interface dao par auto-cablage "autowire"(on parle de couplage faible)
- Et la couche presentation : contient la classe principale pour l'execution du projet
