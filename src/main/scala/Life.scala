package gameoflife


object Life {
    def main(args: Array[String]): Unit = {
        println("Welcome to Conway's Game of Life!")
        Display.show(Universe.grid)
  }
}
