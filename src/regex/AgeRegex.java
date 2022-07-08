package regex;

import java.util.Scanner;

public class AgeRegex extends Exception{
    static Scanner scanner = new Scanner(System.in);
    public static int getAge() {
        while (true) {
            try {
                System.out.print("Nhập tuổi: ");
                int age = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Sai định dạng!!!");
            }
        }
    }
}
