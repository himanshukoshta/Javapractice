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
