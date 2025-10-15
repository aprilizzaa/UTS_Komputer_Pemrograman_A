import java.util.*;
public class Proyek {
    String namaProyek;
    List<Developer> tim = new ArrayList<>();
    public Proyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }
    public void tambahDeveloper(Developer d) {
        tim.add(d); 
    }
        public void tampilkanStatusProyek() {
        System.out.println("\n======================================================");
        System.out.println("        LAPORAN STATUS PROYEK: " + namaProyek);
        System.out.println("======================================================");
        System.out.printf("%-15s | %-8s | %-10s | %-13s\n", 
                          "Nama Developer", "Progres", "Total Jam", "Jumlah Tugas");
        System.out.println("------------------------------------------------------");
            for (Developer d : tim) {
            System.out.printf("%-15s | %6.2f %% | %-10d | %-13d\n",
                              d.nama, d.Progres(), d.hitungTotalJam(), d.daftarTugas.size());
        }
         System.out.println("------------------------------------------------------");
    }
}