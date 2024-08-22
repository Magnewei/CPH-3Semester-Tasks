package Torsdag.TaskFour;


import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Create an instance of FileStorage for String data
        DataStorage<String> fileStorage = new FileStorage();

        // Create some sample strings
        String data1 = "Hello, World!";
        String data2 = "Java File Storage Test";

        // Store the strings
        String fileName1 = fileStorage.store(data1);
        String fileName2 = fileStorage.store(data2);

        System.out.println("Stored data1 in file: " + fileName1);
        System.out.println("Stored data2 in file: " + fileName2);

        // Retrieve the data
        String retrievedData1 = fileStorage.retrieve(fileName1);
        String retrievedData2 = fileStorage.retrieve(fileName2);

        System.out.println("Retrieved data1 from file: " + retrievedData1);
        System.out.println("Retrieved data2 from file: " + retrievedData2);

    }
}