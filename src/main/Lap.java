package main;

public class Lap {
    private String szin;
    private String ertek;
    public Lap(String szin, String ertek) {
        this.szin = szin;
        this.ertek = ertek;
    }
    public String getSzin() {
        return szin;
    }
    public String getErtek() {
        return ertek;
    }
    public String megj() {
        return szin + "_" + ertek;
    }
}
