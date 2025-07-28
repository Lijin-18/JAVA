class Calculator {
    
    public int add(int a , int b){
        return a + b;
    }

    public int sub(int a , int b){
        return a-b;
    }
    public int multi(int a , int b){
        return a*b;
    }
    public float div(int a , int b){

        if(a==0 || b==0){
            return 1;
        }

        return a/b;
    }
}

class calcuu {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 56));
        System.out.println(calc.div(10, 0));
    }
}
