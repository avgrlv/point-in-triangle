import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TriangleTest extends AnyFlatSpec with Matchers {

  // Точка внутри треугольника
  "Triangle" should "return true if the point is inside" in {
    val A = Point(0, 0)
    val B = Point(4, 0)
    val C = Point(0, 4)
    val triangle = new Triangle(A, B, C)

    val P = Point(1, 1)
    triangle.containsPoint(P) shouldBe true
  }

  // Точка снаружи треугольника
  it should "return false if the point is outside" in {
    val A = Point(0, 0)
    val B = Point(4, 0)
    val C = Point(0, 4)
    val triangle = new Triangle(A, B, C)

    val P = Point(5, 5)
    triangle.containsPoint(P) shouldBe false
  }

  // Точка на границе треугольника
  it should "return true if the point is on the edge" in {
    val A = Point(0, 0)
    val B = Point(4, 0)
    val C = Point(0, 4)
    val triangle = new Triangle(A, B, C)

    val P = Point(2, 2)
    triangle.containsPoint(P) shouldBe true
  }

  // Точка совпадает с одной из вершин
  it should "return true if the point is one of the vertices" in {
    val A = Point(0, 0)
    val B = Point(4, 0)
    val C = Point(0, 4)
    val triangle = new Triangle(A, B, C)

    val P = Point(0, 0)
    triangle.containsPoint(P) shouldBe true
  }

  // Точка близко к границе, но внутри
  it should "return true if the point is close to the edge but inside" in {
    val A = Point(0, 0)
    val B = Point(4, 0)
    val C = Point(0, 4)
    val triangle = new Triangle(A, B, C)

    val P = Point(0.001, 0.001)
    triangle.containsPoint(P) shouldBe true
  }

  // Точка близко к границе, но снаружи
  it should "return false if the point is close to the edge but outside" in {
    val A = Point(0, 0)
    val B = Point(4, 0)
    val C = Point(0, 4)
    val triangle = new Triangle(A, B, C)

    val P = Point(-0.001, -0.001)
    triangle.containsPoint(P) shouldBe false
  }
}