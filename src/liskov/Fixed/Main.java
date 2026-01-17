package liskov.Fixed;

public class Main {
    public static void main(String[] args){
        SquareOriginal square = new SquareOriginal();

        square.setSide(2.5);
        System.out.println("The square´s area is: " + square.area());
    }
}
