package cardtrickice1;

import java.util.Scanner;
/**
 * Harmanpreet Singh
 * Student ID no=991658764
 * 
 */


public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        String [] Suits ={"diamonds","clubs","spades","hearts"};
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue((int)(Math.random()*13)+1);//use a method to generate random *13
            c1.setSuits(Suits[(int)(Math.random()*4)]);//random method suit  
            magicHand[i]=c1;
                    
                    System.out.println(magicHand[i].getSuits() + " "+magicHand[i].getValue());
            
        }
        
        //step 2:take input 
        System.out.println("tell me the number that is on your card");
        int userInput = input.nextInt();
        //step 3: match with array 
        System.out.println("Tell me the suit that is printed on your card");
        String icon = input2.nextLine();
        
        boolean answer =false;
        for (int a=0;a<magicHand.length;a++){
        if(icon.equalsIgnoreCase(magicHand[a].getSuits()) && userInput==magicHand[a].getValue()){
            System.out.println("Your card is within the array");
            answer=true;
        }if(!answer){
        System.out.println("Your card is not in the array");
        answer=false;
        }
        }
    }
    
}