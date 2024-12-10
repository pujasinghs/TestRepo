package My_Package;
import java.io.*;
import java.util.Scanner;

 public class ReadFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the keyword to search
        System.out.print("Enter the keyword to search: ");
        String keyword = scanner.nextLine();

        try {
            // Open the file to read
            FileReader file = new FileReader("C:\\Users\\puja\\Desktop\\Important Doc\\Nice-Server.txt"); // Replace with your file path
            BufferedReader reader = new BufferedReader(file);

            String line;
            boolean found = false; // Flag to check if the keyword is found

            // Read each line of the file
            while ((line = reader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println("Found keyword: " + keyword);
                    System.out.println("Line: " + line);
                    found = true;
                }
            }

            if (found==false) {
                System.out.println("Keyword not found in the file.");
            }

            // Close the reader
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
