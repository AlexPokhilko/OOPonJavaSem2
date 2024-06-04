public class Human extends Actor {



    public Human(String name) {
        super(name);

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isMakeOrder() {           // сделан ли заказ
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {          // получен ли заказ
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean flag) {      // установить готовность сделать заказ
        this.isMakeOrder = flag;
        
    }

    @Override
    public void setTakeOrder(boolean flag) {       // готовность получить заказ
        this.isTakeOrder = flag;
        
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", isMakeOrder=" + isMakeOrder +
                ", isTakeOrder=" + isTakeOrder +
                '}';
    }
}
