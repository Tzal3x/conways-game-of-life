package gameoflife


object Display {
    def show(grid: Array[Array[Cell]], round: Int, cells: Int): Unit = {
        System.out.flush()
        println("[Conway's Game of Life!]")
        System.out.print(grid_formatted(grid) + s"[Round: $round][Cells: $cells]\n")
    }

    def grid_formatted(grid: Array[Array[Cell]]): String = {
        val grid_rows: Int = grid(0).length
        val grid_columns: Int = grid.length

        val border: String  = s"+${"-" * (grid_columns * 2 - 1)}+\n" // e.g. +-----------+
        val rows_template: String = ("|%s " + "%s " * (grid_columns - 2) + "%s|\n") 
        val grid_bordered: Array[String] = grid.map(x => rows_template.format(x: _*))
        
        border + grid_bordered.foldLeft("")(_ + _) + border
    }
}
