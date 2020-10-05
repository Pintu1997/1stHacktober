import java.util.*;

public class Prime{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int i=0;
    for(i=2;i<=n/2;i++){
      if(n%i==0)
        break;  
    }
    if(i==(n/2)+1)
      System.out.println(n+" is a prime no.");
    else
      System.out.println("not a prime");
  }
}
