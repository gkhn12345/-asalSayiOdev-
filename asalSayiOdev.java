import java.util.Scanner;

public class asalSayiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1'den 100'e kadar olan Asal Sayılar:");

        for (int i=1;i<=100;i++){
            int time= 0;
            for (int n=1;n<=i;n++){
                if (i%n ==0){
                    time++;
                }
            }
            if (time==2){
                System.out.print(i+"--");
            }
        }

    }
}
