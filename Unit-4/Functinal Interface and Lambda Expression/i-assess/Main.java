import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        List<ItemType> itype = new ArrayList<ItemType>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of item types:");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String S[]=sc.nextLine().split(",");
            itype.add(new ItemType(S[0],Double.parseDouble(S[1]),Double.parseDouble(S[2])));
        }
          System.out.format("%-10s %-10s %s\n", "Name", "Cost", "Deposit");
        itype.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).forEach(x -> System.out.format("%-10s %-10s %s\n", x.getName(), x.getCostPerDay(), x.getDeposit()));


    }    
}
