package gameoflife


object Universe {
    private val grid_rows = 10 
    private val grid_columns = 10
    
    var grid: Array[Array[_ <: Cell]] = (
        for (i <- 1 to grid_rows) yield {
            for (j <- 1 to grid_columns) yield {
                var temp = new Dead
                temp
            } 
        }.toArray
    ).toArray
}
