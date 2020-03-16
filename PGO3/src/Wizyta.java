import java.util.Date;

public class Wizyta {

    private int nrGabinetu;
    private Date data;
    private Lekarz lekarz;
    private Pacjent pacjent;


    public Pacjent getPacjent() {
        return pacjent;
    }

    public void setPacjent(Pacjent pacjent) {
        this.pacjent = pacjent;
    }

    public Wizyta(int nrGabinetu, Date data){
        if(nrGabinetu<0){
            throw new IllegalArgumentException("Nr gabinetu musi byc wiekszy od 0");
        }
        this.nrGabinetu=nrGabinetu;
        this.data=data;
    }

    public Lekarz getLekarz() {
        return lekarz;
    }

    public void setLekarz(Lekarz lekarz) {
        this.lekarz = lekarz;
    }

    public Date getData() {
        return data;
    }

    public int getNrGabinetu() {
        return nrGabinetu;
    }
}
