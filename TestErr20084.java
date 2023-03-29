/*NAMA                      : Andi Ainun Fatimah Jamal
  NIM                       : 13020210084 */


public class TestErr0084 {
    public static void main(String[] args) { 
        int toti = 0; // tambahkan inisialisasi variabel toti
        int i, j;
        for (i = 0; i < 10; i++) {
            System.out.print(i + " "); // tambahkan output angka i
        }
        System.out.println();
        i = 5;
        j = 7;
        if (i < j) { // tambahkan tanda kurung kurawal untuk blok kode if
            System.out.println("i kurang dari j");
        } else {
            do {
                j++;
            } while (j < 10);
        }
    }
}