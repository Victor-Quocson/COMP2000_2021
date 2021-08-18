import java.awt.*;

public class Grass implements Terrain{
    
    Cell location;

    public Grass(Cell inCell) {
        location = inCell;
    }

    public void paint(Graphics square) {
        location.paint(square, Color.RED);
    }

}
