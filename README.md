# 🦁 Projet de gestion d'animaux et d'employés 🧑‍💼

Bienvenue dans le projet de gestion d'animaux dans un zoo, d'employés dans une société, ainsi que d'étudiants. Ce projet est structuré en plusieurs étapes (prosits), chaque étape se concentrant sur une fonctionnalité spécifique, de la gestion des animaux à la gestion des employés et des étudiants. Découvrez les différentes parties du projet ci-dessous avec des liens vers le code source pour chaque prosit.

## Structure du Projet 🗂️

ZooManagement/
|-- .gitignore  
|-- README.md  
|-- src/  
    |-- tn/  
        |-- esprit/  
            |-- gestionzoo/  
            |   |-- main/  
            |   |   |-- Main.java  
            |   |-- entities/  
            |       |-- Animal.java  
            |       |-- Aquatic.java  
            |       |-- Terrestrial.java  
            |       |-- Dolphin.java  
            |       |-- Penguin.java  
            |       |-- Zoo.java  
            |       |-- Food.java  
            |       |-- Carnivore.java  
            |       |-- Herbivore.java  
            |       |-- Omnivore.java  
            |       |-- ZooFullException.java  
            |       |-- InvalidAgeException.java  
            |-- gestionemployes/  
            |   |-- main/  
            |   |   |-- MainEmploye.java  
            |   |-- entities/  
            |       |-- Employe.java  
            |       |-- Departement.java  
            |   |-- interfaces/  
            |       |-- IGestion.java  
            |       |-- IDepartement.java  
            |   |-- implementations/  
            |       |-- SocieteArrayList.java  
            |       |-- DepartementHashSet.java  
            |-- gestionetudiants/  
                |-- main/  
                |   |-- MainEtudiant.java  
                |-- entities/  
                |   |-- Etudiant.java  
                |-- interfaces/  
                |   |-- Management.java  
                |-- implementations/  
                    |-- StudentManagement.java  

## 📝 Prosit 3
[Prosit 3 - Lien vers le code](https://github.com/nadaaaaaaaa777777777/First_projet/tree/prosit3)  
**Description** : Création de la classe Animal avec des attributs de base, puis création de la classe Zoo qui gère un tableau d'animaux. Ajout de la méthode `addAnimal()` pour insérer des animaux dans le zoo.  
<br>

## 📝 Prosit 4
[Prosit 4 - Lien vers le code](https://github.com/nadaaaaaaaa777777777/First_projet/tree/prosit4)  
**Description** : Ajout de la méthode `displayAnimals()` pour afficher tous les animaux dans le zoo. Création de la méthode `searchAnimal()` pour rechercher un animal par son nom. Tests de l'affichage et de la recherche.  
<br>

## 📝 Prosit 5
[Prosit 5 - Lien vers le code](https://github.com/nadaaaaaaaa777777777/First_projet/tree/prosit5)  
**Description** : Modification de la méthode `addAnimal()` pour empêcher les doublons d'animaux. Limitation du nombre d'animaux dans le zoo à 25. Ajout de tests pour vérifier la gestion de la limite.  
<br>

## 📝 Prosit 6
[Prosit 6 - Lien vers le code](https://github.com/nadaaaaaaaa777777777/First_projet/tree/prosit6)  
**Description** : Ajout de la méthode `removeAnimal()` pour supprimer un animal du zoo. Réorganisation du tableau pour éviter les espaces vides après la suppression. Tests pour valider la suppression d'animaux.  
<br>

## 📝 Prosit 7
[Prosit 7 - Lien vers le code](https://github.com/nadaaaaaaaa777777777/First_projet/tree/prosit7)  
**Description** : Implémentation de la méthode `isZooFull()` pour vérifier si le zoo est plein. Tests pour simuler un zoo à pleine capacité.  
<br>

## 📝 Prosit 8
[Prosit 8 - Lien vers le code](https://github.com/nadaaaaaaaa777777777/First_projet/tree/prosit8)  
**Description** : Ajout de la méthode `comparerZoo()` pour comparer deux zoos en fonction du nombre d'animaux. La méthode retourne le zoo ayant le plus d'animaux. Tests pour les cas où les zoos ont le même nombre d'animaux.  
<br>

## 📝 Prosit 9
[Prosit 9 - Lien vers le code](https://github.com/nadaaaaaaaa777777777/First_projet/tree/prosit9)  
**Description** : Création d'une application de gestion des employés pour une société. La classe `Employe` inclut un identifiant, un nom, un prénom, un département et un grade. La classe `SocieteArrayList` implémente l'interface `IGestion` et permet la gestion des employés avec des méthodes comme l'ajout, la recherche, et le tri des employés.  
<br>

## 📝 Prosit 10
[Prosit 10 - Lien vers le code](https://github.com/nadaaaaaaaa777777777/First_projet/tree/prosit10)  
**Description** : Création de la classe `Departement` avec des attributs comme l'ID, le nom du département et le nombre d'employés. Implémentation de l'interface `IDepartement` dans la classe `DepartementHashSet`, qui gère les départements avec un `HashSet`.  
<br>

## 📝 Prosit 11
[Prosit 11 - Lien vers le code](https://github.com/nadaaaaaaaa777777777/First_projet/tree/prosit11)  
**Description** : Développement de la classe `AffectationHashMap` pour gérer l'affectation des employés à des départements via une collection clé-valeur (`HashMap`). Ajout des méthodes pour affecter un employé à un département, afficher les employés et départements, rechercher et supprimer des éléments, et trier la collection.  
<br>

## 📝 Prosit 12
[Prosit 12 - Lien vers le code](https://github.com/nadaaaaaaaa777777777/First_projet/tree/prosit12)  
**Description** : Création de la classe `Etudiant` avec des attributs comme l'ID, le nom et l'âge. Implémentation de l'interface `Management` avec des méthodes pour afficher les étudiants, filtrer, trier, et convertir une liste d'étudiants en flux (`Stream`). La classe `StudentManagement` implémente cette interface pour gérer les étudiants avec des opérations fonctionnelles.  
<br>

### 📌 Technologies Utilisées
- **Java** : Langage principal pour le développement du projet
- **Collections Java** : Utilisation des listes, ensembles et cartes pour gérer les animaux, les employés et les départements
- **Interfaces et Exceptions** : Gestion des erreurs et des interfaces pour l'organisation des classes  
<br>

### 🚀 Comment Lancer le Projet
1. Clonez le repository :  
   `git clone https://github.com/nadaaaaaaaa777777777/First_projet.git`
2. Compilez le projet en utilisant un IDE comme IntelliJ IDEA  
3. Exécutez les classes principales dans `src/main/` pour voir les fonctionnalités en action.  
<br>

### ✨ Contributions
Les contributions sont les bienvenues ! N'hésitez pas à soumettre des pull requests pour améliorer ce projet.
