package pibosak.app.services
import pibosak.app.domain.transfer._
trait Transfers[F[_]] {

  def findAll : F[List[Transfer]]
}
