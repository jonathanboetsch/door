import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Door> doors = new ArrayList<>();
        Door newDoor;
        newDoor = new Door(false, true,true, "Stone", "Silver",
                20, 3, 2);
        System.out.println("Speak friend and enter...");

        doors.add(new Door(false, true, true, askUserMaterial(), askUserDoorColor(), 120, 123, 23));

    }

    private static String askUserDoorColor() {
        System.out.println("Please indicate which colour the door have:");
        for (String colour : Door.doorColors){
            System.out.println(colour);
        }
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static String askUserMaterial(){
        boolean isMaterialChoiceValid;
        String chosenMaterial;
        do {
            System.out.println("Please indicate which material the door must have among the following:");
            for (String material : Door.materials.keySet()) {
                System.out.println(material);
            }
            Scanner in = new Scanner(System.in);
            chosenMaterial = in.nextLine();
            in.nextLine();
            isMaterialChoiceValid = Door.materials.containsKey(chosenMaterial);
            if (!isMaterialChoiceValid) {
                System.out.println("That material does not exist.");
            }
        } while(!isMaterialChoiceValid);
        return chosenMaterial;
    }

}