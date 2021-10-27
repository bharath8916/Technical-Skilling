/*public class co3
{
    static int a = 10;
    static void disp()
        {
            System.out.println("Value of a "+a);
        }
    public static void main(String[] args){

            System.out.println(a);
            disp();

    }
}*/
/*public class co3
{
    int a = 10;
    void disp()
    {
        System.out.println("Value of a "+a);
    }
    public static void main(String[] args)
    {
        co3 obj = new co3();//Creating an object for the class "co3"
        System.out.println(obj.a);
        obj.disp();

    }
}*/
/*public class co3
{
    int a = 0;
    void update(int value)
    {
        a= value;
    }
    void disp()
    {
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        co3 obj1 = new co3();
        System.out.println(obj1.a);
        obj1.update(10);
        obj1.disp();
    }

}*/
/*class co3
{
    int id;
    String name;
    int salary;
    void setid(int i)
    {
        id=i;
    }
    void setname(String n)
    {
        name=n;
    }
    void setsal(int s)
    {
        salary = s;
    }
    void getemp()
    {
        System.out.println(name+" salary is "+salary);
    }
    public static void main(String[] agrs)
    {
        co3 obj2 = new co3();
        obj2.setid(80013);
        obj2.setname("Bharath");
        obj2.setsal(20000);
        obj2.getemp();


    }

}*/
/*public class co3
{
    int a = 100;
    int getvalue()
    {
        return a;

    }
    public static void main(String[] agrs)
    {
        co3 obj3 = new co3();
        System.out.println(obj3.getvalue());
    }
}*/

/*public class co3
{
    double balance;
    void addbalance(double value)
    {
        balance = balance+value;
    }
    double getbalnce()
    {
        return balance;
    }
    int withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient balance");
            return -1;
        }
        else
        {
            balance = balance-amount;
            System.out.println("Avaiable balance is: "+balance);
            System.out.println("Withdrew amount is: "+amount);
        }
        return 0;
    }
    public static void main(String[] args)
    {
        co3 acc = new co3();
        acc.addbalance(1000);
        acc.addbalance(acc.getbalnce()*2);
        acc.withdraw(1000);
        System.out.println(acc.getbalnce());
    }
}*/

/*public class co3
{
    public static void main(String[] args)
    {
        subclass sc = new subclass();
        sc.disp();
        subclass1 sub1 = new subclass1();
        sub1.disp1();
    }
}
class subclass
{
    String msg = "Hello Welcome to class";
    void disp()
    {
        System.out.println(msg);
    }
}
class subclass1
{
    String msg="in sub class 1";
    void disp1()
    {
        System.out.println(msg);
    }
}*/

/*public class co3
{
    public static void main(String[] args)
    {
        sub sc1 = new sub();
        sub sc2 = new sub();
        sub sc3 = new sub();
        sc1.disp("Bharath");
        sc2.disp("Krishna");
        sc3.disp("Sri");
        System.out.println(sc1.myname+","+sc2.myname+","+sc3.myname);

    }
}

class sub
{
    String msg = "Hello ";
    String myname;
    void disp(String name)
    {
        myname=name;
        System.out.println(msg+name);
    }
}*/
/*class constructor{
    constructor(){
        System.out.println("this is default constructor");
    }
    constructor(int a){
        System.out.println("this is constructor of number"+ a);
    }
}
public class co3 {
    public static void main(String[] args) {
        constructor con1 = new constructor();
        constructor con2 = new constructor(143);
    }

}*/

/*class Number
{
    int no = 0;
    int addNo(int no)
    {
        this.no=this.no+no;
        return(no);
    }
}
public class co3
{
    public static void main(String[] args)
    {
        Number n1 = new Number();
        int res = n1.addNo(10);
        System.out.println(res);
    }
}*/
/*class Sample{
    Sample()
    {
        this("Java");
        System.out.println("Default constructor");
    }
    Sample(String str){

        System.out.println("One argument constructor "+str);
    }
}
public class co3
{
    public static void main(String[] args){
        Sample a1 = new Sample();
    }
}*/
// Multiple "this() constructor"

