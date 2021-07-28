package gameoflife


abstract class Cell {
    private val lower_bound: Int = 0 // inclusive
    private val upper_bound: Int = 10 // exclusive
    // def count_alive_neighbors(grid: Array[Array[_ <: Cell]]): Int
    // def live_or_die: Cell
}

class Alive extends Cell {
    override def toString(): String = "o"
}

class Dead extends Cell {
    override def toString(): String = "x"
}
