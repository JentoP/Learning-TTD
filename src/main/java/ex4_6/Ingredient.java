package ex4_6;

public class Ingredient {
    private String name;
    private String units;
    private int amount;

    public Ingredient(String name, String units, int amount) {
        this.name = name;
        this.units = units;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
