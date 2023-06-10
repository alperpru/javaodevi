import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Yukarıdaki kod blokları "arrayList" ,"List" ve "scanner" gibi Java sınıflarını kullanmamıza olanak sağlayan import ifadeleridir.

//Film işlemlerin yapıldığı kod blokları aşağıda yer almaktadır.
class Film {
    private String ad; //ad özelliği string veri türündedir ve film adını temsil ediyor.
    private List<String> seansSaatleri; //seansSaatleri List<String> veri türünde bir liste nesnesidir. Film için mevcut seans saatlerini saklar.

    public Film(String ad) { //Bu kod bloğu bir yapıcı metoddur. "Film" sınıfından bir nesne oluşturulduğunda çağrılır. 
        this.ad = ad;
        this.seansSaatleri = new ArrayList<>(); //Bu kısımda "seansSaatleri" için başlangıçta boş bir "ArrayList" oluşturulur.
    }

    public String getAd() { //Bu metodu "ad" veri üyesinin içersindeki değeri dışarıya aktarmak için kullandım.
        return ad;
    }

    public List<String> getSeansSaatleri() { 
        return seansSaatleri; 
    }

    public void addSeansSaatleri(String saat) { //Bu metodu yeni bir seans saati eklemek için kullandım.
        seansSaatleri.add(saat);
    }
}
//Salon işlemlerin yapıldığı kod blokları aşağıda yer almaktadır.
class Salon {
    private String ad; //"ad" özelliği bir String türünde ve salonun adını temsil ediyor. 
    private int koltukKapasitesi; // buu kısım ise salonun koltuk kapasitesini temsil ediyor ve integer veri türünde.

    public Salon(String ad, int koltukKapasitesi) { // Bu kısım Salon sınıfından bir nesne oluşturulduğunda çağrılır.Bu metodun parametreleri, oluşturulan salon nesnesinin adını ve koltuk kapasitesini belirtir.
        this.ad = ad;
        this.koltukKapasitesi = koltukKapasitesi;
    }

    public String getAd() { //ad veri üyesinin içindeki değeri dışarı aktarmak için kullandım.
        return ad;
    }

    public int getKoltukKapasitesi() { //koltukKapasitesi veri üyesinin içersindeki değeri dışarı aktarmak için kullandım.
        return koltukKapasitesi;
    }
}
//Seans işlemlerin yapıldığı kod blokları aşağıda yer almaktadır.
class Seans { //Bu kısımdaki Seans sınıfı , "film" ,"salon","tarih","saat" bilgilerini tutuyor.
    private Film film;
    private Salon salon;
    private String tarih;
    private String saat;

    public Seans(Film film, Salon salon, String tarih, String saat) { //Burası ise "Seans" sınıfından bir nesne oluşturulduğunda çağrılır. 
        this.film = film;
        this.salon = salon;
        this.tarih = tarih;
        this.saat = saat;
    }
     //Alt kısımdaki 4 adet metodda ise film salon tarih ve saat veri üyelerinin değerlerini dışarıya aktarır. Yani kısaca alt tarafataki kod blokları "Seans" sınıfını tanımlayarak bir film seansını temsil etmek için gerekli veri yapısını ve metotları sağlar.
    public Film getFilm() {
        return film;
    }

    public Salon getSalon() {
        return salon;
    }

    public String getTarih() {
        return tarih;
    }

    public String getSaat() {
        return saat;
    }
}
//Rezarvasyon işlemlerin yapıldığı kod blokları aşağıda yer almaktadır.
class Rezervasyon { //Bu 4 özel veri üyesi "Rezarvasyon" sınıfının özel veri üyeleridir.
    private Seans seans;
    private String musteriAdSoyad;
    private int biletAdedi;
    private int koltukNo;

    public Rezervasyon(Seans seans, String musteriAdSoyad, int biletAdedi, int koltukNo) { //Bu kısım ise yapıcı bir metod. "Rezarvasyon" sınıfından bir oluşturulduğunda çağrılır.
        this.seans = seans;
        this.musteriAdSoyad = musteriAdSoyad;
        this.biletAdedi = biletAdedi;
        this.koltukNo = koltukNo;
    }
    // Alt kısımdaki 4 metod seans , musteriAdSoyad ,  biletAdedi ve koltukNo veri üyelerinin içersindeki değerleri dışarıya aktarmak için kullanılır.
    public Seans getSeans() {
        return seans;
    }

