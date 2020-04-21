package Chapter13_Inheritance;

class B{
    //private for case-2
    public void b1(){
        System.out.println("I'm in B-b1()");
    }
    //private for case-1,2
    public void b2(){
        System.out.println("I'm in B-b2()");
    }
}
class D extends B{
    public void d1(){
        System.out.println("I'm in D-d1()");
    }
    public void d2(){
        System.out.println("I'm in D-d2()");
    }
}
public class TestingAccessModifiersInBaseAndDerivedClass {
    public static void main(String[] args) {
        B b = new B();
        b.b1();
        b.b2();
    }
}
