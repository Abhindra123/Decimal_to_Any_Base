import java.util.Scanner;

public class DecimalToBinary {

public static int decimalToBinary(int num,int base){
    String res="";
    while(num!=0){
        int quotient=num/base;
        int rem=num%base;
        res=String.valueOf(rem)+res;

        num=quotient;
    }
    int val=Integer.parseInt(res);
    return val;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println("Enter the Base");
        int base=sc.nextInt();
        int val=decimalToBinary(num,base);
        System.out.println(val);
    }
}