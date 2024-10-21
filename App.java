import java.util.Scanner;
public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Cashier cashier = new Cashier();
        //variable "cashier" --> instance of class Cashier 
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Program Sistem Kasir: ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Tampilkan Total");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    String addKode = scanner.next();
                    System.out.print("Masukkan nama barang: ");
                    String addNama = scanner.next();
                    System.out.print("Masukkan harga barang: ");
                    double addHarga = scanner.nextDouble();
                    cashier.addItem(addHarga, addKode, addNama);
                    break;
                case 2:
                    System.out.print("Masukkan kode barang yang akan dihapus: ");
                    String removeKode = scanner.next();
                    cashier.removeItem(removeKode);
                    break;
                case 3:
                    cashier.displayTotal();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem kasir kami!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        
    }
}
