
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Board extends JPanel {
    private int grid[][];
    private final ArrayList<Tile> tiles;
    private final int columns;
    private final int rows;
    private final int[][] directions = {
        {-1, -1}, {-1, 0}, {-1, 1},
        { 0, -1},          { 0, 1},
        { 1, -1}, { 1, 0}, { 1, 1}
    };

    public Board(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;
        this.grid = new int[rows][columns];
        this.tiles = new ArrayList<>();
        setLayout(new GridLayout(rows, columns));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int currentRow = i;
                int currentCol = j;
                Tile newTile = new Tile();
                newTile.setOnClick(e -> toggleTile(currentRow, currentCol));
                tiles.add(newTile);
                add(newTile);
            }
        }
    }

    public void reset() {
        grid = new int[rows][columns];
    }

    public void update() {
        int newGrid[][] = createNewGrid();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                int aliveNeighbors = countAliveNeighbor(row, col);

                if(grid[row][col] == 1 && aliveNeighbors < 2)
                    newGrid[row][col] = 0;
                else if(grid[row][col] == 1 && aliveNeighbors > 3)
                    newGrid[row][col] = 0;
                
                if(grid[row][col] == 0 && aliveNeighbors == 3)
                    newGrid[row][col] = 1;
            }
        }

        grid = newGrid;
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Tile currentTile = tiles.get(i * columns + j);

                if (grid[i][j] == 0) {
                    currentTile.setDead();
                } else currentTile.setAlive();
            }
        }
    }

    public void toggleTile(int row, int col) {
        grid[row][col] = grid[row][col] > 0 ? 0 : 1;
    }

    private int countAliveNeighbor(int row, int col) {
        int count = 0;

        for(int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if(newRow >= 0 && newRow < grid.length &&
               newCol >= 0 && newCol < grid[0].length) {
                count += grid[newRow][newCol] == 1 ? 1 : 0;
            }
        }

        return count;
    }

    private int[][] createNewGrid() {
        int[][] newGrid = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            newGrid[i] = grid[i].clone();
        }

        return newGrid;
    }
}
