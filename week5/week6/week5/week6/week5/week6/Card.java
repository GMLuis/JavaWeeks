package week5.week6;

public class Card {
    
    public int value;
    public String name;

    public Card(String name, int value)
    {
        this.name = name;
        this.value = value;
    }
    public Card(){}

    public String getName()
    {
      return name;
    }
    public void setName(String name)
    {
      this.name = name;
    }

     public int getValue()
    {
      return value;
    }
    public void setValue(int value)
    {
      this.value = value;
    }

    public String describe()
    {
    return value + name;
    }
}