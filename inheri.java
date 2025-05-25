/*public class inheri {
    void eat()
    {
        System.out.println("eatt");
    }
}
class dog extends inheri{
    void bark()
    {
        System.out.println("Bowww");
    }
}
class puppy extends dog{
    void chu()
    {
        System.out.println("cutieeeeeeee");
    }
}
class cat extends inheri{
    void meo()
    {
        System.out.println("meow");
    }
}
class hellooo{
    public static void main(String[] args) {
        puppy obi=new puppy();
        obi.chu();
        obi.bark();
        obi.eat();
        cat obii =new cat();
        obii.meo();
    }
}*/

/*class parent{
    void sum(int a, int b)
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
class hi{
    public static void main(String[] args) {
        parent hu=new parent();
        hu.sum(2,3,5);
    }
}*/
/*class area{
    void sq(int a )                       //method overloading
    {
        System.out.println(a*a);
    }
    void sq(int a,int b)
    {
        System.out.println(a*b);
    }
}
class hok{
    public static void main(String[] args) {
        area hy=new area();
        hy.sq(2);
    }
}*/

/*class parent{
    void eat()
    {
        System.out.println("maggiee");
    }
}
class child extends parent{
    void eat()
    {
        System.out.println("pasta");
        super.eat();
    }
}
class go{
    public static void main(String[] args) {
        parent hj=new child();
        hj.eat();
    }
}*/
class animal{
    void sound()
    {
        System.out.println("aa");          //method overriding
    }
}
class dog extends animal{
    void sound()
    {
        System.out.println("bow bow");
        super.sound();
    }
}
class you{
    public static void main(String[] args) {
        animal de=new dog();
        de.sound();
    }
}

//abstract class
abstract class payment{
    abstract void pay(int a);
    void print()
    {
        System.out.println("payment done");
    }
}
class upipayment extends payment{
    void pay(int a)
    {
        System.out.println("payment done via upi" + a);
    }
}
class cardpayment extends payment{
    void pay(int a)
    {
        System.out.println("payment done via card" + a);
    }
}
class kio{
    public static void main(String[] args) {
        payment gt=new upipayment();
        gt.pay(4785);
        gt.print();
        payment re = new cardpayment();
        re.pay(58496);
        re.print();
    }
}

abstract  class shape{
    abstract void area(int a,int b);
}
class circle extends shape{
    void area(int a,int b){
        System.out.println(2*3.14*a);
    }
}
class rectt extends shape{
    void area(int a,int b){
        System.out.println(a*b);
    }
}
class ty {
    public static void main(String[] args) {
        shape lo=new circle();
        lo.area(1,7);
        shape io=new rectt();
        io.area(2,5);
    }
}


abstract class Animal{
    abstract void Sound();
}
class Dog extends Animal{
    @Override
    void Sound() {
        System.out.println("Bowwwww");
    }
}
class Cat extends Animal{
    void Sound(){
        System.out.println("Meowwwwww");
    }
}
class ji{
    public static void main(String[] args) {
        Animal kii=new Dog();
        kii.Sound();
        Animal lii =new Cat();
        lii.Sound();
    }
}