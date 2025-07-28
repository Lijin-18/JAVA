class Car {
    
    String model ;
    int year;

    private void display() {
        System.out.println(model);
        System.out.println(year);
    }

    public void setValues(String str , int num) {
        model = str;
        year = num;
        display();
    }
}

class Cars {
        public static void main(String[] args) {

        // n number of objects can be created from a class
        
        Car c = new Car();
        c.setValues("honda", 8746);
        

        // System.out.println();

        // Car c2 = new Car();
        // c2.model = "skyliner";
        // c2.year = 2011;
        // c2.display();

    }
}
