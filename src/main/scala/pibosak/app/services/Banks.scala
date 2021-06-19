package pibosak.app.services
import pibosak.app.domain.bank._
import java.util.UUID
trait Banks[F[_]] {

  def findAll: F[List[Bank]]
  def findById(id: UUID): F[Option[Bank]]

}

object MyApp extends App {

  val l = List(1, 2, 3)
  l.collect {
    case i : Int if i % 2 == 0 => List(i * 3,i * 4)
  }.flatten
  .foreach(println)
}
