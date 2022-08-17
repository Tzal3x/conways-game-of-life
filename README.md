# conways-game-of-life
A simulation of Conway's Game of Life: A cellular automaton devised by the British mathematician John Horton Conway in 1970.

It is a zero-player game, meaning that its evolution is determined by its initial state, requiring no further input. One interacts with the Game of Life by creating an initial configuration and observing how it evolves. [Source: https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life]

This script get initialized randomly with a seed of 42 in a 10x10 grid, moving on the next round every 1 second.

![Alt text](https://github.com/Tzal3x/conways-game-of-life/blob/main/gameoflife.gif)

## Installation
### Local
To run it you must have Scala 2.13.8 installed and sbt 1.7.1
 (the Scala Build Tool), then just run from the CLI under the repo's working directory `sbt run`.

### Build and Run Docker container
**Build** Docker image: `docker build --tag tzalex/conways-game-of-life .`

**Run** the Docker image locally: `docker run conways-game-of-life`

### Run a container directly using Docker hub
`docker run tzalex/conways-game-of-life`

Docker hub repo link can be found [here](https://hub.docker.com/repository/docker/tzalex/conways-game-of-life).


### Tip 
⚠️ If you want to interrupt the execution of the of the program use: `docker stop $(docker ps | awk '{if($2 ~ /conways-game-of-life/){print($1)}}')`




