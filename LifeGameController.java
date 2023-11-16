/* 
 * This is where all the magic happens
 * drawing the board and controlling the game
 * */


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class LifeGameController {

    private int size = 10;

	// creating 10X10 board
	// works with other values to
	LifeGameLogic gameLogic = new LifeGameLogic(size); 
	
    private double tileSize;
    private double height;
    private double width;

    @FXML
    private Canvas canv;
    @FXML
    private GraphicsContext gc;
    
    
    @FXML
    public void initialize() {
    	gc = canv.getGraphicsContext2D();
    	
    	// determine the size of a tile
    	tileSize = gc.getCanvas().getHeight()/gameLogic.getSize(); 
    	
    	height = gc.getCanvas().getHeight();
    	width = gc.getCanvas().getWidth();
    	    	
    	drawBoard();
    	drawFrame();
    	drawMatix();
    }
    
    public double getCanvHeight() {
		return canv.getHeight();
	}
    public double getCanvWidth() {
		return 0;
	}
    
    

    @FXML
    void nextGen(ActionEvent event) {
    	gameLogic.nextGen();
    	drawBoard();
    	
    	// drawing the frame and matrix on top of the board
    	drawFrame(); 
    	drawMatix();
    }
    
    
    @FXML
    void randomize(ActionEvent event) {
    	gameLogic.randomizeBoard();
    	drawBoard();
    	
    	// drawing the frame and matrix on top of the board
    	drawFrame(); 
    	drawMatix();
    }

    // drawing a frame, Just for aesthetics
    private void drawFrame() {
		gc.strokeLine(0, 0, 0, height );
		gc.strokeLine(0, 0, width, 0 );
		gc.strokeLine(width, height, 0, height );
		gc.strokeLine(width, height, width, 0 );

    }

    // drawing a matrix on the board
    private void drawMatix() {
		for (int i = 1; i < size; i++) {
			gc.setStroke(Color.BLACK);
			gc.strokeLine(width, i*tileSize, 0, i*tileSize );
		}
		for (int i = 1; i < size; i++) {
			gc.setStroke(Color.BLACK);
			gc.strokeLine(i*tileSize, height, i*tileSize, 0 );
		}
	}
    
    // drawing the board, using the "iaALive" from LifeGameLogic
    private void drawBoard() {
    	
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
				if (gameLogic.iaALive(j, i)) {
					gc.setFill(Color.DARKGRAY);
					gc.fillRect(i*tileSize, j*tileSize, tileSize, tileSize);
				}
				else {
					gc.setFill(Color.WHITE);
					gc.fillRect(i*tileSize, j*tileSize, tileSize, tileSize);
				}
			}
		}
		
	}
    
    
    
}
