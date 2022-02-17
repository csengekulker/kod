import java.util.Scanner;

class Kod {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Balogh Csenge\nSzoft_I_N\n2022.02.17");

    int[] codes = {2248, 1834, 3823};

    System.out.print("Adja meg a kódot: ");
    int inputCode = sc.nextInt();

    int i = 1;
    while (i <= codes.length) {
      System.out.println(codes[i]);
      i++;
    }
  }
}
