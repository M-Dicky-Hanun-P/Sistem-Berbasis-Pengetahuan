public class quizNomor7 {
    public static void main(String[] args) {
        boolean A = true; // Fakta awal A bernilai benar
        boolean E = true; // Fakta awal E bernilai benar

        boolean F = A && E; // Berdasarkan R3
        boolean G = A; // Berdasarkan R4

        if (F && G) {
            boolean D = true; // Berdasarkan R5
            boolean H = G && E; // Berdasarkan R6

            boolean J = H; // Berdasarkan R9
            boolean K = J; // Berdasarkan R10

            if (K) {
                System.out.println("=================================================");
                System.out.println("Jadi K bernilai: " + K + " atau yang sama dengan Benar");
                System.out.println("=================================================");
            } else {
                System.out.println("K bernilai salah");
                System.out.println("=================================================");
            }
        }
    }
}
