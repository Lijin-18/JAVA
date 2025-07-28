abstract class vehicle {
    
    boolean hasTyres = true;
    int tyreCount = 4;

    abstract void run();

}

class check extends vehicle{
    void run(){
        System.out.println("runnning" +  "and has " + tyreCount + " tyre");
    }
}

class testing{
    public static void main(String[] args) {
        check ch = new check();
            ch.run();
        
    }
}