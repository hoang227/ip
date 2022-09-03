package main.java.amanda;

/**
 * Main class that runs the program
 */
public class Main {
    public static void main(String[] args) {
        Amanda amanda = new Amanda("./src/main/java/data/amanda.txt");
        amanda.run();
    }
}
