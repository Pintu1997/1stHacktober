import java.util.*;

public class Sum_of_array{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int sum=0;
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=scan.nextInt();
      sum+=a[i];
    }
    System.out.println(sum);
  }
}
