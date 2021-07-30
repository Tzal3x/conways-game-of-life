# conways-game-of-life
A simulation of Conway's Game of Life: A cellular automaton devised by the British mathematician John Horton Conway in 1970.

It is a zero-player game, meaning that its evolution is determined by its initial state, requiring no further input. One interacts with the Game of Life by creating an initial configuration and observing how it evolves. [Source: https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life]

This script get initialized randomly with a seed of 42 in a 10x10 grid, moving on the next round every 1 second.

To run it you must have Scala installed and sbt (The Scala Build Tool), then just run from the CLI under the repo's working directory `sbt run`.

![Alt text](https://github.com/Tzal3x/conways-game-of-life/blob/main/gameoflife.gif)
