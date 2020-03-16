import java.util.ArrayList;
import java.util.Date;

public class Pacjent {
    private String imie;
    private String nazwisko;
    private String pesel;
    private String email;
    private ArrayList<Wpis> ksiazeczka=new ArrayList<>();


    public Pacjent(String imie, String nazwisko, String pesel, String email) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.email = email;
    }
    //public void dodajWpisdoKsiazeczki (String autor, String opis, Date data){
    //    this.ksiazeczka.add(;
    //}


    public void dodajWpisdoKsiazeczki (Wpis nowyWpis){
        this.ksiazeczka.add(nowyWpis);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
