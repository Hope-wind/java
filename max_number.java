import java.util.Scanner;

public class max_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入第一个数字:");
            double num1 = scanner.nextInt();
            System.out.println("请输入第二个数字:");
            double num2 = scanner.nextInt();

            double result = max(num1, num2);
            System.out.println("最大的数字是" + result);

        }

    }

    //方法定义
    public static int max(int num1,int num2){
        int result = 0;

        if(num1 == num2){
            System.out.println("没有最大数");
            return 0;

        }else if(num1 > num2){
            result = num1;

        }else{
            result = num2;
        }

        return result;

    }


    public static double max(double num1,double num2){
        double result = 0;

        if(num1 == num2){
            System.out.println("没有最大数");
            return 0;
        }else if(num1>num2){
            result = num1;

        }else{
            result = num2;
        }

        return result;

    }

}
