public interface QueueBehaviour {

    void takeInQueue(Actor actor);
    void takeOrders(Order order);
    void giveOrders();
    void releaseFromQueue();
    
}
