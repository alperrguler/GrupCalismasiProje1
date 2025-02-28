package kullanici_kayit_sistemi;

import java.time.LocalDate;

public class Message {
    protected int id;
    protected Kullanici alici;
    protected Kullanici gonderici;
    protected String icerik;
    protected LocalDate gonderilmeTarihi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Kullanici getAlici() {
        return alici;
    }

    public void setAlici(Kullanici alici) {
        System.out.println("MESAJDAKI SET ALICI");
        this.alici = alici;
    }

    public Kullanici getGonderici() {
        return gonderici;
    }

    public void setGonderici(Kullanici gonderici) {
        this.gonderici = gonderici;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public LocalDate getGonderilmeTarihi() {
        return gonderilmeTarihi;
    }

    public void setGonderilmeTarihi(LocalDate gonderilmeTarihi) {
        this.gonderilmeTarihi = gonderilmeTarihi;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", alici=" + alici +
                ", gonderici=" + gonderici +
                ", icerik='" + icerik + '\'' +
                ", gonderilmeTarihi=" + gonderilmeTarihi +
                '}';
    }
}