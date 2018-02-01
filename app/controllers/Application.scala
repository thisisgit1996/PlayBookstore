package controllers

import javax.inject.Inject

import models.Customer
import models.Customer._
import play.api.i18n.I18nSupport
import play.api.i18n.MessagesApi
import play.api.mvc._
import play.api.mvc.Cookie
import play.api.mvc.DiscardingCookie

class Application @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def index = Action {
    Ok(views.html.index())
  }

  def storeFinder = Action {implicit request: Request[AnyContent] =>
    Ok(views.html.storeFinder())
  }

  def navbar = Action {
    Ok(views.html.navbar(""))
  }

  def signInUp = Action {
    Ok(views.html.signInUp(Customer.createCustomerForm))
  }

  def signUp = Action { implicit request: Request[AnyContent] =>
    Customer.createCustomerForm.bindFromRequest.fold(
      { formWithErrors =>
        BadRequest(views.html.signInUp(formWithErrors))
      },
      { aCustomer =>
        customers.append(aCustomer)
        Ok(views.html.loginSuccess()).withCookies(Cookie("User", aCustomer.email))

      })
  }

  def carouselBS = Action {
    Ok(views.html.carouselBestSellers())
  }

  def trump = Action {
    Ok(views.html.trump())
  }

}