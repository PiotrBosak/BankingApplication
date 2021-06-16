package pibosak.app.domain

import java.util.UUID

object client {

  case class ClientId(value: UUID) extends AnyVal
  case class ClientName(value: String) extends AnyVal
  case class Password(value: String) extends AnyVal
  case class StreetName(value: String) extends AnyVal
  case class CityName(value: String) extends AnyVal
  case class Addres(street: StreetName, city: CityName)

  case class Client(
      id: ClientId,
      name: ClientName,
      password: Password,
      address: Addres
  )

}
