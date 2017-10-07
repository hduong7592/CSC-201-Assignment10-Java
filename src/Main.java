/**
 * Create by hieuduong on 10/7/17
 * Driver class
 */
public class Main {
    public static void main(String[] args){

        DisplayNumber(17);
        DisplayNumber(12);

        char[] array = new char[] {'1','3','7'};
        DisplayNumber(MyInteger.parseInt(array));

        DisplayNumber(MyInteger.parseInt("12"));

    }

    public static void DisplayNumber(int value){

        MyInteger myInt = new MyInteger(value);
        System.out.println("Value: "+myInt.getValue());
        System.out.println("Is even: "+myInt.isEven());
        System.out.println("Is odd: "+myInt.isOdd());
        System.out.println("Is prime: "+myInt.isPrime());
        System.out.println(myInt.getValue() + " is equal 12: " + myInt.equals(12));
        System.out.println("");
    }
}
