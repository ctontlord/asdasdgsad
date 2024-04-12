import java.util.ArrayList;
import java.util.Scanner;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Climber{
    void climb();
}

// the main method
public class ZOOMANAGEMENT {
    public static void main(String[] args) {
        ArrayList<ANIMAL> animals = new ArrayList<>();
        BirdPlace birdPlace = new BirdPlace();
        Aquarium aquarium = new Aquarium();
        MamalHabitat malhabitat = new MamalHabitat();
        Scanner input = new Scanner(System.in);

        while (true) {//options for the user
            System.out.println("\n**==== Zoo Managing System ====**");
            System.out.println("1. Add Animal");
            System.out.println("2. See all Animals");
            System.out.println("3. See animals in habitat");
            System.out.println("4. Feedanimals");
            System.out.println("5. Simulate behavior ofanimals");
            System.out.println("6. Exit");
            System.out.print("Enter the desired choice: ");

            int choice = input.nextInt();
            input.nextLine(); 
            switch (choice) {//codes for the choices
                case 1:
                System.out.print("Enter the only the number of animal type you want to add (1.Mammal/2.Fish/3.Bird): ");
                int type = input.nextInt();
                input.nextLine(); 
                System.out.print("Give it a name:");
                String name = input.nextLine();
                System.out.print("Enter age:");
                int age = input.nextInt();
                input.nextLine();
                System.out.print("Enter weight:");
                double weight = input.nextDouble();
                input.nextLine();
                    ANIMAL animal;
                    switch (type) {//codes for creating the animal preferred by da user
                        case 1:
                            animal = new MAMALS(name, age, weight);
                            malhabitat.addAnimal(animal);
                            break;
                        case 2:
                            animal = new FISH(name, age, weight);
                            malhabitat.addAnimal(animal);
                            break;
                        case 3:
                            animal = new BIRD(name, age, weight);
                            malhabitat.addAnimal(animal);
                            break;
                        default:
                            System.out.println("Invalid animal type.");
                            continue;
                    }
                    animals.add(animal);
                    System.out.println("Animal added successfully.");
                    break;
                case 2:
                    System.out.println("\n<<<< All Animals in the Zoo >>>>");
                    for (ANIMAL a : animals) {
                        System.out.println(a);
                    }
                    break;
                case 3:
                    System.out.println("\n<<<< Animals in Specific Habitats >>>>");
                    System.out.println("BirdPlace:");
                    birdPlace.simulateInteractions();
                    System.out.println("\nAquarium:");
                    aquarium.simulateInteractions();
                    System.out.println("\nMamalHabitat:");
                    malhabitat.simulateInteractions();
                    break;
                case 4:
                    System.out.println("\n<<<< Feeding Animals >>>>");
                    System.out.println("Feeding birds in the BirdPlace...");
                    birdPlace.feedanimals();
                    System.out.println("Feeding fish in the Aquarium...");
                    aquarium.feedanimals();
                    System.out.println("Feeding mammals in the MamalHabitat..");
                    malhabitat.feedanimals();
                    System.out.println("All animals fed.");
                    break;
                case 5:
                    System.out.println("\n==== Simulating Animal Behavior ====");
                    System.out.println("Simulating bird behavior in the BirdPlace...");
                    birdPlace.simulateInteractions();
                    System.out.println("Simulating fish behavior in the Aquarium...");
                    aquarium.simulateInteractions();
                    System.out.println("Simulating mammal behavior in the MamalHabitat...");
                    malhabitat.simulateInteractions();
                    break;
                case 6:
                    System.out.println("CLOSING THE ZOO MANAGEMENT NOW.");
                    input.close();
                    return;
                default:
                    System.out.println("input invalid. Please try again.");
            }
        }
    }
}

