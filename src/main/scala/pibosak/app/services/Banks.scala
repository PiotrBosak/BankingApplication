package pibosak.app.services
import pibosak.app.domain.bank._
import java.util.UUID
trait Banks[F[_]]{

  def findAll : F[List[Bank]]
  def findById(id : UUID) : F[Option[Bank]]

}
