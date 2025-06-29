package tokoRoti;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner; 

public class TokoRoti {
    private ArrayList<Roti> daftarRoti = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    
    public void menu(){
        int pilihan = 0;
        do {
            System.out.println("\n=== MENU TOKO ROTI NIA ===");
            System.out.println("1. Tambah Roti");
            System.out.println("2. Lihat Daftar Roti");
            System.out.println("3. Beli Roti");
            System.out.println("4. Keluar");
            System.out.println("Pilih menu : ");
            
            try {
                pilihan = input.nextInt();
                input.nextLine();
                
                switch (pilihan){
                    case 1:
                        tambahRoti();
                        break;
                    case 2:
                        tampilkanRoti();
                        break;
                    case 3:
                        beliRoti();
                        break;
                    case 4:
                        System.out.println("Terima kasih telah membeli!");
                        break;
                    default:
                        System.out.println("Menu Tidak Valid!");
                }
            }catch (InputMismatchException e){
                System.out.println("Input harus berupa angka!");
            }
        }while (pilihan !=4);
    }
    
    private void tambahRoti(){
        try {
            System.out.print("Nama Roti : ");
            String nama = input.nextLine();
            System.out.print("Harga : ");
            double harga = input.nextDouble();
            System.out.print("Stok : ");
            int stok = input.nextInt();
            input.nextLine(); //flush
            
            System.out.print("Apakah ini roti manis? (y/n): ");
            String jawab = input.nextLine();
            
            if (jawab.equalsIgnoreCase("y")) {
                System.out.print("Masukkan rasa : ");
                String rasa = input.nextLine();
                RotiManis rm = new RotiManis(nama, harga, stok, rasa);
                daftarRoti.add(rm);
            }else {
                Roti r = new Roti(nama, harga, stok);
                daftarRoti.add(r);
            }
            
            System.out.println("Roti berhasil ditambahkan!");
        } catch (InputMismatchException e){
            System.out.println("Input tidak valid, gagal menambahkan roti.");
            input.nextLine();
        }
    }
    
    private void tampilkanRoti(){
        if (daftarRoti.isEmpty()){
            System.out.println("Belum ada roti.");
        } else {
            System.out.println("\n=== DAFTAR ROTI ===");
            for (int i = 0; i < daftarRoti.size(); i++) {
                System.out.println("No. "+ (i + 1));
                daftarRoti.get(i).tampilkanInfo(); //polymorphism
                System.out.println("----------------------");
            }
        }
    }
    
    private void beliRoti(){
        tampilkanRoti();
        if (daftarRoti.isEmpty()) return;
        
        try {
            System.out.print("Pilih nomor roti : ");
            int no = input.nextInt();
            input.nextLine();
            
            if (no < 1 || no > daftarRoti.size()){
                System.out.println("Nomor tidak valid.");
                return;
            }
            Roti r = daftarRoti.get(no - 1);
            
            System.out.print("jumlah yang dibeli : ");
            int Jumlah = input.nextInt();
            input.nextLine();
            
            if (Jumlah > r.getStok()){
                System.out.println("Stok tidak mencukupi.");
            } else {
                r.setStok(r.getStok()- Jumlah);
                double total = Jumlah * r.getHarga();
                System.out.println("Total pembayaran : Rp."+total);
                System.out.println("Pembelian berhasil!");
            }
        } catch (InputMismatchException e) {
            System.out.print("Input tidak valid.");
            input.nextLine();
        }
    }
}
