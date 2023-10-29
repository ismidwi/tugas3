
    /**
     * Kelas Persegi digunakan untuk menghitung luas dari sebuah persegi.
     */
    public class Persegi {
        private double sisi;
        /**
         * Konstruktor untuk kelas Persegi.
         *
         * @param sisi Panjang sisi dari persegi.
         */
        public Persegi(double sisi) {
            this.sisi = sisi;
        }

        /**
         * Metode untuk menghitung luas persegi.
         *
         * @return Luas dari persegi.
         */
        public double hitungLuas() {
            return sisi * sisi;
        }

        /**
         * Metode utama (main) untuk menguji kelas Persegi.
         *
         * @param args Argumen baris perintah.
         */
        public static void main(String[] args) {
            // Membuat objek Persegi dengan sisi 5.0
            Persegi persegi = new Persegi(5.0);

            // Menghitung luas dan mencetak hasilnya
            double luas = persegi.hitungLuas();
            System.out.println("Luas persegi dengan sisi 5.0 adalah: " + luas);

        }
    }

