package ex4_6;

import java.util.ArrayList;

public class Recipe {

    private Recipe recipe;
    private String dishName;
    private int amountForRecipe = 1;
    private final ArrayList<Ingredient> ingredients = new ArrayList<>();

    public Recipe(String dishName) {
        this.dishName = dishName;
    }

    public void printRecipe(int nrOfPortions) {
     this.amountForRecipe = nrOfPortions;
        System.out.println(this.dishName + " voor " + nrOfPortions + " personen");
        System.out.println("Lijst met ingrediënten:");
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println(ingredients.get(i).getName() + " " + ingredients.get(i).getAmount() + " " + ingredients.get(i).getUnits());
        }


    }

    public void addText(String text) {

    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }


}
