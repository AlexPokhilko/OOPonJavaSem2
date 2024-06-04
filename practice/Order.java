public class Order {

    public String item;
    public String buyer;

    public boolean accomplished = false;

    public Order() {

    }

    public Order(String buyer, String item) {
        this.buyer = buyer;
        this.item = item;
    }

    public String getName(){
        return buyer;
    }

    public String getItem(){
        return item;
    }

    public boolean getAccomplished(){
        return accomplished;
    }

    public void setName(String buyer) {
        this.buyer = buyer;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void isAccomplished(){
        this.accomplished = true;
    }



    @Override
    public String toString() {
        return "Order{" +
                "name='" + buyer + '\'' +
                ", item=" + item +
                ", accomplished=" + accomplished +
                '}';
    }
}
