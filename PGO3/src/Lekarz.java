import java.util.ArrayList;
import java.util.List;

public class Lekarz {

    private String imie;
    private String nazwisko;
    private String telefon;
    private String stopien;
    private String email;
    private String pesel;
    private double pensja;
    private ArrayList<Wizyta> wizyty=new ArrayList<Wizyta>();



    public Lekarz(String imie, String nazwisko, String email, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.pesel = pesel;
    }

    public void dodajWizyteDoGrafiku(Wizyta wizyta){
        this.wizyty.add(wizyta);
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getStopien() {
        return stopien;
    }

    public void setStopien(String stopien) {
        this.stopien = stopien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPesel() {
        return pesel;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }
}
