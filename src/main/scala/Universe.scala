package gameoflife


object Universe {
    private val grid_rows = 10 
    private val grid_columns = 10
    
    var grid: Array[Array[_ <: Cell]] = dead_grid
    
    // def update_grid: Unit = {
    //     var new_grid = dead_grid
    //     for (i <- 0 to grid_rows - 1; j <- 0 to grid_columns - 1) {
    //         var current_cell = this.grid(i)(j)
    //         var new_cell = current_cell.live_or_die
    //         new_grid(i)(j) = new_cell
    //     }
    //     this.grid = new_grid
    // }

    def dead_grid: Array[Array[_ <: Cell]] = {
        (for (i <- 1 to grid_rows) yield {
            for (j <- 1 to grid_columns) yield {
                new Dead
                } 
            }.toArray
        ).toArray
    }
}
