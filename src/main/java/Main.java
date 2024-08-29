import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     // um programa que leia um valor inteiro n. este valor sera a quantidade de valores inteiros X que serão lido em seguida mostre quantos destes valores x estak dentro do intervalo [10.20] e quantos estao fora do intervalo, mostrando essas informações 

    int qnd = sc.nextInt();
    int vdi = sc.nextInt();
    int vfi = sc.nextInt();
    int nd;

    for(int i = 0; i < qnd; i++){
      System.out.println("digite o valor a ser comparado ");
      nd = sc.nextInt();
      if(nd >= 10 && nd <= 20){
        vdi++;
      }
      else{
        vfi++;
      }
    }
    System.ou.println("Dentro do intervalo temos: " + vdi);
    System.ou.println("");
    sc.close();
  }

  
}