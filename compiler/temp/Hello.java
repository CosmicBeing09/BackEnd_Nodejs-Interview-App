import java.util.Scanner; 
class Hello {
    public static void main(String[] args) {
    System.out.println("Started"); 
    
    Scanner scan = new Scanner(System.in);  
    
    int n = scan.nextInt();
    int[] a = new int[n]; 
    
    for(int i=0;i<n;i++){    
       a[i] = scan.nextInt();    
    }
    
    for(int i=0;i<n-1;i++){
     for(int j=i+1;j<n;j++){
         if(a[j]>a[i]){
             int temp = a[i];
             a[i] = a[j];
             a[j] = temp;             
         }
     }   
    }
    
    for(int i=0;i<n;i++){
        System.out.println(a[i]);
    }  
      System.out.println("Finished");     
    
         }         
    }