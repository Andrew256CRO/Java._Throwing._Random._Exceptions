public class TestPrb3 {
    public static void main(String[] args) {
        B b=new B();
        //prima varianta de catch
        /*try {
            b.f();
        }
        catch (E1 | E2 |E3 e){
            System.out.println("Exceptie prinsa cu hashCode: "+e.hashCode());
        }*/
        //a doua varianta de catch
        try {
            b.f();
        }
        catch (E1 e){
            System.out.println("Exceptie E1 prinsa cu hashCode: "+e.hashCode());
        }
        catch (E2 e){
            System.out.println("Exceptie E2 prinsa cu hashCode: "+e.hashCode());
        }
        catch (E3 e){
            System.out.println("Exceptie E3 prinsa cu hashCode: "+e.hashCode());
        }
    }
}