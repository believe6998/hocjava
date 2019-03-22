package entity;

public class calculator {
    public static int add(int a, int b){
        int d = a + b  ;
        return d;
    }
    public static int minus(int a, int b){
        int d = a - b  ;
        return d;
    }
    public static int multiply(int a, int b){
        int d = a * b  ;
        return d;
    }
    public static float divide(float a, float b){
        if (b == 0){
            System.out.println("so bi chia phai khac 0.");
        } else {
            return (float) a / b;
        }
        return a / b;
    }
}





