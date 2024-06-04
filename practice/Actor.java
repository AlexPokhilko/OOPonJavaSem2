public abstract class Actor implements ActorBehaviour{

    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(){}

    public Actor(String name){

        this.name = name;
    }

    public abstract String getName();


}
