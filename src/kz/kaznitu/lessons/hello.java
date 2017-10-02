package kz.kaznitu.lessons;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello Adilet!");
        System.out.println("Бұл зертханалық жұмыстын мақсаты:");
        System.out.println("GitHup-пен жұмысжасап үйрену.");

        int a = MyMath.kvadrat(5) ;
        int b = MyMath.kub(5) ;

        System.out.println("a = " + a) ;
        System.out.println("b = " + b) ;

        System.out.println(MyMath.max(8,9));
    }
}
