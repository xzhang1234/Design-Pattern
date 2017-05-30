/**
 * Created by xiaoyun on 5/30/17.
 */
public class Drawer {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public Drawer() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawSimplePicture(){
        circle.draw();
        rectangle.draw();
        square.draw();
    }

}
