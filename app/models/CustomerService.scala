package models

import scala.collection.mutable.HashMap

class CustomerService {

  var customerMap: HashMap[String, Customer] = new HashMap[String, Customer]()

  def addCustomer(aCustomer: Customer): String = {
    aCustomer match {
      case null => "Customer not added. Customer passed in was null"
      case _ => {
        customerMap(aCustomer.getEmail()) = aCustomer;
        "Customer successfully added"
      }
    }
  }

}
