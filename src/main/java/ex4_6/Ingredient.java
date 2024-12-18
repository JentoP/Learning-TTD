package ex4_6;

public class Ingredient {
    private String name;
    private String units;
    private double amount;

    public Ingredient(String name, String units, double amount) {
        this.name = name;
        this.setUnits(units);
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
        if (units == null
        ) {
            this.units = "";
        } else if (units.equalsIgnoreCase("gram") || units.equalsIgnoreCase("gr") || units.equalsIgnoreCase("g") || units.equalsIgnoreCase("grams")) {
            this.units = "gram";
        } else if (units.equalsIgnoreCase("cl") || units.equalsIgnoreCase("centiliter") || units.equalsIgnoreCase("cls")) {
            this.units = "cl";
        } else if (units.equalsIgnoreCase("stuk") && this.amount > 1.0) {
            this.units = "stuks";
        } else if (units.equalsIgnoreCase("eetlepel") && this.amount > 1.0) {
            this.units = "eetlepels";
        } else if (units.equalsIgnoreCase("zakje") && this.amount > 1.0) {
            this.units = "zakjes";
        } else if (units.equalsIgnoreCase("zout")) {
            this.units = "een beetje zout";
        } else if (units.equalsIgnoreCase("peper en zout")) {
            this.units = "peper en zout naar smaak";
            this.name = "";
        } else {
            this.units = units;
        }
    }


    public double getAmount() {

        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void printNumberOfPortions(int nrOfPortions) {
        if (this.name.equals("courgette") || this.name.equals("appel") || this.name.equals("ei") || this.name.equals("courgettes") || this.name.equals("appels") || this.name.equals("eieren")) {
            if (this.amount % 2 == 0) {
                this.amount /= 2;
            } else if (this.amount % 2 == 1) {
            }
            System.out.println(amount * nrOfPortions + " " + units + " " + name);

        }


    }
}
