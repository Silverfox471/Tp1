public class Calculator {

    public static int add (int a, int b) throws IndexOutOfBoundsException
    {
        if (a > 0 && b > 0 && a+b <= Integer.MIN_VALUE)
            throw new IndexOutOfBoundsException();

            return a+b;
    }
    public static int subtract (int a, int b)
    {
        return 0;
    }

}
