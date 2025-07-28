interface Implement {
    void display();
}

interface sample{
    void fun();
    void bun();
}

class container implements Implement,sample{

public void display(){
    System.out.println("displaying");
}
public void fun(){
    System.out.println("funnn");
}
public void bun(){
    System.out.println("bunnn");
}
}

class run{
    public static void main(String[] args) {
        container cont = new container();
        cont.display();
        cont.bun();
        cont.fun();
    }
}