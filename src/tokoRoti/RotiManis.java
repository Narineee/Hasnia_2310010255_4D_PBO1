package tokoRoti;

public class RotiManis extends Roti{
    private String rasa;
    
    public RotiManis(String nama, double harga, int stok, String rasa) {
        super(nama, harga, stok);
        this.rasa = rasa;
    }
    public String getRasa(){
        return rasa;
    }
    public void setRasa(String rasa){
        this.rasa = rasa;
    }
    
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Rasa : "+rasa);
    }
}
