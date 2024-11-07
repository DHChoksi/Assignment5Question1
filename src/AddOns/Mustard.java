package AddOns;

import FoodItems.Food;

public class Vegetables extends Toppings
{
    public Vegetables(Food food)
    {
        super(food);
    }

    @Override
    public double GetCost()
    {
        return m_Food.GetCost() + 3.5; // Add Vegetables cost
    }

    @Override
    public String GetDescription()
    {
        return m_Food.GetDescription() + ", Vegetables";
    }
}
