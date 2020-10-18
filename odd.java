import java.util.Scanner;

public class odd {
        public static int odd_num(int num1,int num2){
        int num = 0;

        for(int i = num1;i <= num2;i++){
            if(i % 2 != 0){
                num += i;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("请输入起始数:");
            int num1 = scanner.nextInt();
            System.out.println("请输入末尾数:");
            int num2 = scanner.nextInt();

            int result = odd_num(num1, num2);
            System.out.println(num1 + "到" + num2 + "之间的基数和为:" + result);
        }
    }


}
