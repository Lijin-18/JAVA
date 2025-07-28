class Polys {
    
    int age = 10;
    String name = "lijin";

}


// method or field overriding .... child class overrides parent's field and methods 


class copy extends Polys{

    int age = 50;
    boolean isHuman = true;

}

public class Poly{
    public static void main(String[] args) {
        copy cp = new copy();
        System.out.println(cp.age );
    }
}
