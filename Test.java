package My_Package;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) {
        // Specify the file path
        String filePath = "C:\\Users\\puja\\Documents\\Snapshots.txt"; // Corrected the file path

        try {
            // Create a Scanner object to read the file
            File file = new File(filePath);
            Scanner sc = new Scanner(file);

            // Read and print each line
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            // Close the Scanner
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
