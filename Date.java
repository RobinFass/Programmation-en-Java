public class Date{
    public int jour;
    public int mois;
    public int annee;

    public Date(int a, int m, int j){
        this.jour=j;
        this.mois=m;
        this.annee=a;
    }

    public String toString(){
        return this.annee+"-"+this.mois+"-"+this.jour;
    }

    public Date lendemain(){
        int jou=this.jour+1,moi=this.mois,ann=this.annee;

        if (moi%2==1 && moi<8){
            if (jou==32){
                jou=1;
                moi++;
            }
        } else if (moi==2){
            if (jou==29){
                jou=1;
                moi++;
            }
        }else if (moi%2==0 && moi>7){
            if (jou==32){
                jou=1;
                moi++;
            }
        } else if (moi%2==0 && moi<8){
            if (jou==31){
                jou=1;
                moi++;
            }
        } else if (moi%2==1 && moi>7){
            if (jou==31){
                jou=1;
                moi++;
            }
        }

        if (moi>12){
            moi=1;
            ann++;
        }

        Date fin=new Date(jou,moi,ann);
        return fin;
    }

    public boolean compdate(Date other){
        return (this.jour==other.jour && this.mois==other.mois && this.annee==other.annee);
    }
}