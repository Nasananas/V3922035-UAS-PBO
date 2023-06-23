package uas.code;

public class Manusia { //kemudian kita buat class manusia yg nantinya memakan buah tersebut
    public void makanBuah(buah x) //ada method makanBuah dengan parameter buah x
    {
        //untuk mengecek tipe dari x tersebut adalah dengan menggunakan 'instanceof'
        if(x instanceof Apel) //jika x Apel...
        {
            System.out.println("Apel langsung dimakan"); //maka apel bisa langsung dimakan
            Apel ap = (Apel)x; //kita konferi agar saat di x. maka tampilkanBiji akan muncul dan tidak hanya buah
            ap.tampilkanBiji();
        }
        else if(x instanceof Pisang) //sama halnya dengan yang pisang
        {
            System.out.println("Pisang dikupas kulitnya terlebih dahulu");
            ((Pisang)x).tampilkanKulit();//atau bisa juga pakai cara yg lebih singkat seperti ini.
        }
        
        System.out.println("Rasanya : " + x.Rasa);//berikut untuk menampilkan rasa dari buah apel dan pisang.
    }
}

