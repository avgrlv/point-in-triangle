import scala.io.StdIn.readLine

case class Point(x: Double, y: Double) {
  override def toString: String = s"($x, $y)"
}

object PointInputSupport {
  def fromUserInput(): Point = {
    println("Введите координаты точки (x, y):")
    print("x: ")
    val x = readLine().toDouble
    print("y: ")
    val y = readLine().toDouble
    Point(x, y)
  }
}