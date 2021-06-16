package pibosak.app.services
import pibosak.app.domain.account._
import java.util.UUID
trait Accounts[F[_]] {

  def findAll : F[List[Account]]

  def findById(id : UUID) : F[Option[Account]]
}
