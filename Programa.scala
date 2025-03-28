import scala.math.sqrt

case class Planeta(nombre: String, masa: Double, radio: Double) {
  def velocidadEscape: Double = sqrt((2 * 6.67430e-11 * masa) / radio) / 1000  // km/s
}

object EscapeVelocityCalculator {
  def main(args: Array[String]): Unit = {
    val planetas = List(
      Planeta("Tierra", 5.972e24, 6371000),
      Planeta("Marte", 6.417e23, 3389500),
      Planeta("Júpiter", 1.898e27, 69911000)
    )
    
    println("\nVelocidades de escape calculadas:")
    planetas.foreach { p =>
      println(f"${p.nombre}: ${p.velocidadEscape}%.2f km/s")
    }
  }
}
