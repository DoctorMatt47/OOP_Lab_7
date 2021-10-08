package OOP_Lab_7.program;

import OOP_Lab_7.program.core.builder.ConsoleApplicationBuilder;

import java.io.IOException;


/**
 * Represents entry point of OOP_Lab_7 application.
 */
public class Main {
    /**
     * Entry point. Launches OOP_Lab_7 application.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        new ConsoleApplicationBuilder().build().show();
    }
}
