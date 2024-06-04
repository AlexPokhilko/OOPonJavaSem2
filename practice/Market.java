//// Реализовать класс Market и
// все методы, которые он
// обязан реализовывать.
// Методы из интерфейса
// QueueBehaviour, имитируют
// работу очереди,
// MarketBehaviour – помещает и
// удаляет человека из очереди,
// метод update – обновляет
// состояние магазина
// (принимает и отдает заказы)


// package ООПНаСеминаре2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> actors = new ArrayList<>();
    private List<Actor> queue = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();


    @Override
    public void acceptToMarket(Actor actor) {                   // допустить на рынок
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {         // отпустить с рынка
        actors.removeFirst();
    }

    @Override
    public void takeInQueue(Actor actor) {      // поставить в очередь
        queue.add(actor);
    }

    @Override
    public void releaseFromQueue() {            // удалить из очереди
        queue.remove(0);

    }

    @Override
    public void takeOrders(Order order) {                  //принять заказ
        orders.add(order);
    }

    @Override
    public void giveOrders() {                  // выдать заказ
        orders.remove(0);
    }

    @Override
    public void update() {
        
        System.out.println("Actors:");
        for(Actor elem : actors){
            System.out.println(elem.getName() + " isMakeOrder: " + elem.isMakeOrder() + " isTakeOrder " + elem.isTakeOrder());
        }
        System.out.println();

        System.out.println("Queue:");
        for(Actor elem : queue){
            System.out.println(elem.getName());
        }
        System.out.println();

        System.out.println("Orders:");
        for(Order elem : orders){
            System.out.println(elem.getName() + " " + elem.getItem()+ " accomplished = " + elem.getAccomplished());
        }
        System.out.println();

//        orders.remove(0);
        if(!actors.isEmpty() && !orders.isEmpty() && actors.get(0).isTakeOrder == true && orders.get(0).accomplished == true){
            this.releaseFromMarket(actors);
            this.releaseFromQueue();
            this.giveOrders();
        }

    }

}
