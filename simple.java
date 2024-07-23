import java.util.Scanner;


public class simple {
    public static void main(String[] args) {
       // System.out.println("ENTER YOUR  NAME");
       /*  Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
       // System.out.println("ENTER YOUR AGE");
        int age=sc.nextInt();
        System.out.println("youe name:"+name+ "YOUR AGE"+age);
        String ouput=(age>=18) ? "you are eligiable" : "you are not eligiable";
        System.out.println(ouput);*/
        // print N natural number
        int n=10;
        for(int i=0; i<=n; i++){
            System.out.println(i);
    
        }
        
        while(n>=1){
            System.out.println(n);
            n--;
        }
        int i=1,sum=0;
    
        do{
            sum=sum+i;
            i++;
        }
        while(n>=10);
        System.out.println(sum);

        
        

        

    }
    
}
