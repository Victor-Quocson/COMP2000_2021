import java.awt.*;

public class Map {

    Grid grid;
    Terrain grass;
    
    public Map() {
        grid = new Grid();
        grass = new Grass(grid.cells[0][0]);
    }

    public void paint(Graphics square) {
        grid.paint(square);
        grass.paint(square);
    }

}
