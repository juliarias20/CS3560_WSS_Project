/*
Class: Path
Description: This class represents the moves taken by the Player.
             It notes the water cost, food cost, and total movement cost.
Variables:
    - Move[] moves: all moves taken in the Path
    - int totalMovementCost: the total movement cost of the Path
    - int totalWaterCost: the total water cost of the Path
    - int totalFoodCost: the total food cost of the Path
Methods:
    - addMove(Move m): adds a move the moves ArrayList and updates resource costs
    - returnSummary(): returns a summary of the moves taken and resources used
TODO:
    1. get square
*/

import java.util.ArrayList;

public class Path {
    
    private ArrayList<Move> moves = new ArrayList<>();
    private int totalMovementCost;
    private int totalWaterCost;
    private int totalFoodCost;

    public Path(ArrayList<Moves> moves) {
        this.moves = moves;
        this.totalMovementCost = 0;
        this.totalWaterCost = 0;
        this.totalFoodCost = 0;
    }

    public void addMove(Move m) {
        moves.add(m);
        //TODO: 1
        totalMovementCost += getSquare().getTerrain.getCosts[0];
        totalWaterCost += getSquare().getTerrain.getCosts[1];
        totalFoodCost += getSquare().getTerrain.getCosts[2];
    }

    public String returnSummary() {
      return "Path Cost Summary:\n"
           +   "------------------\n"
           +   "Total Movement Cost: " + totalMovementCost
           +   "\nTotal Water Cost: " + totalWaterCost
           +   "\nTotal Food Cost: " + totalFoodCost;
    }
}
