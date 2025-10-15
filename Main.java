import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================================");
        System.out.println("                SISTEM MANAJEMEN PROYEK             ");
        System.out.println("======================================================");

        System.out.print("Masukkan nama proyek: ");
        String namaProyek = sc.nextLine();
        Proyek proyek = new Proyek(namaProyek);

        System.out.print("Masukkan jumlah developer: ");
        int jumlahDev = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < jumlahDev; i++) {
            System.out.print("\nNama developer ke-" + (i + 1) + ": ");
            String namaDev = sc.nextLine();
            Developer dev = new Developer(namaDev);

            System.out.print("Jumlah tugas untuk " + namaDev + ": ");
            int jumlahTugas = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < jumlahTugas; j++) {
                System.out.println("Tugas ke-" + (j + 1) + " untuk " + namaDev);
                System.out.print("Judul tugas: ");
                String judul = sc.nextLine();
                System.out.print("Estimasi jam: ");
                int jam = sc.nextInt();
                sc.nextLine();

                Tugas t = new Tugas(judul, jam);

                System.out.print("Apakah tugas ini telah selesai? (ya atau belum): ");
                String selesai = sc.nextLine();
                if (selesai.equalsIgnoreCase("ya")) {
                    t.selesaikanTugas();
                }

                dev.tambahTugas(t);
            }

            proyek.tambahDeveloper(dev);
        }

        proyek.tampilkanStatusProyek();

        // Cari developer paling produktif
        Developer palingProduktif = null;
        double progressTertinggi = 0;

        for (Developer d : proyek.tim) {
            if (d.Progres() > progressTertinggi) {
                progressTertinggi = d.Progres();
                palingProduktif = d;
            }
        }
        System.out.println("\n======================================================");
        System.out.println("             DEVELOPER PALING PRODUKTIF             ");
        System.out.println("======================================================");
        if (palingProduktif != null) {
            System.out.printf("Developer paling produktif: %s (%.2f%% selesai)\n",
                    palingProduktif.nama, palingProduktif.Progres());
        } else {
            System.out.println("Belum ada developer produktif (belum ada tugas).");
        }
  
        sc.close();
    }
}
