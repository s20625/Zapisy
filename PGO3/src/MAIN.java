import java.util.Date;

public class MAIN {

    public static void main(String[] args){

        Wizyta w=new Wizyta(2, new Date(2010, 11, 11));

        Lekarz l1=new Lekarz("jan", "kowalski", "jk@gm.com", "00000000");

        w.setLekarz(l1);
        l1.dodajWizyteDoGrafiku(w);

        Pacjent p1= new Pacjent("jan", "Malewski", "000000000", "email");

        w.setPacjent(p1);

        Wpis w1=new Wpis("jan kowalski", "opis", new Date());
        p1.dodajWpisdoKsiazeczki(w1);




    }
}
