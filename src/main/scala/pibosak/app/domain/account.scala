package pibosak.app.domain

import java.util.UUID
import pibosak.app.domain.client._
import pibosak.app.domain.bank._

object account {

  case class AccountId(value: UUID) extends AnyVal
  case class Currency(value: String) extends AnyVal
  case class Balance(value: Double) extends AnyVal

  case class Account(id : AccountId,
                     client : Client,
                     bank : Bank,
                     currency : Currency,
                     balance : Balance
                    )

}
