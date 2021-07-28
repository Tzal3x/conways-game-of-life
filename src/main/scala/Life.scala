package gameoflife

import java.awt.DisplayMode


object Life {
    def main(args: Array[String]): Unit = {
      loop()
  }

  def loop(round: Int = 0) {
    val num_cells = Universe.alive_cells
    Display.show(Universe.grid, round, num_cells)
    Thread.sleep(1000)
    if (num_cells == 0) {
      println("No cells alive, terminating program.")
      return
    }
    else{
      Universe.update_grid
      loop(round + 1)
    }
  }
}