    public String getMusteriAdSoyad() {
        return musteriAdSoyad;
    }

    public int getBiletAdedi() {
        return biletAdedi;
    }

    public int getKoltukNo() {
        return koltukNo;
    }
}

public class BiletRezervasyon {
    public static void main(String[] args) {
        // Örnek veriler.
        Film film1 = new Film("Avatar");
        film1.addSeansSaatleri("10:00");
        film1.addSeansSaatleri("14:00");
        // Örnek veriler.
        Film film2 = new Film("Hizli Ve Öfkeli");
        film2.addSeansSaatleri("12:00");
        film2.addSeansSaatleri("16:00");
        // Örnek veriler.
        Salon salon1 = new Salon("Salon 1", 50);
        Salon salon2 = new Salon("Salon 2", 60);
         // Örnek veriler.
        Seans seans1 = new Seans(film1, salon1, "2023-06-04", "10:00");
        Seans seans2 = new Seans(film1, salon1, "2023-06-04", "14:00");
        Seans seans3 = new Seans(film2, salon2, "2023-06-04", "12:00");
        Seans seans4 = new Seans(film2, salon2, "2023-06-04", "16:00");

        // Aşağıdaki kısımda ise konsol uygulamasının kodları yer alıyor.
        Scanner scanner = new Scanner(System.in);
        //Aşağıdaki kod bloğunda kullanıcıya hangi filmi seçeceği soruluyor ve kullanıcının girişi "filmSecim" değişkenine atanıyor.
        System.out.println("Film Seçiniz:");
        System.out.println("1. " + film1.getAd());
        System.out.println("2. " + film2.getAd());

        int filmSecim = scanner.nextInt();
        //Film nesnesi bu kısımdaki secilenFilm değişkenine atanır.
        Film secilenFilm;
        if (filmSecim == 1) {
            secilenFilm = film1;
        } else if (filmSecim == 2) {
            secilenFilm = film2;
        } else {
            System.out.println("Geçersiz film seçimi!");
            return;
        }

        System.out.println("Seans Saati Seçiniz:");
        List<String> seansSaatleri = secilenFilm.getSeansSaatleri();
        for (int i = 0; i < seansSaatleri.size(); i++) {
            System.out.println((i + 1) + ". " + seansSaatleri.get(i));
        }

        int seansSecim = scanner.nextInt();
        if (seansSecim < 1 || seansSecim > seansSaatleri.size()) {
            System.out.println("Geçersiz seans seçimi!");
            return;
        }

        String secilenSeansSaat = seansSaatleri.get(seansSecim - 1);
        // Kullanıcıdan müşteri adı soyadı, bilet adedi ve koltuk numarası gibi bilgiler bu kısımda alınır.
        System.out.println("Müşteri Adı Soyadı:");
        scanner.nextLine(); // Boş satır okuması
        String musteriAdSoyad = scanner.nextLine();

        System.out.println("Bilet Adedi:");
        int biletAdedi = scanner.nextInt();

        System.out.println("Koltuk No:");
        int koltukNo = scanner.nextInt();
         // Bu kısımda kullanıcının seçtiği film ve seans saatine uygun bir Seans nesnesi bulunur ve secilenSeans değişkenine atanır.
        Seans secilenSeans = null;
        for (Seans seans : List.of(seans1, seans2, seans3, seans4)) {
            if (seans.getFilm() == secilenFilm && seans.getSaat().equals(secilenSeansSaat)) {
                secilenSeans = seans;
                break;
            }
        }

        if (secilenSeans == null) {
            System.out.println("Geçersiz seans seçimi!"); // Eğer geçerli bir seans seçilmedi ise kullanıcıya yan taraftaki hata mesajı gösterilir ve program sonlandırılır.
            return;
        }
         //Geçerli bir seans seçildi ise "Rezarvasyon" sınıfından bir nesne oluşturulur ve gerekli bilgilerle donatılır.
        Rezervasyon rezervasyon = new Rezervasyon(secilenSeans, musteriAdSoyad, biletAdedi, koltukNo);

      

        System.out.println("Rezervasyon başarıyla tamamlandı !"); //Rezervasyon işlemi başarıyla tamamlandığında, kullanıcıya yan taraftaki mesaj gönderilir.


    }
}
