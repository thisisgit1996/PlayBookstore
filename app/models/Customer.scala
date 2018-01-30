package models

class Customer(var email: String, var password: String) {

  def getEmail(): String = {this.email}
  def getPassword(): String = {this.password}

  def setEmail(emal: String): Unit = {
    this.email = emal
  }

  def setPassword(pazzword: String): Unit = {
    this.password = pazzword
  }

}
