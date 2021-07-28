package gameoflife


object Universe {
    private val grid_rows = 10 
    private val grid_columns = 10
    
    var grid: Array[Array[Cell]] = generate_grid
    
    def update_grid: Unit = {
        var new_grid = this.grid
        for (i <- 0 to grid_rows - 1; 
             j <- 0 to grid_columns - 1) {
                var current_cell = this.grid(i)(j)
                var new_cell = current_cell.live_or_die(this.grid)
                new_grid(i)(j) = new_cell
        }
        this.grid = new_grid
    }

    def generate_grid: Array[Array[Cell]] = {
        val random_cell = new scala.util.Random(42)
        (for (i <- 0 to grid_rows - 1) yield {
            for (j <- 0 to grid_columns - 1) yield {
                new Cell(i, j, alive = random_cell.nextInt(2))
                } 
            }.toArray
        ).toArray
    }

    def alive_cells: Int = Universe.grid.map(_.map(_.alive).sum).sum
}
