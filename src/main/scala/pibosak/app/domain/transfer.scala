package pibosak.app.domain

import java.util.UUID
import pibosak.app.domain.account._
object transfer {

  case class TransferId(value: UUID) extends AnyVal

  case class Currency(value: String) extends AnyVal
  case class Amount(value: Double) extends AnyVal

  case class Transfer(id : TransferId,
                      currency : Currency,
                      amount : Amount,
                      accountFrom : Account,
                      accountTo : Account
                      )


}
