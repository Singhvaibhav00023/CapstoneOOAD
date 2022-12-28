public class Calculator {

    protected int add (int num1, int num2)
    {
        return num1+num2;
    }

    protected int subtract(int num1, int num2)
    {
        return num1-num2;
    }

    protected  int multiply(int num1, int num2)
    {
        return num1*num2;
    }

    protected double percentage(int num, int total)
    {
        return num*100/total;
    }

    public int square(int num)
    {
        return num*num;
    }
}
