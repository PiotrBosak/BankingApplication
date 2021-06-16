package pibosak.app.services
import pibosak.app.domain.client._
import java.util.UUID
trait Clients[F[_]] {

  def findAll : F[List[Client]]

  def findById(id : UUID) : F[Option[Client]]
}
