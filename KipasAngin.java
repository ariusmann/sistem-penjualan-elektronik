
public class KipasAngin extends Admin {

    public float getHarga() {
        return Harga;
    }

    @Override
    public void setHarga(float Harga) {
        this.Harga = Harga;
    }

    @Override
    public int getTotal() {
        return Total;
    }

    @Override
    public void setTotal(int Total) {
        this.Total = Total;
    }

    public int getUkuran() {
        return Ukuran;
    }

    public void setUkuran(int Ukuran) {
        this.Ukuran = Ukuran;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    int Ukuran;


    public void Display(){
        System.out.println("----------------------------------------");
        System.out.println("Kipas Angin yang tersedia di entry : ");
        System.out.println("1.LG      5inc");
        System.out.println("2.Samsung 6inc");
        System.out.println("3.Maspion 7inc");
    }

}
