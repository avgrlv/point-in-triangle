
object PointInTriangle {

  def main(args: Array[String]): Unit = {
    println("Введите координаты вершин треугольника:")
    val A = PointInputSupport.fromUserInput()
    val B = PointInputSupport.fromUserInput()
    val C = PointInputSupport.fromUserInput()

    val triangle = new Triangle(A, B, C)

    println("Введите координаты точки для проверки:")
    val P = PointInputSupport.fromUserInput()

    if (triangle.containsPoint(P)) {
      println(s"Точка $P находится внутри треугольника $A, $B, $C.")
    } else {
      println(s"Точка $P находится снаружи треугольника $A, $B, $C.")
    }
  }
}