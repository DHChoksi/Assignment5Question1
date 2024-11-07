import AddOns.Mustard;
import FoodItems.HotDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MustardTest
{
    @Test
    public void testTomatoKetchupCost()
    {
        HotDog hotDog = new HotDog();
        Mustard mustardHotDog = new Mustard(hotDog);
        double expectedCost = hotDog.GetCost() + Mustard.MUSTARD_COST;
        assertEquals(expectedCost, mustardHotDog.GetCost(), 0.01);
    }
}