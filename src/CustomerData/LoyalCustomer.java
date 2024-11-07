package CustomerData;

public class LoyalCustomer extends Customer
{
    public static final int DISCOUNT_RATE = 1;
    private double m_AdditionalDiscount;

    public LoyalCustomer(String name, LoyaltyStatus loyaltyStatus, double additionalDiscount)
    {
        super(name, loyaltyStatus);
        this.m_AdditionalDiscount = additionalDiscount;
    }

    public double GetAdditionalDiscount()
    {
        return m_AdditionalDiscount;
    }

    public void SetAdditionalDiscount(double additionalDiscount)
    {
        this.m_AdditionalDiscount = additionalDiscount;
    }

    public double GetTotalDiscount()
    {
        return GetLoyaltyStatus().GetDiscount() + m_AdditionalDiscount;
    }
}
