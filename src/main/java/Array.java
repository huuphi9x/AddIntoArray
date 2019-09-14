import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {10,4,6,7,8,0,0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        int numberX;
        int index;
            System.out.println("Enter a number: ");
            numberX = scanner.nextInt();
            System.out.println("Enter position: ");
            index = scanner.nextInt();
                if (index<0|| index>= numbers.length -1) {
                    System.out.println("không chèn được phần tử vào mảng.");
                } else {
                    for (int i = numbers.length -1;i>index;i--){
                        numbers[i]=numbers[i-1];
                }
                    numbers[index]=numberX;
            }
            for (int i=0;i<numbers.length;i++){
                System.out.print(numbers[i] + "\t");
            }
    }
}

