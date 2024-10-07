import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static ArrayList<Materials> materials = new ArrayList<>();
        public static ArrayList<Door> doors = new ArrayList<>();

    public static void main(String[] args) {

        materials.add(new Materials("Wood", 1234));
        materials.add(new Materials("Metal", 7346));
        materials.add(new Materials("Glass", 4000));
        materials.add(new Materials("Stone", 9999));

        Door newDoor;
        newDoor = new Door(false, true,true, "Stone", "Silver",
                20.0, 3.0, 2.0);
        System.out.println("Speak friend and enter...");
        doors.add(new Door(false, true, true, askUserMaterial(), askUserDoorColor(), 120.0, 123.0, 23.0, materials.get()));

        Door.initiateMaterials();
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
            System.out.println(materials);
            Scanner in = new Scanner(System.in);
            chosenMaterial = in.nextLine();
            isMaterialChoiceValid = materials.contains(chosenMaterial);
            if (!isMaterialChoiceValid) {
                System.out.println("That material does not exist.");
            }
        } while(!isMaterialChoiceValid);
        return chosenMaterial;
    }

}