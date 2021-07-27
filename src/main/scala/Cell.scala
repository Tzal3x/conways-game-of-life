package gameoflife


trait Cell {
    private val lower_bound: Int = 0 // inclusive
    private val upper_bound: Int = 10 // exclusive
    def count_alive_neightbors = ???
}

class Alive extends Cell {
    override def toString(): String = "🦠"
}

class Dead extends Cell {
    override def toString(): String = "💀"
}
