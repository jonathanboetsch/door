import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
        public static ArrayList<Material> materials = new ArrayList<>();
        public static ArrayList<Door> doors = new ArrayList<>();

    public static void main(String[] args) {

        Material wood = new Material("Wood", 1000);
        materials.add(wood);
        Material metal = new Material("Metal", 2000);
        materials.add(metal);
        Material stone = new Material("Stone", 9999);
        materials.add(stone);

        System.out.println("Speak friend and enter...");
        doors.add(new Door(false, true, true, askUserMaterial(), askUserDoorColor(), 120.0, 123.0, 23.0));

    }

    private static String askUserDoorColor() {
        boolean isValidInput;
        int userChoice;
        do {
            System.out.println("Please indicate which colour the door have:");
            int i = 0;
            for (String colour : Door.doorColors) {
                System.out.println(i + ": ");
                System.out.println(colour);
                i++;
            }
            Scanner in = new Scanner(System.in);
            userChoice = in.nextInt();
            in.nextLine();
            isValidInput = (userChoice >= 0 && userChoice < Door.doorColors.length);
            if (!isValidInput) {
                System.out.println("Invalid choice.");
            }
        } while (!isValidInput);
        return Door.doorColors[userChoice];
    }

    public static Material askUserMaterial(){
        boolean isMaterialChoiceValid;
        int chosenMaterial;
        do {

            System.out.println("Please indicate which material the door must have among the following:");
            for (Material materialItem : materials) {
                System.out.print(materials.indexOf(materialItem));
                System.out.print(": ");
                System.out.println(materialItem.getName());
            }

            Scanner in = new Scanner(System.in);
            chosenMaterial = in.nextInt();
            in.nextLine();

            isMaterialChoiceValid = (chosenMaterial >= 0 && chosenMaterial < materials.size());
            if (!isMaterialChoiceValid) {
                System.out.println("That material does not exist.");
            }

        } while(!isMaterialChoiceValid);
        return materials.get(chosenMaterial);
    }

}