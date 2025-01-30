public class Card {
    private String suit;
    private String rank;
    private int value;
    private String picName;

    public Card(String suit, String rank, int value, String picName) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
        this.picName = picName;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }

    public String getPicName() {
        return picName;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    @Override
    public String toString() {
        return rank + " of " + suit + " (Value: " + value + ", Pic: " + picName + ")";
    }
}
