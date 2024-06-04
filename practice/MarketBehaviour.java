import java.util.ArrayList;
import java.util.List;


public interface MarketBehaviour {

    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
//    List<Actor> actors, List<Actor> queue, List<Order> orders
    
}
