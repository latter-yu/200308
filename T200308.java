import java.util.Scanner;
import java.io.IOException; // 需要导入 IOException 包
import java.util.Random;

public class T200308 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int oldYear = sc.nextInt();
		if(oldYear < 18) {
            System.out.println("少年");
		}else if(oldYear <= 28) {
            System.out.println("青年");
		}else if(oldYear <= 55 ){
            System.out.println("中年");
		}else {
            System.out.println("老年");
		}
	}

	public static void main3(String[] args) {
		Scanner sc = new Scanner(System.in); 
		//生成一个随机数
		Random random = new Random();//若（）内有指定整数，则每次随机数相同；若无，则每次不同
		int rand = random.nextInt(100);//[0——100)——>实际上[0——99]
		while(true) {
            System.out.println("请输入数字"); 
            int num = sc.nextInt();
            if(num > rand) {
                System.out.println("数字大了");
            }else if (num < rand){
                System.out.println("数字小了"); 
            }else {
                System.out.println("猜对了");
                break; 
            }
		}
		sc.close();
	}

	public static void main2(String[] args) {
		//报错： 错误: 未报告的异常错误IOException; 必须对其进行捕获或声明以便抛出
		//用try{}catch
		//但操作复杂，并不建议
        try { 
            System.out.print("Enter a Char:"); 
            char i = (char) System.in.read(); 
            System.out.println("your char is :"+i); 
        } catch (IOException e) {
                System.out.println("exception"); 
        }
	}

	public static void main1(String[] args) {
		//nextLine 不要和 nextInt 放在一起使用
		//原因：nextLine()会读取换行符
		Scanner sc = new Scanner(System.in); 
        System.out.println("请输入你的姓名："); 
        String name = sc.nextLine(); 
        System.out.println("请输入你的年龄："); 
        int age = sc.nextInt(); 
        System.out.println("请输入你的工资："); 
        float salary = sc.nextFloat(); 
        System.out.println("你的信息如下："); 
        System.out.println("姓名: "+name+"\n"+"年龄："+age+"\n"+"工资："+salary); 
        sc.close(); // 注意, 要记得调用关闭方法
	}
}