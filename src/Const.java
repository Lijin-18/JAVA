public class Const {

    String name ;

 // parameterized

    Const(String value){

        name = value;

    }
}

class display{

    display(){
        System.out.println("displayyyyy");  // non parametarized constructor
    }
}

class print{
    public static void main(String[] args) {
        Const fn = new Const("lijin");
        System.out.println(fn.name);

        display disp = new display();   
    }
}