public class TestDate{
    public static void main(String[] args){
        Date d1=new Date(1,1,1);
        Date d2=new Date(12,12,12);
        Periode per=new Periode(d1, d2);

        System.out.println(per);
        per.prolonge();
        System.out.println(per);

    }
}