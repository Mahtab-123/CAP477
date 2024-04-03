import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
      List<Hall> l   = new ArrayList<Hall>();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of halls:");
      int  n = sc.nextInt();
      sc.nextLine();
    
    for(int i=0;i<n;i++){
        String[] s=sc.nextLine().split(",");
        l.add(new Hall(s[0],Double.parseDouble(s[1]),s[2]));
    }
    System.out.format("%-15s %-10s %s\n","Name","Cost","Owner");
    // l.stream().sorted((a,b)->a.getOwner().compareTo.(b.getOwner())).forEach(x-> System.out.format("%-15 %-10s %s\n",x.getName(),x.getCostPerDay,x.getOwner()));
     l.stream()
                .sorted((a, b) -> a.getOwner().compareTo(b.getOwner()))
                .forEach(x -> System.out.format("%-15s %-10s %s\n", x.getName(), x.getCostPerDay(), x.getOwner()));
    }    
}
