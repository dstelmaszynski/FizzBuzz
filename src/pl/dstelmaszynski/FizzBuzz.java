package pl.dstelmaszynski;

class FizzBuzz {
    public static void main (String[] args){
        //outputting numbers from 1 to 100
        //numbers which are multiples of both 3 and 5
        for(int i = 1; i <= 100; i++)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                //multiples of 5
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                //multiples of 3
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
    }
}
