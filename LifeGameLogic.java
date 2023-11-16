/* in this class we are managing all the logic of the "Life Game"
 */

import java.util.Random;

public class LifeGameLogic {
	

	private int size;
	private boolean[][] board;
	
	private Random random = new Random();
	
	//constructor for GameLogic
	public LifeGameLogic(int size) {
		this.size = size;
		board = new boolean[size][size]; // create empty board by default 
		
	}
	
	//this function will randomize the board 
	public void randomizeBoard() {
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				board[i][j] = random.nextBoolean(); 
			}
		}	
	}
	
	// return the value of a tile 
	public boolean iaALive(int x, int y) {
		
		return board[x][y];
	}
	
	// calculate the next board
	public void nextGen() {
		// creating temporary board 
		boolean[][] nextBoard = new boolean[size][size];
		
		// enter values to the temporary board
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (board[i][j] == false && numOfNeighbors(i, j) == 3) {
					nextBoard[i][j] = true; 
					continue;
				}
				if (board[i][j] == true && numOfNeighbors(i, j) <= 1) {
					nextBoard[i][j] = false;
					continue;
				}
				if (board[i][j] == true && numOfNeighbors(i, j) >= 4) {
					nextBoard[i][j] = false; 
					continue;
				}
				if (board[i][j] == true && 
						(numOfNeighbors(i, j) == 3 || numOfNeighbors(i, j) == 2)) {
					nextBoard[i][j] = true; 
					continue;
				}
				else {
					board[i][j] = false;
					continue;
				}
			}
		}
		
		// Copying the temporary board to the real board
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				board[i][j] = nextBoard[i][j];
			}
		}
	}
	
	// Checking how many neighbors a tile has
	// used in the nextGen() function
	private int numOfNeighbors(int x, int y) {
		
		int num = 0;
		for (int i = x-1; i <= x+1; i++) {
			if(i >= size || i<0) {
				continue;
			}
			for (int j = y-1; j <= y+1; j++) {
				if(j >= size || j<0) {
					continue;
				}
				if (board[i][j] && !(i==x && j==y)) {
					num++;
				}
			}
		}
	return num;
	}
	
	//get function for the size of the board
	public int getSize() {
		return size;
	}
	
}
