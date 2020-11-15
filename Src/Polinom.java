import java.util.ArrayList;


public class Polinom {

    public ArrayList<Monom> polinom;

    Monom A=new Monom();



    public Polinom()
    {
        polinom=new ArrayList<Monom>();

    }
    public void adugaremonoame(Monom X)
    {
        polinom.add(X);
    }

    public void adddd(Monom mon)
    {
        int adaugare=0;
        for(Monom i: this.polinom)
        {
            if (mon.getPutere() == i.getPutere())
            {
                i.setCoef((float) (mon.getCoeficient() + i.getCoeficient()));
                adaugare=1;
            }
        }
            if (adaugare == 0)
                polinom.add(mon);


    }



    public void Adunare (Polinom y)
    {
        for(Monom i : y.polinom)
            this.adddd(i);
    }

    public void Scadere(Polinom y)
    {
        for(Monom i : y.polinom)
        {
            i.setCoef((float) -(i.getCoeficient()));
            this.adddd(i);
        }

    }
    public void Derivare()
    {
        for(Monom i : polinom)
        {
            i.setCoef((float) (i.getCoeficient()*i.getPutere()));
            i.setPutere((int) (i.getPutere()-1));

        }
    }
    public void Integrare()
    {
        for(Monom i : polinom)
        {
            i.setCoef((float) (i.getCoeficient()*(1/(i.getPutere()+1))));
            i.setPutere((int) (i.getPutere()+1));

        }
    }


    public String toString() {
        String s="";
        for(Monom i :polinom)

        { if(i.getCoeficient()>0) {s+="+";}
            s+=i.getCoeficient()+"x"+"^"+i.getPutere();


        }
        return s;
    }

}
