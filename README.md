# Conway's Game of Life

A Java implementation of **Conway's Game of Life**, a cellular automaton devised by mathematician John Conway. This project features a simple GUI for playing, pausing, and stepping through generations.

This project was developed as a course requirement for **CSC931M**

## Game Rules

Each cell on the grid follows these rules per generation:

1. **Underpopulation**: A live cell with fewer than 2 live neighbors dies.
2. **Survival**: A live cell with 2 or 3 live neighbors survives.
3. **Overpopulation**: A live cell with more than 3 live neighbors dies.
4. **Reproduction**: A dead cell with exactly 3 live neighbors becomes alive.

## How to run

- Run `GameOfLife.jar` and the game will automatically launch.
- Alternatively, type `java -cp bin App` inside the terminal.
