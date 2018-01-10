
public class Card {
	
	enum Suit {Club, Diamond, Heart, Spade } 
 	 
 	private Suit suit; //Clubs, Diamonds, Hearts, Spades 
 	private int rank; //1~13 
 	/** 
 	 * @param s suit 
 	 * @param r rank 
 	 */	 
 	public Card(Suit s,int r){ 
 		suit=s; 
 		rank=r; 
 	}	 
 	 	
 	public void printCard(){ 
 		 		String s = null,r ; 
 		 		
 		 		switch(suit) 
 		 		{ 
 		 			case Club: 
 		 				s ="Club"; 
 		 				break; 
 		 			case Diamond: 
 		 				s = "Diamond"; 
 		 				break; 
 		 			case Heart: 
 		 				s = "Heart"; 
 		 				break; 
 		 			case Spade: 
 		 				s = "Spade"; 
 		 				break; 
 		 		} 
 		 		
 		 		if(rank==1)
 		 			r ="A";
 		 		else if(rank==11)
 		 			r ="J";
 		 		else if(rank==12)
 		 			r ="Q";
 		 		else if(rank==13)
 		 			r ="K";
 		 		else
 		 			r = Integer.toString(rank); 
 		 				

 		 		System.out.println(s+" "+r); 
 		} 

 	
	public Suit getSuit(){ 
 		return suit; 
 	} 
	
 	public int getRank(){ 
 		return rank; 
 	} 

 	

}
