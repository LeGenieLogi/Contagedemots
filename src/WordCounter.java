import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public int compterMots(File fichier) throws FileNotFoundException {
        int totalMots = 0;

        // Le Scanner lit le fichier ligne par ligne.
        try (Scanner lecteur = new Scanner(fichier)) {
            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();
                totalMots += compterMotsDansLigne(ligne);
            }
        }

        return totalMots;
    }

    public int compterMotsDansLigne(String ligne) {
        String ligneNettoyee = ligne.trim();

        if (ligneNettoyee.isEmpty()) {
            return 0;
        }

        // On separe la ligne avec un ou plusieurs espaces comme delimiteur.
        String[] mots = ligneNettoyee.split(" +");
        return mots.length;
    }
}