package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.functional.syntax._

object Application extends Controller {

  case class Inbox(val name: String, count: Int)
  implicit val inboxFormat = Json.format[Inbox]

  def index = Action {
    Ok(views.html.index())
  }

  def data = Action {
    Ok(Json.toJson(Inbox("Json", 12)))
  }

}
