package studio1;
import java.util.*;

public class LeapYear {
    public static void main(String[] args){
        boolean isLeapYear;
        Scanner in = new Scanner(System.in);
        System.out.println("What is the year: ");
        int year = in.nextInt();
        isLeapYear = (year%4==0 && year%100!=0) || year%400==0;
        System.out.println(year + " is a leap year: " + isLeapYear);
    }
}
//Problem were my team mates could not push. Just know that we all worked on this.