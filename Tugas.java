public class Tugas {
    String judul;
    int estimasijam;
    boolean status;
    public Tugas (String judul, int estimasijam) {
        this.judul = judul;
        this.estimasijam = estimasijam;
        this.status = false;
    }
        public void selesaikanTugas() {
        this.status = true;
    }
        public String getJudul() {
        return this.judul;
    }
        public int getEstimasiJam() {
        return this.estimasijam;
    }
        public boolean isSelesai() {
        return this.status;
    }
}
