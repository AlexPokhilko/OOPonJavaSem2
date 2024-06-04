// Интерфейс ActorBehavoir,
// который будет содержать
// описание возможных
// действий актора в
// очереди/магазине

// Абстрактный класс Actor,
// который хранит в себе
// параметры актора, включая
// состояние готовности сделать
// заказ и факт получения
// заказа.


// QueueBehaviour, который описывает
// логику очереди – помещение в/освобождение из
// очереди, принятие/отдача заказа

// Интерфейс MarketBehaviour, который описывает
// логику магазина – приход/уход покупателей,
// обновление состояния магазина

import java.sql.Array;

public class Program {
    public static void main(String[] args) {

        Market mkt = new Market();

        Actor a1 = new Human("Ivan");
        Actor a2 = new Human("Petr");
        Actor a3 = new Human("Egor");

        Order o1 = new Order(a1.name, "Makarony");

        Order o2 = new Order(a2.name, "Smetana");

        Order o3 = new Order(a3.name, "Moloko");


        Actor[] act = new Actor[]{a1, a2, a3};
        Order[] ord = new Order[]{o1, o2, o3};

        for(int i=0; i<3; i++){
            mkt.acceptToMarket(act[i]);
            mkt.takeOrders(ord[i]);
            act[i].setMakeOrder(true);
            mkt.takeInQueue(act[i]);

            mkt.update();
        }

        for(int i=0; i<3; i++){

            act[i].setTakeOrder(true);
//            mkt.takeOrders(ord[i]);
            ord[i].isAccomplished();


            mkt.update();
        }
        mkt.update();


    }
    
}
