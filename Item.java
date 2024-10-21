public class Item {
    //atribut milik dari object Item.
    private double harga;
    private String nama;
    private string kode;
    private int stok;
    //Default constructor 
    public Item(){}
    public Item(String nama, String kode{
        this.nama = nama;
        this.kode = kode;
    }
    public Item(double harga, String kode, String nama){
    }
    public Item(String nama, double harga, String kode){
    }
    //Konstruktor: dijalankan saat proses instansiasi. 
    public Item(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }
    public int updateStok(int stokUpdate){
        this.stok += stokUpdate;
        return Stok;
    }
    public double getHarga() {
        return harga;
    }
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
    public int getStok(){
        return Stok;
    }
    
}
