package pibosak.app.services
import pibosak.app.domain.account._
import java.util.UUID
trait Accounts[F[_]] {


  def findById(id : UUID) : F[Option[Account]]

  def findAllByClientId(id : UUID) : F[List[Account]]
}
