class Triangle(val A: Point, val B: Point, val C: Point) {

  val EPS = 1e-10

  private def area(p1: Point, p2: Point, p3: Point): Double = {
    Math.abs(
      (p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) / 2.0
    )
  }

  private val areaABC: Double = area(A, B, C)

  def containsPoint(P: Point): Boolean = {
    val areaABP = area(A, B, P)
    val areaBCP = area(B, C, P)
    val areaCAP = area(C, A, P)

    Math.abs((areaABP + areaBCP + areaCAP) - areaABC) < EPS
  }
}