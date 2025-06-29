package tokoRoti;

public class Roti {
    private String nama;
    private double harga;
    private int stok;
    
    //construktor
    public Roti(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    
    //getter
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
 
    public int getStok() {
        return stok;
    }
    
    //setter
    public void setNama() {
        this.nama = nama;
    }
    public void setHarga() {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    
    //polymorphism
    public void tampilkanInfo() {
        System.out.println("Nama Roti : "+nama);
        System.out.println("Harga Roti : Rp."+harga);
        System.out.println("Stok : "+stok);
    }
}
