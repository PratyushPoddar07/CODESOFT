import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The total number of subject: ");
        int totalSub = sc.nextInt();
        int sum =0;
        int totalmark =0;

        for(int i=1;i<=totalSub;i++){
            System.out.println("Enter the value of subject no: "+i);
            int mark=sc.nextInt();
            sum += mark;
        }
        totalmark += sum;
        double avgPercent =(double) totalmark/totalSub;

        // for grade
        String Grade;
       String message;
        if(avgPercent > 95){
            message="Outstanding";
            Grade ="O";
        }
        else if(avgPercent >= 90){
            message="Excellent";
            Grade ="A";
        }else if (avgPercent >= 80){
            message="Very Good";
            Grade ="B";
        } else if (avgPercent >= 70) {
            message="Average";
            Grade ="C";
        } else if (avgPercent >= 60) {
            message="Pass";
            Grade ="D";
        }else{
            message="Fail";
            Grade ="F";
        }


        // RESULT Time
        System.out.println("Total Marks: "+totalmark);
        System.out.println("Average Percentage: "+avgPercent);
        System.out.println("Secured Grade: "+Grade+" as "+message+" result");
    }
}
