package pibosak.app.http.routes

import cats.Monad
import cats.Defer
import pibosak.app.services.Accounts
import org.http4s.dsl.Http4sDsl
import org.http4s.AuthedRoutes

final class AccountRoutes[F[_] : Monad : Defer](
  accounts : Accounts[F]
) extends Http4sDsl[F] {

  private[http] val prefixPath = "/accounts"
//some other line

  //yet another

  // private val httpRoutes : AuthedRoutes
}
