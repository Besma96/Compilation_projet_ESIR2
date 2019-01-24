# Compilation_projet_ESIR2
Ce projet a pour vocation de développé un compilateur du langage WHILE vers le langage PYTHON.
Ce projet est réalisé par BARRY Daouda, HROUCH Mohammed, BALLO Oumar, KOUASSI Roland, JARNOUEN Salomé, KAOUANE Besma

# Principe
La réalisation de ce projet nous a permis de mieux apréhender la problématique de la génération de code.
La spécification du langage WHILE, son typage et sa sémantique sont situés dans le dossier Documents du répertoire.
Le langage WHILE n'étant pas compilé, nous traduisons ce dernier dans un langage compilé qui est pour notre cas du PYTHON
# Fonctionnement
Dans ce projet nous avons eu à manipuler deux différents aspects du WHILE dont l'un était axé sur la réalisation
d'un pretty-printer et l'autre sur la réalisation du compilateur proprement dit.
## Partie pretty-printer
Le pretty-printer avait pour objectif de prendre un fichier WHILE en entrée mal formaté et en sortir un autre 
contenant le même programme mais bien formaté. Pour l'utiliser il suffit d'utiliser le script ` whpp ` sur 
un terminal en mettant le fichier à formater comme premier argument et celui de sortie comme second argument.
Pour plus d'infos faire la commane `whpp -h ` pour obtenir de l'aide.
## Partie compilateur
Dans cette partie nous avons réalisé le compilateur proprement dit. Il s'agit de la traduction d'un programme
WHILE en un exécutable PYTHON. Pour le lancer il faut utiliser le script **whc_Python** comme suit :
` whc_Python fichierEntree.wh fichierSortie.py `, cette commande va traduire le fichier WHILE en python
qu'on pourra par la suite exécuter comme suit : ` python3 fichierSortie.py 1 2 par exemple `.
# Organisation du repository
