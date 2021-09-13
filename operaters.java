/*public class operaters {
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("The value of a is "+a+" and b is "+b);
        System.out.println("The result of a+b is "+(a+b));
        System.out.println("The result of a-b is "+(a-b));
        System.out.println("The result of a*b is "+(a*b));
        System.out.println("The result of a/b is "+(a/b));
        System.out.println("The result of a%b is "+(a%b));




    }
}*/

/*public class operaters
{
    public static void main(String[] args)
    {
        char a = (args[0].charAt(0));
        int b = Integer.parseInt(args[1]);
        if (a == 'F' && b >= 1 && b <= 58)
            System.out.println("Interest = 8.2%");
        else if (a == 'F' && b>=59 && b<=120)
            System.out.println("Interest = 7.6%");
        else if (a == 'M' && b>=1 && b<=60)
            System.out.println("Interest = 9.2%");
        else if (a == 'M' && b>=61 && b<=120)
            System.out.println("Interest = 8.3%");


    }
}*/
/*public class operaters
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);
        switch (num)
        {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Oct");
                break;
            case 10:
                System.out.println("Sep");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

    }
}*/
/*public class operaters
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);
        int sum = 1;
        while(num!=0)
        {
            int r;
            r = num%10;
            sum = sum  + r ;
            num = num/10;
        }
        System.out.println(sum);
    }
}*/

/*public class operaters
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);
        boolean f = false;
        if (num>0)
        {
            for (int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i == 0)
                {
                    f = true;

                }
            }
        }
        if(f)
        {
            System.out.println("NOT PRIME");
        }
        else
        {
            System.out.println("PRIME");
        }
    }
}*/
/*public class operaters {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean f = false;
        if (num % 2 == 0)
        {
            if (num == 2)
            {
                System.out.println("PRIME");
            }
            else
            {
                System.out.println("NOT PRIME");
            }
        }
        else
        {
            if (num > 0) {
                double squa = Math.sqrt(num);
                for (int i = 3; i <= squa; i++) {
                    if (num % i == 0) {
                        f = true;
                        break;
                    }
                }
            }
            if (f) {
                System.out.println("NOT PRIME");
            } else {
                System.out.println("PRIME");
            }
        }
    }
}*/

/*public class operaters
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);
        int check = num;
        int sum = 0;
        while(num!=0)
        {
            int r;
            r = num%10;
            sum = r + sum*10 ;
            num = num/10;
        }

        if (check==sum) {
            System.out.println(sum+" PALINDROME");
        }
        else{
            System.out.println("NOT PALINDEOME");
        }
    }
} */
/*public class operaters{
    public static void main(String[] args){
        int[] x;
        x = new int[5];
        x[0]=13;
        x[4]=23;
        System.out.println("Element at index 0 "+x[0]);
        System.out.println("Element at index 1 "+x[1]);
        System.out.println("Element at index 4 "+x[4]);

    }
}*/
/*public class operaters{
    public static void main(String[] args){
        System.out.println("The Number of Arguments are:"+args.length);
        for(int i = 0; i<args.length;i++)
        {
            System.out.println(i+1+" "+args[i]);
        }
    }
}*/
/*public class operaters {
    public static void main(String[] args){
        int[] a={5,3,10,4,2};
        int x=0;
        int y=999999;
        for(int i=0;i<a.length;i++)
        {
              if(x<a[i])
              {
                  x=a[i];

              }
              if(y>a[i]){
                  y=a[i];
              }
        }
        System.out.println("Max value is:"+x);
        System.out.println("Min value is :"+y);
    }
}*/

/*public class operaters{
    public static void main(String[] args){
        int[] a= {5,3,10,4,2};
        int [] b = new int[5];
        int mi=99999;
        int ma=0;
        int mi1=9999;
        int ma1=0;
        for(int i =0;i<a.length;i++){
            if(ma>a[i]){
                ma=a[i];
            if(mi<a[i]){
                mi=a[i];
            }
            if(ma>ma1){
                ma1=ma;

            }
            if (mi<mi1){
                mi1=mi;
            }
            }
        }
        System.out.println("Max value is:"+mi);
        System.out.println("Min value is :"+ma);
        System.out.println("Max value is:"+mi1);
        System.out.println("Min value is :"+ma1);
    }
}*/
/*public class operaters{
    public static void main(String[] args){
        int  a = Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int sum=0;
        int[] arr ={1,6,2,3,4,7};
        for(int i =0;i<arr.length;i++) {
            if (arr[i] == a) {
                a = i;
            }
            if (arr[i] == b) {
                b = i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<a){
                 sum = sum+arr[i];
            }
            if(i>b){
                sum = sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}*/
/*public class operaters {
    public static void main(String[] args) {
       java.sayHi();
        java.sayAge();
    }
}*/
//Bubble sort
/*public class operaters{
    public static void main(String[] args){
        int temp = 0;
        int[] arr={3,4,2,30,22,12};
        for(int j = 0;j < arr.length;j++){
            for(int k = j+1; k < arr.length;k++){
                if(arr[j] > arr[k]){
                    temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}*/
/*public class operaters{
    public static void main(String[] args){
        int[] arr = new int[]{ 1,2,3,4,5,6,7,8};
        int a = 2;
        int index=1;
        System.out.println(arr.length);
    }
}*/

import java.util.Arrays;
import java.util.Scanner;

/*public class operaters{
    public static void main(String[] args){
        int  a = Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int q=0;
        int w=0;
        int sum=0;
        int[] arr ={1,6,2,7,1,6,3,4,7,6,6,7,7};
        for(int i =0;i<arr.length;i++) {
            if (arr[i] == a) {
                q = i;

            }
            if (arr[i] == b) {
                w = i;

            }

            for(int j=q;j<=w;j++){
                System.out.println(j);
                arr[j]=0;

            }
        }

        for(int i=0;i<arr.length;i++){
            if(i<q){
                sum = sum+arr[i];
                System.out.println(arr[i]);
                System.out.println();

            }
            if(i>w){
                sum = sum+arr[i];
                System.out.println(arr[i]);
            }
        }
        System.out.println(sum);
    }
}*/
/*public class operaters{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        int[] arr1 = new int[10];
        for (int i = 0; i < arr.length; i++)
        {
            int a = arr[i];
            if (a == arr[i])
            {

            }
        }
        System.out.println(Arrays.toString(arr));
    }
    }*/
class operaters
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String st1=sc.nextLine();
        System.out.println(st1.substring(1,st1.length()-1));
    }
}
