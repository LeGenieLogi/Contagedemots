# Programme de comptage de mots

Ce projet est un exercice Java qui permet de compter le nombre total de mots dans un fichier texte.

## Objectif

Le programme lit un fichier ligne par ligne avec un `Scanner`, sépare chaque ligne en mots, compte le nombre de mots de chaque ligne, puis affiche le total.

## Structure du projet

```text
.
├── Textfile.txt
├── src/
│   ├── Main.java
│   └── WordCounter.java
├── .gitignore
└── README.md
```

## Classes utilisées

- `Main` : Lit le chemin du fichier et affiche le résultat.
- `WordCounter` : contient les méthodes qui lisent le fichier et comptent les mots.

## Gestion des erreurs

Le programme utilise `try catch` pour gérer les erreurs possibles

## Comment executer le projet

Depuis le dossier du projet, compiler les fichiers Java :

```bash
javac -d out src/*.java
```

Executer le programme :

```bash
java -cp out Main
```

Quand le programme lit le fichier, vous pouvez tester avec :

```text
Textfile.txt
```

## Exemple d'exécution

```text
=== Programme de comptage de mots ===
Nombre total de mots : 22
```

## Tests effectués

- Test avec le fichier `Textfile.txt`.
- Test avec une ligne vide.
- Test avec plusieurs lignes.
