
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Tax-Calculator App");
        System.out.println("_________________WELCOME________________");
        System.out.println();

        System.out.println("Enter Total Person Count: ");
        Scanner scn=new Scanner(System.in);
        int userInput=scn.nextInt();

        String[] names=new String[userInput];
        long [] incomes=new long[userInput];

        for(int i=0; i<userInput;i++ ){
            System.out.println("Enter Name " + (i+1) + " : ");
            names[i]=scn.next();}

        for(int i=0; i<userInput;i++ ){
            System.out.println("Enter " + names[i] + "'s Annual Income: ");
            incomes [i]=scn.nextLong();
            System.out.println();
        }
        scn.close();

        System.out.println(" Names with Liable Taxes");
        System.out.println("---------------------------");

        for (int i = 0; i < userInput; i++) {
            calculateTax(names[i], incomes[i]);

        }
    }

    public static void calculateTax(String name, long income){

        long tax;
        if(income>=300000){
            tax=income * 20/100;
        }
        else if(income>=200000){
            tax=income * 10/100;
        }
        else{
            tax=0;
        }
        System.out.println(" " + name +" : "+ '\u20B9' + " " + tax);
    }

}
