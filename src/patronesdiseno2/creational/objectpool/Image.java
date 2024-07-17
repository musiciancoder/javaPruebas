package patronesdiseno2.creational.objectpool;

//Represents our abstract reusable
public interface Image extends Poolable{ //siempre extiende al Poolable

    void draw(); //contiene metodos abstractos

    Point2D getLocation();

    void setLocation(Point2D location);
}
