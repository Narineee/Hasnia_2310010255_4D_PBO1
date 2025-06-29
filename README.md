# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi Toko Roti menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi Toko Roti ini dibuat menggunakan bahasa pemrograman Java dan dijalankan secara console. Fungsinya adalah untuk mengelola daftar roti, termasuk menambahkan roti baru, melihat daftar roti, dan melakukan pembelian roti.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Roti`, `RotiManis`, `TokoRoti` dan `TokoRotiBeraksi` adalah contoh dari class.

```bash
public class Roti {
    ...
}

public class RotiManis extends Roti {
    ...
}

public class TokoRoti {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Roti r = new Roti(nama, harga, stok);` adalah contoh pembuatan object.

```bash
Roti r = new Roti(nama, harga, stok);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `harga`, `stok`, dan `rasa` adalah contoh atribut.

```bash
private String nama;
private double harga;
private int stok;
```

Class RotiManis juga menambahkan atribut:
```bash
private String rasa;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Roti` dan `RotiManis`.

```bash
public Roti(String nama, double Harga, int stok) {
    this.nama = nama;
    this.harga = harga;
    this.stok = stok;
}

public RotiMAnis(String nama, double Harga, int stok, String rasa) {
    super(nama, Harga, stok);
    this.rasa = rasa;
}

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setHarga`, `setStok` dan `setRasa` adalah contoh method mutator.

```bash
public void setStok(int stok) {
    this.stok = stok;
}

public void setHarga() {
    this.harga = harga;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getHarga`, `getStok`, dan `getRasa` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public double getHarga() {
    return harga;
}

public int getStok() {
    return stok;
}

public int getRasa() {
    return rasa;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `harga` dan `stok` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private double harga;
private int stok;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `RotiManis` mewarisi `Roti` dengan sintaks `extends`.

```bash
public class RotiManis extends Roti {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanIinfo()` di `Roti` merupakan overloading method `tampilkanInfo` dan `tampilkanInfo` di `RotiManis` merupakan override dari method `tampilkanInfo` di `Roti`.

```bash
public String tampilkanInfo() {
    System.out.println("Nama Roti : "+nama);
}

@Override
public String tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Rasa : "+rasa);
}
```

10. **Seleksi** adalah statement kontrol yang Digunakan pada saat menambahkan roti dan saat proses pembelian:.

```bash
if (jawab.equalsIgnoreCase("y")) {
    System.out.print("Masukkan rasa : ");
    String rasa = input.nextLine();
    RotiManis rm = new RotiManis (nama, harga, stok dan rasa);
} else {
    RotiManis r = new Roti (nama, harga, stok);

}

public void menu() {
    switch(pilihan) {
        case 1:
            tambahRoti();
        case 2:
            tampilkanRoti();
        case 3:
            beliRoti();
        default:
            System.out.println("Menu Tidak Valid!");
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarRoti.size(); i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Nama Roti : ")
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, Menggunakan ArrayList untuk menyimpan daftar roti: .

```bash
private ArrayList<Roti> daftarRoti = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
pilihan = input.nextInt();
input.nextLine();
} catch (InputMismatchException e) {
System.out.println("Input harus berupa angka!");
input.nextLine();
}```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Hasnia
NPM: 2310010255
