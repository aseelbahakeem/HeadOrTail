import java.util.*;
public class HeadOrTail {

    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    //declare variables number guess of the type integer
    int number, guess ;
    
    //genetare number its value is 1 or 0
    number = (int)(Math.random()*2);
    
    //Ask user for guess and read it
    System.out.println(" guess weather the flip of the coin is head or tial ");
    System.out.println(" Enter 0 for head and 1 for tail: ");
    guess = input.nextInt();
    
    //test if the guess is correct or not and display the result
    if ( guess == number ){
        System.out.println(" yay! This is the right guess ");
    }
    else {
        System.out.println(" Sorry! this isn't the right guess ");
       }    
        
    }
    
}
