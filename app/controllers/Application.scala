package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def navbar = Action {
    Ok(views.html.navbar())
  }

  def signInUp = Action {
    Ok(views.html.signInUp())
  }

  def login = Action {
    Ok(views.html.index())
  }

  def carouselBS = Action {
    Ok(views.html.carouselBestSellers())
  }

}