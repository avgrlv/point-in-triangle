import scala.io.StdIn.readLine

object PointInTriangle {

  val EPS = 1e-10

  def main(args: Array[String]): Unit = {
    println("Введите координаты вершины A (x1 y1):")
    val A = readPoint()
    println("Введите координаты вершины B (x2 y2):")
    val B = readPoint()
    println("Введите координаты вершины C (x3 y3):")
    val C = readPoint()
    println("Введите координаты точки P (x y):")
    val P = readPoint()

    if (isPointInTriangle(A, B, C, P)) {
      println("Точка находится внутри треугольника.")
    } else {
      println("Точка находится вне треугольника.")
    }
  }

  def readPoint(): (Double, Double) = {
    val input = readLine().split(" ")
    val x = input(0).toDouble
    val y = input(1).toDouble
    (x, y)
  }

  def calculateArea(a: (Double, Double), b: (Double, Double), c: (Double, Double)): Double = {
    val (x1, y1) = a
    val (x2, y2) = b
    val (x3, y3) = c
    Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0)
  }

  // Функция для проверки, находится ли точка внутри треугольника
  def isPointInTriangle(A: (Double, Double), B: (Double, Double), C: (Double, Double), P: (Double, Double)): Boolean = {
    val S_main = calculateArea(A, B, C)

    // Площади треугольников, образованных точкой P и вершинами
    val S1 = calculateArea(P, A, B)
    val S2 = calculateArea(P, B, C)
    val S3 = calculateArea(P, C, A)

    // Сумма площадей
    val totalArea = S1 + S2 + S3

    Math.abs(totalArea - S_main) < EPS
  }
}