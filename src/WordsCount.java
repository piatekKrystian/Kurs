import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) throws FileNotFoundException {
        String word = JOptionPane.showInputDialog("Podaj szukane słowo ");
        JFileChooser chooser = new JFileChooser();
chooser.setCurrentDirectory(new java.io.File("C:\\Users\\krystian\\Desktop"));
chooser.setDialogTitle("Wybierz plik z tekstem");
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            Scanner sc = new Scanner(file);
            int counter = 0;
            while (sc.hasNext()) {
                if (sc.next().equals(word)) {
                    counter++;
                }
            }
            System.out.println("Słowo " + word + " wystąpiło w wybranym przez Ciebie tekście "+counter+ " razy");
        }
    }
}