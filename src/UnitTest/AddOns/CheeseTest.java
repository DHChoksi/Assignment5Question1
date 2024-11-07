import AddOns.Cheese;
import FoodItems.Burger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheeseTest
{
    @Test
    public void testCheeseCost()
    {
        Burger burger = new Burger();
        Cheese cheeseBurger = new Cheese(burger);
        double expectedCost = burger.GetCost() + Cheese.CHEESE_COST;
        assertEquals(expectedCost, cheeseBurger.GetCost(), 0.01);
    }
}