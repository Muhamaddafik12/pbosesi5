
public class BujurSangkar extends BangunDatar{

    public BujurSangkar(int s) {
        super(s);
    }
    
    int hitungLuas(){
        int s = super.getSisi();
        return s * s;
    }
    
    int hitungKeliling(){
        int s = super.getSisi();
        return 4 * s;
    }
    
    public String toString(){
        String hasil = "Luas Bujur Sangkar: " + hitungLuas() + "\n" + "keliling Bujursangkar: " + hitungKeliling();
        return hasil;
    }


}