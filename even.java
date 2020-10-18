import java.util.Scanner;

public class even {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入起始值:");
        int num1 = scanner.nextInt();
        System.out.println("请输入结束值:");
        int num2 = scanner.nextInt();



        int result = even_num(num1,num2);
        System.out.println(num1 + "到" + num2 + "之间的偶数和为:" + result);
    }

    public static int even_num(int num1,int num2){
        int num = 0;
        for(int i = num1;i <= num2;i++){
            if(i % 2 == 0){
                num += i;
            }
        }
        return num;
    }


}

