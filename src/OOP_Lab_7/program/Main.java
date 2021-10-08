package OOP_Lab_7.program;

import OOP_Lab_7.program.core.builder.ConsoleApplicationBuilder;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        new ConsoleApplicationBuilder().build().show();
    }
}
