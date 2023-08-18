import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your English marks:");
        int eng=sc.nextInt();

        System.out.println("Enter your Urdu marks:");
        int urdu=sc.nextInt();

        System.out.println("Enter your Math marks:");
        int math=sc.nextInt();

        System.out.println("Enter your Physics marks:");
        int phy=sc.nextInt();

        System.out.println("Enter your Computer marks:");
        int comp=sc.nextInt();

        System.out.println("Enter your Islamiat marks:");
        int isl=sc.nextInt();
        int total=eng+urdu+math+phy+comp+isl;
        System.out.println("Your obtained marks is: "+total+"/600");
        int avg=total/6;
        System.out.println("Your average percentage is "+avg +"%");
        if(avg>90){
            System.out.println("A Grade");
        }
        else if(avg>80 && avg <90){
            System.out.println("B Grade");
        }
        else if(avg>70 && avg <80){
            System.out.println("C Grade");
        }
        else if(avg>55 && avg <70){
            System.out.println("D Grade");
        }
        else if(avg<55){
            System.out.println("You are FAIL");
        }


    }
}
