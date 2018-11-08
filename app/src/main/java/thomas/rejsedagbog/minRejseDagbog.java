package thomas.rejsedagbog;

import java.util.ArrayList;

public class minRejseDagbog {
    private long id;
    private String navn;
    private String dato;

    private String beskrivelse;

    public minRejseDagbog(long id, String navn, String dato, String beskrivelse){
        this.id = id;
        this.navn = navn;
        this.dato = dato;
        this.beskrivelse = beskrivelse;

    }
    public minRejseDagbog(String navn, String dato, String beskrivelse){
      /*  this.id = -1;s
        this.navn = navn;
        this.dato = dato;
        this.beskrivelse = beskrivelse;*/
      this(-1,navn,dato,beskrivelse);
    }

    public ArrayList<minRejseDagbog> getMineRejser() {
        return MineRejser;
    }

    public void setMineRejser(ArrayList<minRejseDagbog> mineRejser) {
        MineRejser = mineRejser;
    }

    private ArrayList<minRejseDagbog> MineRejser;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }
}
