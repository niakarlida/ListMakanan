package id.ac.poliban.mi.nia.listmakanan;

public class Makanan {
    private String makanan;
    private String namaMakanan;
    private String deskripsiMakanan;

    public Makanan(String makanan, String namaMakanan, String deskripsiMakanan) {
        this.makanan = makanan;
        this.namaMakanan = namaMakanan;
        this.deskripsiMakanan = deskripsiMakanan;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getDeskripsiMakanan() {
        return deskripsiMakanan;
    }

    public void setDeskripsiMakanan(String deskripsiMakanan) {
        this.deskripsiMakanan = deskripsiMakanan;
    }
}
