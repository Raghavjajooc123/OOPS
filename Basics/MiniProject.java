import java.util.Scanner;
import java.lang.Math;

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ToBeGuessed = (int)(Math.random()*100);
        int num = 0;
        do{
            System.out.println("Guess the number");
            num = sc.nextInt();
            if(num == ToBeGuessed){
                System.out.println("Correct Guess");
                break;
            }
            else if(num <=0){
                System.out.println("Quitting out of the code");
                break;
            }
            else if(num < ToBeGuessed){
                System.out.println("Less than the number to be guessed");
            }
            else if(num > ToBeGuessed){
                System.out.println("Greater than the number to be guessed");
            }
        }while(true);
    }
}
