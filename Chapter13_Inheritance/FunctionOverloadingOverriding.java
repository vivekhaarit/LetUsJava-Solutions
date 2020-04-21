package Chapter13_Inheritance;

class B2{
    public void b(){
        System.out.println("base, first version method");
    }
    public void b(String objectname){
        System.out.println("base, second version, called by"+objectname);
    }
}
class D2 extends B2{
    public void b(){
        System.out.println("derived, first version of B is overriden by D");
    }
}
public class FunctionOverloadingOverriding {
    public static void main(String[] args) {
        D2 d = new D2();
        d.b(" derived class object");
    }
}
