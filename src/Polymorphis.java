public class Polymorphis {
    public static void main(String[] args) {
        sample s = new sample();
        s.display();
        s.display(10);
    }
}

// method overloading .... have same method name ut diff signature ... return type and parameter

class sample{

    void display(){
        System.out.println("hello there");
    }
    void display(int a){
        System.out.println(a);
    }

}