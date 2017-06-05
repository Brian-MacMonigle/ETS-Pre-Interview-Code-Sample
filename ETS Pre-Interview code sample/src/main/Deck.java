import java.util.ArrayList;

public class Deck
{
	private ArrayList<Card> cards;
	private ArrayList<Card> allCards;
	
	public Deck()
	{
		initDeck();
	}

	private void initDeck()
	{
		cards = new ArrayList<Card>();
		allCards = new ArrayList<Card>();
		// Clean way to create a whole deck of cards
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 13; j++)
			{
				Card card = new Card(Card.suits[i], Card.numbers[j]);
				cards.add(card);
				allCards.add(card);
			}
		}
	}

	public void resetDeck()
	{
		cards.clear();
		allCards.addAll(cards);
	}

	public void shuffle()
	{
		// Picks a random card from [i,'cards.siez()') and brings it to the front
		for(int i = 0; i < cards.size(); i++)
		{
			int card = (int)(Math.random() * ((cards.size()) - i));
			cards.add(0, cards.remove(card));
		}
	}

	public Card dealOneCard()
	{
		if(cards.size() >= 0)
		{
			return cards.remove(0);
		}
		else
		{
			return null;
		}
	}
}