import java.util.*;
public class MamgoTree {
    public static void main(String args[])
    {
        int treeNumber, totalRows, totalColumns;
        Scanner get = new Scanner(System.in);
        totalRows = get.nextInt();
        totalColumns = get.nextInt();
        treeNumber = get.nextInt();
        if(treeNumber<=totalColumns || treeNumber%totalColumns==1 || treeNumber%totalColumns==0)
        {
            System.out.println("It is a mango tree");
        }
        else
            System.out.println("It is not a mango tree");
    }
}
