import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions: Buy, Add, Take, Show, Analytics, Exit");
            System.out.print("Enter your choice: ");
            String choice = sc.next();

            switch (choice) 
            {
                case "Buy":
                    System.out.println("Available coffees: 1. Espresso ($4) 2. Latte ($7) 3. Cappuccino ($6)");
                    System.out.print("Enter the number of the coffee you want to buy: ");
                    int coffeeChoice = sc.nextInt();
                    if (coffeeChoice >= 1 && coffeeChoice <= 3) {
                        switch (coffeeChoice) {
                            case 1:
                                machine.buyEspresso();
                                break;
                            case 2:
                                machine.buyLatte();
                                break;
                            case 3:
                                machine.buyCappuccino();
                                break;  
                        }
                    } else {
                        System.out.println("Invalid coffee choice.");
                    }
                    break;

                case "Add":
                    System.out.print("Enter amount of water (ml): ");
                    int water = sc.nextInt();
                    System.out.print("Enter amount of milk (ml): ");
                    int milk = sc.nextInt();
                    System.out.print("Enter amount of coffee beans (g): ");
                    int coffeeBeans = sc.nextInt();
                    machine.fill(water, milk, coffeeBeans);
                    break;

                case "Take":
                    machine.take();
                    break;

                case "Show":
                    machine.showIngredients();
                    break;

                case "Analytics":
                    machine.showAnalytics();
                    break;

                case "Exit":
                    System.out.println("Exiting The Coffee Machine Simulator.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice. Please Enter a Valid Option.");
                    break;
            }
        }
    }
}

