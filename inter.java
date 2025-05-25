interface client1{
    void show();
}
interface client2{

    void show();
    void print();
}
class inter implements client1,client2{
    @Override
    public void show() {
        System.out.println("for both");
    }

    @Override
    public void print() {

    }

    public static void main(String[] args) {

    }
}

interface  walkable{
    void walk();
    void run();
}
interface  runable{
    void walk();
    void run();
}
class dood implements walkable,runable{
    public void run()
    {
        System.out.println("hhi");
    }

    @Override
    public void walk() {
        System.out.println("lo");
    }

    public static void main(String[] args) {
        dood obj=new dood();
        obj.run();
        obj.walk();
    }
}


interface  A{
    void display();

interface  B{
    void display();

}
class demo implements A,B{
    public void display()
    {
        System.out.println("hhi");
    }

        public static void main(String[] args) {
        demo obj=new demo();
        obj.display();

    }
}
}
