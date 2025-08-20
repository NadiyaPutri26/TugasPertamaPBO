# TugasPertamaPBO
# Deskripsi Tugas
Pada tugas Pemrograman Berorientasi Objek (PBO) pertemuan 1 ini yakni mengimplementasikan konsep _inheritance_ dengan "extends", enkapsulasi, dan _setter_ serta _getter_. Pada praktikum ini saya mengimplementasikannya dalam tiga package, dimana setiap package nya mewakili satu kasus yang berbeda.
# Inheritance (Pewarisan)
Sebuah konsep dalam OOP atau PBO yang memungkinkan sebuah _class_ (_subclass_) mewarisi atribut atau method dari _class_ lain (_superclass_). Sehingga akan terbentuk sebuah hierarki _class_ yang kompleks dan dapat menghindari pengulangan _code_.
Adapun istilah di dalam _inheritance_ ini, terdiri dari:
1. _Superclass_: _class_ yang diwarisi
2. _subclass_: _class_ yang menerima warisan dari _superclass_
# Extends
Digunakan dalam menyatakan bahwa sebuah _class_ adalah _subclass_ dari _class_ lain. Dengan "extends", _subclass_ dapat mewarisi semua atribut dan method dari _superclass_.
Code:
public class (subclass) extends (superclass) {...}
Salah satu contoh penerapan _inheritance_ dan "extends"
code:
public class MakhlukHidup{
private String caraBernafas;
...}

public class Hewan extends MakhlukHidup{
private int jumlahMata;
...}

public class Singa extends Hewan{
private String Famili;
...}

Dalam contoh code tersebut, _Inheritance_ dan "extends" digunakan untuk membangun hierarki _class_ dengan MakhlukHidup sebagai (_superclass_), Hewan, dan Singa sebagai (_subclass_). Class MakhlukHidup memiliki atribut private nama, yang diwarisi oleh kedua _subclass_. _Class_ Hewan mewarisi caraBernafas dari MakhlukHidup dan menambahkan jumlahMata, kemudian _class_ Singa mewarisi caraBernafas dari MakhlukHidup, jumlahMata dari Hewan, dan menambahkan Famili. 
Penggunaan "extends" ini memungkinkan _subclass_ Hewan dan Singa menggunakan atribut dan method dari _superclass_ (MakhlukHidup).
# Setter dan Getter
Sebuah metode yang digunakan untuk mengakses atau mengubah nilai atribut private dari sebuah _class_. Singkatnya adalah sebuah cara untuk memberikan akses dan validasi data. Berikut penjelasaanya:
1. Setter: metode yang digunakan untuk menetapkan nilai pada atribut private
2. Getter: metode yang digunakan untuk mendapatkan nilai dari atribut private
Contohnya,
code:
public class Singa extends Hewan {

    protected String getFamili() {
        return famili;
    }

    protected void setFamili(String famili) {
        this.famili = famili;
    }

Dalam contoh code tersebut, _class_ Singa memiliki 1 atribut private, yaitu Famili yang diakses dan dimodifikasi melalui _setter_ dan _getter_. Metode getFamili() adalah _getter_ yang digunakan dalam mengambil nilai dari atribut Famili, sedangkan metode setFamili(String famili) adalah _setter_ yang diguanakan dalam menetapkan nilai untuk atribut tersebut. Penggunaan _setter_ dan _getter_ ini memungkinkan enkapsulasi, yaitu dapat mengkontrol akses terhadapa atribut private dari luar _class_.

Semoga penjelasan diatas dapat memebantu dalam memahami materi dalam pertemuan 1 mata kuliah Pemrograman Berorientasi Objek ini
