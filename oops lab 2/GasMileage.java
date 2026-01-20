import java.util.Scanner;

public class GasMileage
{
    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
       int totalMiles=0;
       int totalGallon=0;

       while(true)
       {
        System.out.println("miles driven (enter -1 to stop the trips)");
        int mil=imp.nextInt();
        if(mil==-1)
           { break;}
        System.out.println("gallons used");
        int gall=imp.nextInt();
        double put= (double)mil/gall;
        System.out.println("miles per gallon= "+put);
        totalGallon +=gall;
        totalMiles +=mil;
       }
       if(totalGallon!=0)
        System.out.println("total put =" +(double)totalMiles/totalGallon);
    imp.close();
    }
    
}