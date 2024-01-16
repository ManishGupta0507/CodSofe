import java.util.*;

    public class NumberGame {
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            Random Comp=new Random();
            int attemp=0;
            Boolean GessedNumber=false; 
            System.out.println("Welcome to the number guess game");
            int SecretNumber= Comp.nextInt(100);
            while(!GessedNumber){
                System.out.println("Pick a number Between 1 to 100");
                int Try =sc.nextInt();
                
                attemp++;
                
                if(Try > SecretNumber){
                    System.out.println("Entered Number is greater then Sceret Number");
                }
                else if(Try < SecretNumber){
                    System.out.println("Entered Number is less then Sceret Number");
                }
                else {
                    GessedNumber=true;
                    System.out.println("Congratulation You have guessed the number "+SecretNumber+" Correctly");
                    System.out.println("you Took "+attemp+" Attemped to guess");
                }
            }
        
        sc.close();
    }
}
