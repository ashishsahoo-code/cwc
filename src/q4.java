import java.util.Scanner;
class q4
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    int n,sq,temp;
    int c=0;
    System.out.println("enter number");
    n= sc.nextInt();                     //number entereed
    sq=n*n;                             //square of the no
    System.out.println("square of the no\t"+sq);
    temp=n;                           //storing in temp var 
    while(temp>0)                      //checking if the no is greater than 0
    {
    c++;                             //counter
    temp=temp/10;                    //taking quotient of the number
    }
    int end = sq%(int) Math.pow(10,c);  // sq%io^c
    if (n==end) {                         //checking the number is automorphic or not
        System.out.println("it is automorphic");
    }
    else
    {
        System.out.println("it is not automorphic");
    }
    }
}