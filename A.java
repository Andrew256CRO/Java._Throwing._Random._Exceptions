import java.util.Random;

public class A {
    void g() throws E1, E2, E3{
        Random r=new Random();
        int numarRandom=r.nextInt(3);
        switch (numarRandom){
            case 0:
                throw new E1();
            case 1:
                throw new E2();
            case 2:
                throw new E3();
            default:
                System.out.println("Nu s-a aruncat o exceptie.");
        }
    }
}
