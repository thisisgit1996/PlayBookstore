package models

import play.api.data.Form
import play.api.data.Forms._

import scala.collection.mutable.ArrayBuffer

case class Customer(var email: String, var password: String)

object Customer {

  val createCustomerForm = Form(
    mapping(
      "email" -> email,
      "password" -> nonEmptyText
    )(Customer.apply)(Customer.unapply)
  )

  val customers = ArrayBuffer(
    Customer("leo@gmail.com", "lpass"),
    Customer("jordan@gmail.com", "jpass"),
    Customer("andy@gmail.com", "apass")
  )
}
