public class Product
{
    private String name;
    private int amount;
    private double weight;

    public Product(String name, int amount, double weight)
    {
        this.name = name;
        this.amount = amount;
        this.weight = weight;
    }

    /** Returns the name of the product */
    public String getName()
    {
        return name;
    }
    /** Returns the quantity of the product that is in stock
     * Postcondition: The value returned is greater than or equal to zero.
     */
    public int getAmount()
    {
        return amount;
    }

    public double getWeight()
    {
        return weight;
    }
}