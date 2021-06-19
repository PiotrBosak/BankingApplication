package pibosak.app.http.routes
import cats.syntax.all._
import cats.Monad
import pibosak.app.services.Banks
import org.http4s.dsl.Http4sDsl
import org.http4s.HttpRoutes
import pibosak.app.http.json._
import org.http4s.HttpApp
import org.http4s.server.Router
final class BankRoutes[F[_]: Monad](banks: Banks[F]) extends Http4sDsl[F] {

  private[routes] val prefixPath = "/banks"

  private val httpRoutes : HttpRoutes[F] = HttpRoutes.of[F] {
    case GET -> Root =>
      Ok(banks.findAll)
  }

  val routes : HttpRoutes[F] = Router(
    prefixPath -> httpRoutes
  )

  def main(args: Array[String]) = {
    val list = List()
    val withOne = 1 :: list
    println(list.size)
    println(withOne.size)
    val withOneAndTwo = 2 :: withOne
    println(withOneAndTwo.size)
    println(list.size)

  }

}
