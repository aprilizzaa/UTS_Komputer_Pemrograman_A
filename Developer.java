import java.util.*;
    public class Developer {
        String nama;
        List<Tugas> daftarTugas = new ArrayList<>();
    public Developer(String nama) {
        this.nama = nama;
    }
    public void tambahTugas(Tugas t) {
        this.daftarTugas.add(t);
    }
    public int hitungTotalJam() {
        int total = 0;
        for (Tugas t : daftarTugas) {
        total += t.getEstimasiJam();
        }
        return total;
    }
    public double Progres() {
        int selesai = 0;
        for (Tugas t : daftarTugas) {
            if (t.isSelesai()) {
            selesai++;
            }
        }
        return (double) selesai / daftarTugas.size() * 100;
    }
}
