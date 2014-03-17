package controllers

import play.api._
import play.api.mvc._



class Images {
  var front: String = "http://rennardphotography.smugmug.com/photos/i-LhdjJ2K/0/X3/i-LhdjJ2K-X3.jpg"
  var bride: String = "https://scontent-b-sea.xx.fbcdn.net/hphotos-ash3/t1.0-9/1899993_10152328683635844_864037285_n.jpg"
  var groom: String = "https://scontent-b-sea.xx.fbcdn.net/hphotos-ash4/t1.0-9/1461106_10152328683630844_52862023_n.jpg"
  var photo1: String = "https://scontent-a-sea.xx.fbcdn.net/hphotos-frc3/t1.0-9/10001387_10152330307280844_851329358_n.jpg"
  var photo2: String = "https://scontent-b-sea.xx.fbcdn.net/hphotos-frc3/t1.0-9/1959462_10152328683690844_1194254241_n.jpg"
  var photo3: String = "https://scontent-a-sea.xx.fbcdn.net/hphotos-prn2/t1.0-9/1146473_10152328683735844_1753344596_n.jpg"
  var photo4: String = "https://scontent-a-sea.xx.fbcdn.net/hphotos-ash3/t1.0-9/1794515_10152330307315844_778753097_n.jpg"
  var photo5: String = "https://scontent-b-sea.xx.fbcdn.net/hphotos-ash3/t1.0-9/1920341_10152328683765844_504657188_n.jpg"
  var photo6: String = "https://scontent-b-sea.xx.fbcdn.net/hphotos-ash3/t1.0-9/1932344_10152330307320844_1510788078_n.jpg"
  var photo7: String = "https://fbcdn-sphotos-a-a.akamaihd.net/hphotos-ak-prn2/t1.0-9/1926744_10152329087520844_1295488612_n.jpg"
  var photo8: String = "https://scontent-b-sea.xx.fbcdn.net/hphotos-frc1/t1.0-9/1920613_10152330307350844_1272257753_n.jpg"
  var macys: String = "https://scontent-a-sea.xx.fbcdn.net/hphotos-frc1/l/t1.0-9/1921939_10152328686490844_1841454928_n.jpg"
  var amazon: String = "https://scontent-a-sea.xx.fbcdn.net/hphotos-frc1/t1.0-9/1901577_10152328686495844_2061585559_n.jpg"
}

object Application extends Controller {
  def index = Action {
    var images = new Images
    Ok(views.html.index(images))
  }
  
  def sendRSVP(){
    println("testt")
  }

}