public class B {
    void f() throws E1, E2, E3 {
        A a=new A();
        try {
            a.g();
        }
        catch (E1 | E2 | E3 e){
            System.out.println("Exceptie prinsa cu hashCode: "+e.hashCode());
            throw e;//arunc aceeasi exceptie
        }
    }
}
