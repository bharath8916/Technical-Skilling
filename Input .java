import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*public class java {

    public static void sayHi(){
        System.out.println("HI Bharath");

    }
    public static void sayAge(){
        System.out.println("19");
    }
}*/
/*public class java {
    public static void main(String[] args){
        String a = "hi";
        String b = "hi";
        // toUpperCase()
        System.out.println(a.toUpperCase());
        //toLowerCase()
        System.out.println(a.toLowerCase());
        //length
        System.out.println(a.length());
        //isEmpty()
        System.out.println(a.isEmpty());
        //concat
        System.out.println(a.concat(b));
        // charAt()
        System.out.println(a.charAt(0));
        //indexOf(),lastIndexOf()
        System.out.println(a.indexOf('h'));
        System.out.println(a.lastIndexOf('i'));

    }
}*/
/*public class java{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age");
        int a = input.nextInt();
        System.out.println(a);
    }
}*/
/*public class java{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Scanner input1= new Scanner(System.in);

        System.out.print("Enter your age:");

        int a = input.nextInt();
        input.nextLine();
        System.out.print("Enter your name:");
        String b = input.nextLine();

        System.out.println("hello "+b+" your age is "+a);

    }
}*/
import java.util.Scanner;
/*public class java{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = input.nextLine();
        System.out.print("Enter your ID:");
        int id = input.nextInt();
        System.out.println("Enter any of five subjects marks:");
        int[] marks = new int[5];
        float avg=0;
        for(int i=0;i<5;i++){
            marks[i] = input.nextInt();

        }
        for(int i =0;i<5;i++){
            avg=marks[i]+avg;
        }
        System.out.println("Total marks secured: "+avg);
        System.out.println("Average secured: "+avg/marks.length);
        System.out.println("Percentage secured: "+(avg/500)*100);
    }
}*/
/*public class java
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,1};
        for (int i =0;i<arr.length;i++){


        }
    }
}*/
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedInputStream;
public class java{
    public static void main(String[] args)throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter todays temperature: ");
        float x = Integer.parseInt(reader.readLine());
        System.out.println("Todays temperature is "+x);


    }
}*/

/*public class java{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] marks = new int[5];
        float avg=0;
        for(int i=0;i<5;i++){
            marks[i] = input.nextInt();

        }
        System.out.print(Arrays.toString(marks));
    }
}*/

/*import java.util.*;
public class java{
    public static void main(String[] args){
        int[] arr = {6,3,4,5,6,2,4,2,3,4,5};
        int[] arr1 = new int[arr.length];
        int count=0;
        Arrays.sort(arr);
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] !=arr[i+1]){
                arr1[count]=arr[i];
                count++;

            }
        }
        arr[count] = arr[arr.length-1];
        for(int i =0;i<arr1.length;i++){
            System.out.println(arr[i]);
        }
    }
}*/

import java.util.Scanner;

import java.util.Scanner;
