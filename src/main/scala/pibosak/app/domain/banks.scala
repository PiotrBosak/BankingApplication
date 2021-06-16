package pibosak.app.domain

import java.util.UUID

object banks {

case class BankId(value: UUID) extends AnyVal
  case class BankName(value: String) extends AnyVal

  case class Bank(id : BankId, name : BankName)



}
