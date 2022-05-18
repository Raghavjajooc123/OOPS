import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

class Main {
    public static void printname(String name){
        System.out.println(name);
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        // single line comment
        /* Multi 
        line
        comment*/
        // Variables
        int age = 30;
        String name = "Raghav";
        float GST = 18.66F;
        long phone = 123456789000L;
        //another way of declaring a string
        String name1 = new String ("Shradha");
        System.out.println(name1);
        System.out.println(name);
        System.out.println(age);
        System.out.println(name.length());
        System.out.println(name.charAt(1));
        System.out.println(name.replace('a', 'o'));
        System.out.println(name.substring(0, 3));
        // None of the function changes the value of name
        System.out.println(name);
        //arrays
        int[] marks = {96,92,98};
        System.out.println(marks);//prints the address of the array
        //a new string in Java initiates with null and not a garbage value
        System.out.println(marks[0]);
        //methods on array
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        //2D Arrays
        int[][] marks1 = {{93,92,91},{85,82,80}};
        System.out.println(marks1[0][0]);
        
        //casting
        int power = (int)12.56666;
        System.out.println(power);
        
        //declaring constants
        final float My_PI = 3.14F;
        System.out.println(My_PI);
        
        // Math class in Java
        System.out.println(Math.max(age, power));
        System.out.println(Math.min(age, power));
        System.out.println(Math.random());//Returns a random no between 0 and 1
        
        //Taking input
        Scanner sc = new Scanner (System.in);
        System.out.println("Change the age : ");
        age = sc.nextInt();
        System.out.println(age);
        System.out.println("Change the name : ");
        name = sc.next();
        System.out.println(name);
        
        //Operations in Java
        int a = 2;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(b%a);
        System.out.println(a++);
        System.out.println(++a);
        
        //conditional statements and logical operators
        if(age>18 && age<50){
            System.out.println("Vote!!!");
        }
        else{
            System.out.println("Stay Home");
        }
        
        boolean isTrue = true;
        System.out.println(!isTrue);
        
        //Switch statement
        System.out.println("Enter a no. (1-7) : ");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wed - Sun");
        }
        
        //Loops 
        //For loop
        for(int i=0; i<5; i++){
            System.out.println(i);
        }
        
        //While loop
        int i=0;
        while(i<10){
            if(i==4){
                i++;
                continue;
            }
            if(i==8){
                break;
            }
            System.out.println(i);
            i++;
        }
        
        //do while loop
        int num = 0;
        do{
            System.out.println("Enter number greater than 10 to get out : ");
            num = sc.nextInt();
        }while(num<10);
        System.out.println("Out of the loop");
        
        //Exception Handling
        try{
            System.out.println(marks[3]);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        
        //methods in Java
        printname(name);
    }
}
