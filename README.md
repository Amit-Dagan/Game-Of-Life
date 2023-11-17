# Life Game Simulation

Welcome to the Life Game Simulation repository! This simple JavaFX application implements Conway's Game of Life, a cellular automaton devised by mathematician John Conway. The game involves a grid of cells that evolve over time based on a set of rules, creating interesting patterns and behaviors.

## Getting Started

To run the Life Game Simulation, follow these steps:

1. Ensure you have Java installed on your machine.
2. Clone this repository to your local machine.
3. Open the project in your favorite Java IDE.
4. Run the `LifeGame` class to start the simulation.

## Features

- **Randomize Button:** Randomly initializes the cell grid.
- **Next Gen Button:** Advances the simulation to the next generation based on Conway's Game of Life rules.

## Code Structure

### LifeGame.fxml

This XML file defines the JavaFX layout for the application. It consists of a VBox containing an HBox with "Randomize" and "Next Gen" buttons, and a Canvas for rendering the cell grid.

### LifeGame.java

The main application class responsible for initializing the JavaFX stage and displaying the user interface. It uses the `LifeGameController` class to manage the game logic.

### LifeGameController.java

This controller class handles the interaction between the user interface and the game logic. It initializes the game board, handles button actions, and updates the Canvas to display the evolving cell grid.

### LifeGameLogic.java

The core logic of the Life Game resides in this class. It manages the state of the cell grid, applies the rules of Conway's Game of Life to calculate the next generation, and provides methods for randomizing the board and checking the state of individual cells.

## How to Play

1. Click the "Randomize" button to initialize a random cell grid.
2. Click the "Next Gen" button to advance the simulation to the next generation.

Feel free to explore the code and customize the application to suit your preferences!

## Screenshots

Include screenshots or GIFs showcasing the application in action.

![Demo](/demo.gif)

## Author

[Your Name]

If you have any questions or feedback, feel free to reach out. Thank you for checking out the Life Game Simulation!