/*class Sample
{
    Sample()
    {
        System.out.println("Default constructor");
    }
    Sample(String str)
    {
        this();
        System.out.println("One argument constructor "+str);
    }
    Sample(String str,int no)
    {
        this(str);
        System.out.println("Two arguments constructors "+no);
    }
}

public class co3
{
    public static void main(String[] args)
    {
        Sample a1= new Sample();
        Sample a2= new Sample("Bharath");
        Sample a3= new Sample("Bharath",13);
    }
}*/
/*class Number
{
    static int a = 1;
    void add(int num)
    {
        a= a+num;
    }
}
public class co3
{
    public static void main(String[] args)
    {
        Number n1 = new Number();
        n1.add(10);
        Number n2 = new Number();
        n2.add(20);
        System.out.println(n1.a);
        System.out.println(n2.a);
        System.out.println(Number.a);

    }
}*/


/*class StaticBlockExample {
    StaticBlockExample() {
        System.out.println("Within Constructor");
    }

    static {
        System.out.println("Within 1st static block");
    }

    static void m1() {
        System.out.println("Within static m1 method");
    }

    static {
        System.out.println("Within 2nd static block");
        m1();
    }
}
public class co3{
    public static void main(String[] args){
        System.out.println("Within main");
        StaticBlockExample x = new StaticBlockExample();
    }
    static
    {
        System.out.println("Within 3rd static block");
    }
}*/

