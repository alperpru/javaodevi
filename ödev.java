import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Yukarıdaki kod blokları "arrayList" ,"List" ve "scanner" gibi Java sınıflarını kullanmamıza olanak sağlayan import ifadeleridir.

//Film işlemlerin yapıldığı kod blokları aşağıda yer almaktadır.
class Film {
    private String ad;
    private List<String> seansSaatleri;

    public Film(String ad) {
        this.ad = ad;
        this.seansSaatleri = new ArrayList<>();
    }

    public String getAd() {
        return ad;
    }

    public List<String> getSeansSaatleri() {
        return seansSaatleri;
    }

    public void addSeansSaatleri(String saat) {
        seansSaatleri.add(saat);
    }
}
//Salon işlemlerin yapıldığı kod blokları aşağıda yer almaktadır.
class Salon {
    private String ad;
    private int koltukKapasitesi;

    public Salon(String ad, int koltukKapasitesi) {
        this.ad = ad;
        this.koltukKapasitesi = koltukKapasitesi;
    }

    public String getAd() {
        return ad;
    }

    public int getKoltukKapasitesi() {
        return koltukKapasitesi;
    }
}
//Seans işlemlerin yapıldığı kod blokları aşağıda yer almaktadır.
class Seans {
    private Film film;
    private Salon salon;
    private String tarih;
    private String saat;

    public Seans(Film film, Salon salon, String tarih, String saat) {
        this.film = film;
        this.salon = salon;
        this.tarih = tarih;
        this.saat = saat;
    }

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
class Rezervasyon {
    private Seans seans;
    private String musteriAdSoyad;
    private int biletAdedi;
    private int koltukNo;

    public Rezervasyon(Seans seans, String musteriAdSoyad, int biletAdedi, int koltukNo) {
        this.seans = seans;
        this.musteriAdSoyad = musteriAdSoyad;
        this.biletAdedi = biletAdedi;
        this.koltukNo = koltukNo;
    }

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
        // Örnek verileri oluşturuyoruz
        Film film1 = new Film("Avatar");
        film1.addSeansSaatleri("10:00");
        film1.addSeansSaatleri("14:00");

        Film film2 = new Film("Hizli Ve Öfkeli");
        film2.addSeansSaatleri("12:00");
        film2.addSeansSaatleri("16:00");

        Salon salon1 = new Salon("Salon 1", 50);
        Salon salon2 = new Salon("Salon 2", 60);

        Seans seans1 = new Seans(film1, salon1, "2023-06-04", "10:00");
        Seans seans2 = new Seans(film1, salon1, "2023-06-04", "14:00");
        Seans seans3 = new Seans(film2, salon2, "2023-06-04", "12:00");
        Seans seans4 = new Seans(film2, salon2, "2023-06-04", "16:00");

        // Aşağıdaki kısımda ise konsol uygulamasının kodları yer alıyor.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Film Seçiniz:");
        System.out.println("1. " + film1.getAd());
        System.out.println("2. " + film2.getAd());

        int filmSecim = scanner.nextInt();

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

        System.out.println("Müşteri Adı Soyadı:");
        scanner.nextLine(); // Boş satır okuması
        String musteriAdSoyad = scanner.nextLine();

        System.out.println("Bilet Adedi:");
        int biletAdedi = scanner.nextInt();

        System.out.println("Koltuk No:");
        int koltukNo = scanner.nextInt();

        Seans secilenSeans = null;
        for (Seans seans : List.of(seans1, seans2, seans3, seans4)) {
            if (seans.getFilm() == secilenFilm && seans.getSaat().equals(secilenSeansSaat)) {
                secilenSeans = seans;
                break;
            }
        }

        if (secilenSeans == null) {
            System.out.println("Geçersiz seans seçimi!");
            return;
        }

        Rezervasyon rezervasyon = new Rezervasyon(secilenSeans, musteriAdSoyad, biletAdedi, koltukNo);

        // Rezarvasyon bilgilerini kullanarak gerekli işlemleri yapabiliriz. 
        // Örneğin, rezervasyonu bir listeye ekleyebilir veya başka bir işlem yapabiliriz.

        System.out.println("Rezervasyon başarıyla tamamlandı !");
    }
}
