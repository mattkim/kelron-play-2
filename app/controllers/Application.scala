package controllers

import play.api._
import play.api.mvc._



class Images {
  var photo1: String = "https://scontent-a-sea.xx.fbcdn.net/hphotos-frc3/t1.0-9/10001387_10152330307280844_851329358_n.jpg"
  var photo2: String = ""
  var photo3: String = ""
  var photo4: String = "https://scontent-a-sea.xx.fbcdn.net/hphotos-ash3/t1.0-9/1794515_10152330307315844_778753097_n.jpg"
  var photo5: String = ""
  var photo6: String = "https://scontent-b-sea.xx.fbcdn.net/hphotos-ash3/t1.0-9/1932344_10152330307320844_1510788078_n.jpg"
  var photo7: String = ""
  var photo8: String = "https://scontent-b-sea.xx.fbcdn.net/hphotos-frc1/t1.0-9/1920613_10152330307350844_1272257753_n.jpg"
}

object Application extends Controller {
  var photo1: String = "https://scontent-a-sea.xx.fbcdn.net/hphotos-frc3/t1.0-9/10001387_10152330307280844_851329358_n.jpg"
  var photo2: String = ""
  var photo3: String = ""
  var photo4: String = "https://scontent-a-sea.xx.fbcdn.net/hphotos-ash3/t1.0-9/1794515_10152330307315844_778753097_n.jpg"
  var photo5: String = ""
  var photo6: String = "https://scontent-b-sea.xx.fbcdn.net/hphotos-ash3/t1.0-9/1932344_10152330307320844_1510788078_n.jpg"
  var photo7: String = ""
  var photo8: String = "https://scontent-b-sea.xx.fbcdn.net/hphotos-frc1/t1.0-9/1920613_10152330307350844_1272257753_n.jpg"

  def index = Action {
    var images = new Images
    Ok(views.html.index(images))
  }
  
  def sendRSVP(){
    println("testt")
  }

}