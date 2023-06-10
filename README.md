#Projenin Kısa Tanımı : Proje Java Dili İle Kodlanmış Basit Bir Sinema Rezarvasyon Programıdır. Terminal Ekranında Soru-Cevap Şeklinde Çalışır.

#PROJENİN DETAYLI AÇIKLAMASI ve KODLARIN TANIMLARI 
#1. Öncelikle projede "java.util" kullanarak "ArrayList","List" ve "Scanner" gibi sınıfları projeye import ettim.

#2. Daha sonra "Film" adında bir sınıf tanımladım. Bu sınıfı bir filmi , filmin adını ve mevcut seans saatlerini tutmak için kullandım. Bu sınıf içersinde kullandığım "getAd()" metodu film adını döndürürken, "getSeansSaatleri()" metodu film için mevcut seans saatlerini içeren "seansSaatleri" listesini döndürüyor.

#3. Daha sonrasında ise "Salon" adında bir sınıf tanımladım ve bu sınıfı bir sinema salonunu temsil etmek için kullandım. Bu sınıf içersinde salon adını "ad" ve koltuk kapasitesini "koltukKapasitesi" tutuyor. Bu özel veri üyesi yani "ad" ve "koltukKapasitesi" üyeleri "Salon" sınıfının özel veri üyeleridir. "ad" özelliği string türündedir. "koltukKapasitesi" ise int türündedir.

#4. Daha sonra "Seans" adında bir sınıf tanımladım. Bu sınıfı bir filmin seansını temsil etmek için kullandım ve seansa ait "film","salon","tarih"ve "saat" gibi bilgileri bu kısımda tuttum. Bu dört veri üyesi(film, salon, tarih ve saat), Seans sınıfının özel veri üyeleridir. film özelliği bir Film tipinde bir nesneyi temsil ediyor , salon özelliği bir Salon tipinde bir nesneyi temsil ediyor, tarih özelliği  String türünde tarih bilgisini ve saat özelliği de String türünde saat bilgisini tutar.

#5. Daha sonra "Rezarvasyon" adında bir sınıf oluşturdum ve bu sınıfı bir film seansı için yapılan rezarvasyonu temsil etmek için kullandım.Rezervasyona ait seans (seans), müşteri adı soyadı (musteriAdSoyad), bilet adedi (biletAdedi) ve koltuk numarası (koltukNo) bilgilerini tutuyor.

#6. En son ise "biletRezarvasyon" adında bir class tanımladım. Bu class ise sinema rezarvasyon konsol uygulamasını temsil ediyor. İlk olarak örnek olarak yazdığım veriler oluşturulur. Film ve seans bilgileri oluşturulurken , her bir film için seans saatleri eklenir ve her bir salona ait salon nesnesi oluşturulur. Daha sonra ise rezarvasyon yapma işlemi gerçekleştirilir. Rezarvasyon işlemi eğer sorunsuz bir şekilde başarıyla tamamlanır ise kullanıcıya "Rezarvasyon başarıyla tamamlandı" mesajı gösterilir. Eğer herhangi bir alanda istenen bilgi verilmediyse , örneğin geçerli bir seans seçilmediyse , program kullanıcıya hata mesajı gönderir ve program sonlandırılır. 

#7. PROGRAMIN ANA HATLARINI VE ÇALIŞMA MANTIĞINI BU KISIMDA BELİRTTİM. KODLARIN İÇİNE YORUM SATIRI OLARAK DAHA FAZLA DETAY EKLEDİM.




