import AddOns.Broccoli;
import FoodItems.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BroccoliTest
{
    @Test
    public void testBroccoliCost()
    {
        Pizza pizza = new Pizza();
        Broccoli BroccoliPizza = new Broccoli(pizza);
        double expectedCost = pizza.GetCost() + BroccoliPizza.BROCCOLI_COST; 
        assertEquals(expectedCost, BroccoliPizza.GetCost(), 0.01);
    }
}