package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) throws Exception {

       int n ,i;
    double med=0;
    Scanner dados=new Scanner(System.in);
    System.out.print("Quantos elementos tem a média?");
    n=dados.nextInt();
    double []A=new double[n];
    for(i=0; i<=n-1;i++)
    {System.out.println("Qual é o Elemento "+ (i+1));
        A[i]=dados.nextDouble();}
        for(i=0;i<=n-1;i++)
            med+=A[i];
            med=med/n;
    System.out.print(String.format("A Média é %5.2f",med));
}
}
