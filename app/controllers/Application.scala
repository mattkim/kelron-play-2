package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  var photo1: String = "https://scontent-a-sea.xx.fbcdn.net/hphotos-frc3/t1.0-9/10001387_10152330307280844_851329358_n.jpg"

  def index = Action {
    Ok(views.html.index(photo1))
  }
  
  def sendRSVP(){
    println("testt")
  }

}

object Images {
  var photo1 : String = "https://scontent-a-sea.xx.fbcdn.net/hphotos-frc3/t1.0-9/10001387_10152330307280844_851329358_n.jpg"
}