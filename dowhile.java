public class dowhile {
    public static void main(String[] args) {
        int sum = 0; 
        int i = 0;      // i is 0 Here
        
            do{ 
        
              sum += i; 
               i++;
            }while(i < 100);
        
             System.out.println("The sum is " + sum);
       
    }
    
}
