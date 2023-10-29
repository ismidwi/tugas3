public class Main {
   private double operand1;
   private double operand2;
    public Main(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double add() {
        return operand1 + operand2;
    }

    public double subtract() {
        return operand1 - operand2;
    }

    public double multiply() {
        return operand1 * operand2;
    }

    public double divide() {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Mengembalikan NaN (Not-a-Number) untuk kasus pembagian oleh nol
        }
    }

    public static void main(String[] args) {
        Main calculator = new Main(10.5, 5.2);

        // Melakukan beberapa operasi perhitungan
        double resultAdd = calculator.add(); // Menambahkan
        double resultSubtract = calculator.subtract(); // Mengurangkan
        double resultMultiply = calculator.multiply(); // Mengalikan
        double resultDivide = calculator.divide(); // Membagi

        // Menampilkan hasil perhitungan
        System.out.println("Hasil penambahan: " + resultAdd);
        System.out.println("Hasil pengurangan: " + resultSubtract);
        System.out.println("Hasil perkalian: " + resultMultiply);
        System.out.println("Hasil pembagian: " + resultDivide);
    }
}
