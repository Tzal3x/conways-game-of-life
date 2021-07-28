package gameoflife

import scala.util.control.Breaks
import scala.util.Try


class Cell(val x: Int, val y: Int, var alive: Int){
    override def toString(): String = if (alive == 1) "☐" else " "

    def count_neightbors(grid: Array[Array[Cell]]): Int = {
        val bound = grid.length  // assuming that #rows==#cols
        
        (for (i <- (x-1) to (x+1);
              j <- (y-1) to (y+1)) yield {
            var valid_rows = i >= 0 && i <= bound
            var valid_cols = j >= 0 && j <= bound
            var dont_count_self = (i != x) || (j != y)
            if (valid_rows && valid_cols && dont_count_self)
                grid(i)(j).alive
            else 
                0 // instead of java.lang.ArrayIndexOutOfBoundsException
        }).sum
    }

    def live_or_die(grid: Array[Array[Cell]]): Cell = {
        this.count_neightbors(grid) match {
            case 2 => if (this.alive == 1) new Cell(x, y, 1) else new Cell(x, y, 0)
            case 3 => new Cell(x, y, 1) 
            case _ => new Cell(x, y, 0)
        }
    }
}
