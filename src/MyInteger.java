/**
 * Hieu Duong
 * CSC 201
 * Assignment 10
 * Problem 10.3:
 * (The MyInteger class) Design a class named MyInteger. The class contains:
 * ■ An int data field named value that stores the int value represented by this
 * object.
 * ■ A constructor that creates a MyInteger object for the specified int value.
 * ■ A getter method that returns the int value.
 * ■ The methods isEven(), isOdd(), and isPrime() that return true if the
 * value in this object is even, odd, or prime, respectively.
 * ■ The static methods isEven(int), isOdd(int), and isPrime(int) that
 * return true if the specified value is even, odd, or prime, respectively.
 * ■ The static methods isEven(MyInteger), isOdd(MyInteger), and
 * isPrime(MyInteger) that return true if the specified value is even, odd,
 * or prime, respectively.
 * ■ The methods equals(int) and equals(MyInteger) that return true if
 * the value in this object is equal to the specified value.
 * ■ A static method parseInt(char[]) that converts an array of numeric
 * characters to an int value.
 * ■ A static method parseInt(String) that converts a string into an int
 * value.
 *
 * 10/07/2017
 *
 */

public class MyInteger {

    private int value;

    public MyInteger(int Input){
        this.value = Input;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        if((this.value%2) == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isOdd(){
        if((this.value%2) > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isPrime(){
        int divider = 0, flag = 0;
        divider = this.value/2;
        for(int i=2;i<=divider;i++){
            if((this.value)%i == 0){
                //Not a prime number
                flag = 1;
            }
        }
        if(flag == 1){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isEven(int Input){
        if((Input%2) == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isOdd(int Input){
        if((Input%2) > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isPrime(int Input){
        int divider = 0, flag = 0;
        divider = Input/2;
        for(int i=2;i<=divider;i++){
            if((Input)%i == 0){
                //Not a prime number
                flag = 1;
            }
        }
        if(flag == 1){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isEven(MyInteger myInt){
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt){
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt){
        return myInt.isPrime();
    }

    public boolean equals(int Input){
        if(this.value == Input){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(MyInteger myInt){
        if(this.value == myInt.value){
            return true;
        }
        else{
            return false;
        }
    }

    public static int parseInt(char[] array) {
        int sum = 0;
        for (char i : array) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}