/*class box{
    double dimension(double width, double height, double depth) {
        double vol = 0.0;
        vol = width*height*depth;
       return vol;
    }
}
public class co3{
    public static void main(String[] args){
        box s = new box();
        double res=s.dimension(1,2,3);
        System.out.println(res);

    }
}*/
/*import java.lang.Math;
class calc
{
    static double powerInt(int num1, int num2)
    {
     return (Math.pow(num1,num2));
    }
    static double powerDouble(double num3,int num4)
    {
        return (Math.pow(num3,num4));
    }


}
public class co3
{
    public static void main(String[] args)
    {
        calc s = new calc();
        double res=calc.powerDouble(2.3,3);
        double res1=calc.powerInt(5,5);
        System.out.println("For powerDouble method "+res);
        System.out.println("For powerInt method "+res1);
    }
}*/
//Encapsulation
/*class first{
    protected int a = 10;
    protected int b = 20;
    void disp()
    {
        System.out.println(a);
    }
    int sum()
    {
        return a+b;
    }
    int geta()
    {
        return a;
    }
    void seta(int call)
    {
     a=call;
    }
}
public class co3
{
public static void main(String[] args)
{
    first fob = new first();
    System.out.println(fob.geta());
    fob.disp();
    System.out.println(fob.a);
    fob.seta(22);
    System.out.println(fob.sum());
}
}*/
/*class co3
{
    int m_x;
    int m_y;
    public co3(int x,int y)
    {
        m_x=x;
        m_y=y;
    }
    public co3() {
    }
    public static void main(String[] args)
    {
        co3 p = new co3();

    }
}*/
//Inheritance
/*class a
{
    int m,n;
    void display()
    {
        System.out.println("m and n are: "+m+" "+n);

    }
}
class b extends a
{
    int c;
    void display1()
    {
        System.out.println("c :"+c);
    }
    void sum()
    {
        System.out.println("m+n+c = "+(m+n+c));
    }
}
public class co3
{
    public static void main(String[] args)
    {
        b  x = new b();
        x.c=7;
        x.m=9;
        x.n=10;
        x.sum();
        x.display();
        x.display1();

    }
}*/
/*class Employee
{
    int salary;
    Employee()
    {
        salary=1000;
    }

}
class program extends Employee{
    int bouns=0;
    program(int sal,int bon)
    {
        salary = sal;
        bouns = bon;
    }
}
public class co3
{
    public static void main(String[] args)
    {
        program pg = new program(2000,200);
        System.out.println(pg.bouns);
        System.out.println(pg.salary);
        Employee emp = new Employee();
        System.out.println(emp.salary);

    }
}*/
/*class a
{
    int money;
    private int pocketmoney;
    void fill(int money,int pocketmoney)
    {
        this.money=money;
        this.pocketmoney=pocketmoney;

    }
    public int getPocketmoney()
    {
        return getPocketmoney();
    }
}*/
//Constructor
/*class A
{
    int a;
    A()
    {
        a=0;
    }



    A(int val)
    {
        a = val;

    }
}
class B extends A
{
        int b;
        B()
        {
        b = 20;
        System.out.println("In a class B constructor");
        }
        B(int val)
        {
            b=val;
            System.out.println("a is "+a+" b is "+b);
        }
}
public class co3{
    public static void main(String[] args)
    {

        B s1 = new B(50);
        System.out.println(s1.a+" "+s1.b);
    }

}*/
/*class A
{
    int a;
    A()
    {
        a=10;
        System.out.println("in A construtors");

    }


    A(int val)
    {
        a = val;

    }
}
class B extends A
{
    int b;
    B()
    {
        b = 20;
        System.out.println("In a class B constructor");
    }
    B(int val)
    {
        super(val*2);
        b=val;
        System.out.println("a is "+a+" b is "+b);
    }

}
public class co3{
    public static void main(String[] args)
    {

        B s1 = new B(50);
        System.out.println(s1.a+" "+s1.b);
    }

}*/
/*class A
{
    int val = 0 ;

}
class B extends A
{
    int val=0;
    void set(int val)
    {
        val = val +10;
        this.val=val+20;
        super.val=val*2;
        System.out.println(val+" "+this.val+" "+super.val);
    }

}
public class co3 {
    public static void main(String[] args) {
        B obj = new B();
        obj.set(20);
    }
}*/
/*class animal
{
    void eat()
    {
        System.out.println("eating...");
    }
}
class dog extends animal{
    void bark()
    {
        System.out.println("barking...");
    }
}
class test{
    public static void main(String[] args)
    {
        dog d = new dog();
        d.bark();
        d.eat();
        animal an = new animal();
        an.eat();

    }
}*/
/*class animal
{
    void eat()
    {
        System.out.println("eating...");
    }
}
class dog extends animal{
    void bark()
    {
        System.out.println("barking...");
    }
}
class babydog extends dog{
    void weep()
    {
        System.out.println("weeding..");
    }
}
public class co3
{
    public static void main(String[] args)
    {
        babydog d = new babydog();
        d.bark();
        d.eat();
        d.weep();
    }
}*/
/*class Sum
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a,double b)
    {
        return a+b;
    }
    static int divide(int a, int b)
    {
        return a/b;
    }
    static double divide(double a,double b)
    {
        return a/b;
    }
}
public class co3
{
    public static void main(String[] args)
    {
        System.out.println(Sum.add(17,13));
        System.out.println(Sum.add(14.0,1.0));
    }
}*/
/*class Shape
{
    public void area()
    {
        System.out.println("The formula for of");
    }
}
class Triangle extends Shape
{
    public void area()
    {
        System.out.println("Triangle is 1/2 * base * height");
    }
}
class Circle extends Shape
{
    public void area()
    {
        System.out.println("Circles is 3.14 * radius *radius");
    }
}
public class co3
{
    public static void main(String[] args)
    {
        Shape myshape = new Shape();
        Shape myTriangles = new Triangle();
        Shape myCircles = new Circle();
        myshape.area();
        myTriangle.area();
        myCircle.area();
    }
}*/
/*abstract class main1
{
    void disp1()
    {
        System.out.println("In disp1 of first");
    }
}
class main2 extends main1
{
    void disp()
    {
        System.out.println("In second class");
    }
}
public class co3
{
    public static void main(String[] args)
    {
        main2 o = new main2();
        o.disp();
        o.disp1();
    }
}*/

abstract class Figure
{
    double dimension1;
    double dimension2;
    Figure(double x,double y)
    {
        dimension1 = x;
        dimension2 = y;
    }
}
class Triangle extends Figure
