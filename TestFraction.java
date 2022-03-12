public class TestFraction{
    public static void main(String[] args) {
        Fraction f=new Fraction(10,10);
        Fraction f2=new Fraction(20,20);
        f.reduit();
        f2.reduit();
        System.out.println(f);
        System.out.println(f2);
        System.out.println(f.equals(f2));
    }
}