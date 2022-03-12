public class Fraction{
    
    private int num; //numerateur
    private int den; //denominateur


    public Fraction(int n, int d){
        this.num=n;
        this.den=d;
        this.reduit();
    }

    public static int PGCD(int a, int b){
        int grand=0;
        int pgcd=1;
        if (a>b){grand=a;}
        else{grand=b;}
        for(int i=1;i<=grand;i++){
            if (a%i==0 && b%i==0){
                pgcd=i;
            }
        }
        return pgcd;
    }

    public void reduit(){
        int pgcd=PGCD(this.num,this.den);
        this.num/=pgcd;
        this.den/=pgcd;
    }

    public float res(){
        return this.num/this.den;
    }

    public String toString(){
        return this.num+"/"+this.den;
    }

    public int getnum(){return this.num;}
    public int getden(){return this.den;}

    public boolean equals(Fraction other){
        return this.num==other.getnum()&&this.den==other.getden();
    }
}