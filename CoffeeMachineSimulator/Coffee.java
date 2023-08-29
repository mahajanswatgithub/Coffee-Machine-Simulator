public class Coffee {
    private String name;
    private int price;
    private int waterNeeded;
    private int milkNeeded;
    private int beansNeeded;

    public Coffee(String name, int price, int waterNeeded, int milkNeeded, int beansNeeded) {
        this.name = name;
        this.price = price;
        this.waterNeeded = waterNeeded;
        this.milkNeeded = milkNeeded;
        this.beansNeeded = beansNeeded;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWaterNeeded() {
        return waterNeeded;
    }

    public int getMilkNeeded() {
        return milkNeeded;
    }

    public int getBeansNeeded() {
        return beansNeeded;
    }
}
