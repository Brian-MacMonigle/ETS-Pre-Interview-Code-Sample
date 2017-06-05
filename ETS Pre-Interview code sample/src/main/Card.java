public class Card
{
	public static final String[] suits = {"diamonds", "hearts", "spades", "clubs"};

	public static final int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

	private int number;
	private String suit;

	public Card(String suit, int number)
	{
		if(number < numbers[0] || number > numbers[numbers.length - 1])
		{
			throw new IllegalArgumentException("Card number is out of bounds.  Should be between 0 and 13");
		}

		if(!suit.equals(suits[0]) && !suit.equals(suits[1]) && !suit.equals(suits[2]) && !suit.equals(suits[3]))
		{
			throw new IllegalArgumentException("Suit given is not a valid suit type.  Please use Card.suits[0-3]");
		}
		this.suit = suit;
		this.number = number;
	}

	public int getNumber()
	{
		return number;
	}

	public String getSuit()
	{
		return suit;
	}

	// Clean way to print the card
	public String toString()
	{
		if(number > 10 || number == 1)
		{
			switch(number)
			{
				case 1:
					return "Ace of " + suit;
				case 11:
					return "Jack of " + suit;
				case 12:
					return "Queen of " + suit;
				case 13:
					return "King of " + suit;
				default:
					System.err.println("Somehow an invalid card number slipped through the constructor");
					return "";
			}
		}
		else
		{
			return number + " of " + suit;
		}
	}
}