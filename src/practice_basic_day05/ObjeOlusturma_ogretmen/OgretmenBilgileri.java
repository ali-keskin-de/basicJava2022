package practice_basic_day05.ObjeOlusturma_ogretmen;

public class OgretmenBilgileri {
    String isim;
    String soyisim;
    int yas;
    String brans;
    String tel;
    /* OgretmenBilgileri  Class’i olusturun bu Class’da bir Ogretmen icin gerekli
     * bilgileri girebilecegim Instance Variable’lar olusturun
     * ve main method icinde bu variable’lara deger atayin (variable lar buasamada static olmali..)
     * ve yazdirin
     *Not:Ornegin; 1 class, class icinde 1 tane static ve 1 tane de instance variable var.
	 Bu class'dan 10 object olusturulursa 1 tane static variable ve 10 tane
	 instance variable uretilmis demektir.
     */
    public static void main(String[] args) {

        OgretmenBilgileri obj1=new OgretmenBilgileri();
        obj1.isim="Ahmet";
        obj1.soyisim="kaya";
        obj1.yas=32;
        obj1.brans="Fizik";
        obj1.tel="123456789";

        OgretmenBilgileri obj2= new OgretmenBilgileri();


    }

}
