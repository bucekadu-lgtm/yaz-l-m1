public class Main {
    public static void main(String[] args) {

        double vize = 60.0;
        double finalNotu = 70.0;
        double performans = 85.0;

        double ort = (vize * 4 + finalNotu * 4 + performans * 2) / 10;
        String durum;
        if (ort < 50) {
            durum = "Kaldınız";
        }
        else if (ort < 75) {
            durum = "Geçtiniz";
        }
        else if (ort < 85) {
            durum = "Teşekkür belgesi aldınız";
        }
        else {
            durum = "Takdir belgesi aldınız";
        }

        System.out.println("Ortalamanız: " + ort);
        System.out.println("Başarı durumunuz: " + durum);
    }
}