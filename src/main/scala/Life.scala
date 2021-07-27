object Life {
    def main(args: Array[String]): Unit = {
        println("Welcome to Conway's Game of Life!")
        Display show
  }
}

object Display {
    private val grid_rows = 10
    private val grid_columns = 10
    var grid = (
        for (i <- 1 to grid_rows) yield {
            for (j <- 1 to grid_columns) yield "o"
        }.toArray
    ).toArray

    def show: Unit = {
        println(grid_formatted)
    }

    def grid_formatted: String = {
        val border: String  = s"+${"-" * (grid_columns * 2 - 1)}+\n" // e.g. +-----------+
        val rows_template: String = ("|%s " + "%s " * (grid_columns - 2) + "%s|\n") 
        val grid_bordered: Array[String] = grid.map(x => rows_template.format(x: _*))
        border + grid_bordered.foldLeft("")(_ + _) + border
    }
    
}
