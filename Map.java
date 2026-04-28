/*
Class: Map
Description: This class represents the map in the WSS. It is made of squares from the Square class, and holds
             objects from the Item and Player classes.
             The player can set the difficutly and size of the map. 
Variables:
    - int width: the width of the map
    - int height: the height of the map
    - String difficulty: how difficult the game is
    - Square[][] squares: the matrix of Square objects that makes up the map
Methods:
    - getSquare(int x, int y): returns the Square at coordinate (x,y)
    - getDifficulty(): returns the game difficulty
    - getSize(): returns the size of the map as an array
    - generateMap(): creates a Square matrix using the width and height
*/

import java.util.Random;

public class Map {

    private int width;
    private int height;
    private String difficulty;
    private Square[][] squares = new Square[height][width];

    public Map(int width, int height, String difficulty, Square[][] squares) {
        this.width = width;
        this.height = height;
        this.difficulty = difficulty;
        this.squares = squares;
    }

    public Square getSquare(int x, int y) {
        return squares[y][x];
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int[] getSize() {
        return new int[] {width, height};
    }

    public void generateMap() {
        squares = new Square[height][width];
        Random rand = new Random();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Square map_square = getSquare(j, i);
                if (difficulty.equals("easy")) {
                    map_square.setTerrain(rand.nextInt(3) + 1);
                }
                else if (difficulty.equals("medium")) {
                    map_square.setTerrain(rand.nextInt(3) + 2);
                }
                else {
                    map_square.setTerrain(rand.nextInt(3) + 3);
                }
            }
        }
    }
}