import java.util.ArrayList; 


public class Deck {
	
	private ArrayList<Card> cards; //
	private ArrayList<Card> usedCards; 
	public int nUsed = 1; 
	private int nu = 0 ,n;//
	public Deck(int nDeck){ 
		n=nDeck;
		cards=new ArrayList<Card>(); 
		usedCards=new ArrayList<Card>(); 
		
		//write all card Start
		for(int i = 0; i < nDeck ;i++)  
			{	for(Card.Suit s : Card.Suit.values()) 
					{
					for(int r = 1; r <= 13; r++) 
					{ 
						Card card = new Card(s,r); 
						cards.add(card);
					} 
				}
			}
		
		//write all card End
		shuffle();

	}
	
	public void shuffle() {
		Card c;
		int j ;
		for(int i = 0; i == cards.size() ; i++) {
			j = (int) (Math.random() * i);
		c=cards.get(i);
			cards.set(i, cards.get(j));
			cards.set(j, c);
			
			
		}
		nu = 0;
		usedCards.clear();
		
	}
	public Card getOneCard(){
		Card c;
		if(nu == 52*n) {
			shuffle();
			
		}
			
		c = cards.get(nu);
		usedCards.add(c);
		nu++;
		
		return c;
		
	}
	
/*	
	public void printDeck(){ 
 

 		for(Card c:cards) 
 		{ 
			c.printCard(); 
		} 


	} 
*/
	public ArrayList<Card> getAllCards(){ 
		return cards; 
	} 

	

}
