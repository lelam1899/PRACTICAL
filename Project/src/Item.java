public class Item{
    public int itemId;
    public String Name;
    public String Producer;
    public double Price;
    public Item(){};

    public Item( int itemId, String name, String producer, double price ){
        this.itemId = itemId;
        Name = name;
        Producer = producer;
        Price = price;
    }
    public  String toString(){
        return itemId+ " " +Name+ " " +Producer+" "+Price;

    }
}
