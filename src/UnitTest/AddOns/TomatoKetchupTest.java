import AddOns.TomatoKetchup;
import FoodItems.Fries;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TomatoKetchupTest
{
    @Test
    public void testTomatoKetchupCost()
    {
        Fries fries = new Fries();
        TomatoKetchup tomatoKetchupFries = new TomatoKetchup(fries);
        double expectedCost = fries.GetCost() + TomatoKetchup.TOMATO_KETCHUP_COST;
        assertEquals(expectedCost, tomatoKetchupFries.GetCost(), 0.01);
    }
}