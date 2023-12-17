import java.util.Scanner;

public class BPQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double age;
        System.out.println("Enter the age : ");
        age = sc.nextDouble();
        System.out.println("Enter the bp value : ");
        int bp = sc.nextInt();

        String result = "";

        if (age > 1 && age <= 5)
            result = (bp < 80 ? "Min" : (bp >= 110 ? "Max" : "normal"));
        else if (age > 6 && age <= 13)
            result = (bp < 90 ? "Min" : (bp >= 115 ? "Max" : "normal"));
        else if (age > 14 && age <= 19)
            result = (bp < 105 ? "Min" : (bp >= 120 ? "Max" : "normal"));
        else if (age > 20 && age <= 24)
            result = (bp < 108 ? "Min" : (bp >= 132 ? "Max" : "normal"));
        else if (age > 25 && age <= 29)
            result = (bp < 109 ? "Min" : (bp >= 133 ? "Max" : "normal"));
        else if (age > 30 && age <= 34)
            result = (bp < 110 ? "Min" : (bp >= 134 ? "Max" : "normal"));
        else if (age > 35 && age <= 39)
            result = (bp < 111 ? "Min" : (bp >= 135 ? "Max" : "normal"));
        else if (age > 40 && age <= 44)
            result = (bp < 112 ? "Min" : (bp >= 137 ? "Max" : "normal"));
        else if (age > 45 && age <= 49)
            result = (bp < 115 ? "Min" : (bp >= 139 ? "Max" : "normal"));
        else if (age > 50 && age <= 54)
            result = (bp < 116 ? "Min" : (bp >= 142 ? "Max" : "normal"));
        else if (age > 55 && age <= 59)
            result = (bp < 118 ? "Min" : (bp >= 144 ? "Max" : "normal"));
        else if (age > 60)
            result = (bp < 121 ? "Min" : (bp >= 147 ? "Max" : "normal"));
        else
            result = "Invalid age range";

        System.out.println("Your BP is : " + result);
    }
}
