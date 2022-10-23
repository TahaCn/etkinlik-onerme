import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;
        System.out.print("Sıcaklığı giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz. ");
        } else if (heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz. ");
        } else if (heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz. ");
        } else if(heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz. ");
        }

        }

    }
