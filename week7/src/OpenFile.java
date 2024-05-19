import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class OpenFile {

    public static void main(String[] args) {

         File file;
        Scanner inputFile;
        String fileName;

        fileName = JOptionPane.showInputDialog("Enter " + "the name of the file");
//        attempt to open the file
        try {
file = new File(fileName);
inputFile = new Scanner(file);
JOptionPane.showInputDialog(null,"The file was found, yippy skippy, displayed in TRY");

        } catch (Exception e) {

            JOptionPane.showInputDialog(null,"The file was not found. This is in CATCH");
        }

        JOptionPane.showInputDialog(null,"Program has finishing running -done- displayed after CATCH");
    }
}
