package ex4_6_hellofresh;

import ex4_6.Ingredient;
import ex4_6.Recipe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testHelloFresh {
    @Test
    void testUnits() {
        Ingredient i = new Ingredient("chocolade", "g", 1);
        assertEquals("gram", i.getUnits());
        Ingredient i2 = new Ingredient("melk", "cl", 1);
        assertEquals("cl", i2.getUnits());
        Ingredient i3 = new Ingredient("melk", "cls", 1);
        assertEquals("cl", i3.getUnits());
        Ingredient i4 = new Ingredient("suiker", "eetlepels", 5);
        assertEquals("eetlepels", i4.getUnits());
        Ingredient i5 = new Ingredient("vanillesuiker", "kom", 1);
        assertEquals("", i5.getUnits());}

    @Test
    void testAmount() {
        Ingredient i = new Ingredient("chocolate", "g", 10);
        assertEquals(10, i.getAmount());
        Ingredient i2 = new Ingredient("melk", "cl", 50);
        assertEquals(50, i2.getAmount());
    }

    @Test
    void testName() {
        Ingredient i = new Ingredient("chocolade", "g", 1);
        assertEquals("chocolade", i.getName());
    }

    @Test
    void testAllFunctions() {
        Ingredient pastaPesto = new Ingredient("basilicum", "blaadjes", 10);
        assertEquals("basilicum", pastaPesto.getName());
        assertEquals("blaadjes", pastaPesto.getUnits());
        assertEquals(10, pastaPesto.getAmount());
        pastaPesto.printNumberOfPortions(4);

    }

    @Test
void testPrintNumberOfPortions() {
        Ingredient i = new Ingredient("chocolate", "g", 1);
        i.printNumberOfPortions(2);
        Ingredient courgette = new Ingredient("courgette", "", 1);
        courgette.printNumberOfPortions(1);
        courgette.printNumberOfPortions(2);
        courgette.printNumberOfPortions(4);
    }

@Test

    void testPrintRecipe() {
        Recipe recipe = new Recipe("Appeltaart");
        recipe.addIngredient(new Ingredient("appel", "stuk", 3));
        recipe.addIngredient(new Ingredient("deeg", "gr", 1000));
        recipe.addIngredient(new Ingredient("zout", "g", 1));
        recipe.addIngredient(new Ingredient("kaneel", "gr", 10));
        recipe.addIngredient(new Ingredient("suiker", "g", 120));
        recipe.printRecipe(10);
    }

}
