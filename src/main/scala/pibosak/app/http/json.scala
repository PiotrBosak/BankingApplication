package pibosak.app.http

import io.circe._
import io.circe.generic.semiauto._
import io.circe.refined._

import org.http4s.EntityEncoder
import org.http4s.circe.jsonEncoderOf

import cats.Applicative
import java.util.UUID
import scala.util.Try
import pibosak.app.domain.bank._
object json extends JsonCodecs {
implicit def deriveEntityEncoder[F[_]: Applicative, A: Encoder]
      : EntityEncoder[F, A] = jsonEncoderOf[F, A]
}


private[http] trait JsonCodecs {

  implicit val BankIdDecoder : Decoder[BankId] = deriveDecoder[BankId]
  implicit val BankIdEncoder : Encoder[BankId] = deriveEncoder[BankId]

implicit val BankNameDecoder : Decoder[BankName] = deriveDecoder[BankName]
  implicit val BankNameEncoder : Encoder[BankName] = deriveEncoder[BankName]

implicit val BankDecoder : Decoder[Bank] = deriveDecoder[Bank]
  implicit val BankEncoder : Encoder[Bank] = deriveEncoder[Bank]



}
