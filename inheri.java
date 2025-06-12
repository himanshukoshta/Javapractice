public class inheri {
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
}

class parent{
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
}
class area{
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
}

class parent{
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
}
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

