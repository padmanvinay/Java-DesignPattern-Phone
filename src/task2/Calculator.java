package task2;
interface CalculationHandler
{
    void calculations(int a,int b);
}
class Addition implements CalculationHandler
{
    public void calculations(int a,int b)
    {
        System.out.println("Sum is = " +(a+b));
    }
}
class Subtraction implements CalculationHandler
{
    public void calculations(int a,int b)
    {
        System.out.println("Difference is = "+(a-b));
    }
}
class Multiplication implements CalculationHandler
{
    public void calculations(int a,int b)
    {
        System.out.println("Product is = "+(a*b));
    }
}
class Division implements CalculationHandler
{
    public void calculations(int a,int b)
    {
        System.out.println("Quotient is = "+(a/b));
    }
}
public class Calculator
{
    public CalculationHandler getCalc(String operation)
    {
        if(operation.equals("add"))
        {
            return new Addition();
        }
        else if(operation.equals("sub"))
        {
            return new Subtraction();
        }
        else if(operation.equals("mul"))
        {
            return new Multiplication();
        }
        else if(operation.equals("div"))
        {
            return new Division();
        }
        else
        {
            System.out.println("Operation doesnt exist!");
            return null;
        }
    }
}
