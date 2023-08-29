public class CoffeeMachine {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int moneyEarned;
    private int espressoCount;
    private int latteCount;
    private int cappuccinoCount;

    public CoffeeMachine() {
        water = 0;
        milk = 0;
        coffeeBeans = 0;
        moneyEarned = 0;
        espressoCount = 0;
        latteCount = 0;
        cappuccinoCount = 0;
    }

    public void fill(int water, int milk, int coffeeBeans) {
        this.water += water;
        this.milk += milk;
        this.coffeeBeans += coffeeBeans;
    }

    public void take() {
        System.out.println("Here Is Your Money : $" + moneyEarned);
        moneyEarned = 0;
    }

    public boolean canMakeCoffee(int waterNeeded, int milkNeeded, int coffeeBeansNeeded) {
        return water >= waterNeeded && milk >= milkNeeded && coffeeBeans >= coffeeBeansNeeded;
    }

    public void makeCoffee(int price, int waterNeeded, int milkNeeded, int coffeeBeansNeeded) {
        if (canMakeCoffee(waterNeeded, milkNeeded, coffeeBeansNeeded)) {
            System.out.println("Coffee Ordered Succesfully!!!!");
            moneyEarned += price;
            water -= waterNeeded;
            milk -= milkNeeded;
            coffeeBeans -= coffeeBeansNeeded;
        } else {
            System.out.println("Insufficient Ingredients To Make Coffee.");
        }
    }

    public void showIngredients() {
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Coffee Beans: " + coffeeBeans + " g");
        System.out.println("Money: $" + moneyEarned);
    }
    public void showAnalytics() {
        System.out.println("Coffee sold: ");
        System.out.println("Espresso: " + espressoCount + " cups");
        System.out.println("Latte: " + latteCount + " cups");
        System.out.println("Cappuccino: " + cappuccinoCount + " cups");
        System.out.println("Total money earned: $" + moneyEarned);
    }

    public void buyEspresso() {
        makeCoffee(4, 250, 0, 16);
        espressoCount++;
    }

    public void buyLatte() {
        makeCoffee(7, 350, 75, 20);
        latteCount++;
    }

    public void buyCappuccino() {
        makeCoffee(6, 200, 100, 12);
        cappuccinoCount++;
    }

   
}

