package OOP_Lab_7.program.infrastructure.console;

import OOP_Lab_7.program.core.service.IApartmentService;
import OOP_Lab_7.program.infrastructure.utils.Colors;
import org.jetbrains.annotations.Contract;

import java.util.Scanner;

/**
 * Represents console interface for the program.
 */
@SuppressWarnings("ClassCanBeRecord")
public class ConsoleApplication {
    private final IApartmentService applianceService;

    /**
     * Console application constructor.
     * @param applianceService Appliance service instance.
     */
    @Contract(pure = true)
    public ConsoleApplication(IApartmentService applianceService) {
        this.applianceService = applianceService;
    }

    /**
     * Starts console interface logic.
     */
    public void show() {
        while (true) {
            printMainMenu();
            var chosenValue = new Scanner(System.in).nextInt();
            switch (chosenValue) {
                case 1 -> getAppliances();
                case 2 -> getAppliance();
                case 3 -> getSortedAppliances();
                case 4 -> getConsumptionPower();
                case 5 -> connectAppliances();
                default -> {
                    return;
                }
            }
        }
    }

    /**
     * Prints main menu.
     */
    private void printMainMenu() {
        System.out.println();
        System.out.println("Choose command:");
        System.out.println("0 : Exit");
        System.out.println("1 : Get appliances");
        System.out.println("2 : Get appliance");
        System.out.println("3 : Get appliances sorted by power consumption");
        System.out.println("4 : Get consumption power");
        System.out.println("5 : Connect appliances");
    }

    /**
     * Prints appliances.
     */
    private void getAppliances() {
        System.out.println();
        var appliances = applianceService.getAppliances();
        for (int j = 0; j < appliances.size(); j++) {
            System.out.println(j + 1 + " : " + appliances.get(j).toString());
        }
    }

    /**
     * Prints appliance.
     */
    private void getAppliance() {
        System.out.println();
        System.out.println("Enter appliance id:");
        var id = new Scanner(System.in).nextInt();
        System.out.println();
        var appliance = applianceService.getAppliance(id);
        if (appliance == null) {
            System.out.println("Appliance with id = " + id + " does not exist");
            return;
        }
        System.out.println(appliance);
    }

    /**
     * Prints sorted appliances.
     */
    private void getSortedAppliances() {
        System.out.println();
        var sorted = applianceService.getSortedAppliances();
        for (int i = 0; i < sorted.size(); i++) {
            System.out.println(i + 1 + " : " + sorted.get(i).toString());
        }
    }

    /**
     * Prints total consumption power of connected appliances.
     */
    private void getConsumptionPower() {
        System.out.println();
        System.out.print("Total power consumption is ");
        System.out.print(applianceService.getConsumptionPower());
        System.out.println(" Wh/Day");
    }

    /**
     * Print menu for appliance connection.
     */
    private void connectAppliances() {
        var appliances = applianceService.getAppliances();
        while (true) {
            System.out.println();
            System.out.println("0 : Exit");
            for (int j = 0; j < appliances.size(); j++) {
                var appliance = appliances.get(j);
                var color = appliance.isConnected() ? Colors.GREEN : Colors.RED;
                System.out.println(color + (j + 1) + " : " + appliance + Colors.RESET);
            }
            var index = new Scanner(System.in).nextInt();
            System.out.println();
            if (index <= 0 || index > appliances.size()) return;

            var isConnected = applianceService.switchConnection(appliances.get(index - 1));
            if (isConnected) {
                System.out.println("Appliance was successfully connected");
            }
            else {
                System.out.println("It is not free outlet");
            }
        }

    }
}
