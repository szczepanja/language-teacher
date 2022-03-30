import scala.io.Source

case class Translate(polish: String, english: String)

class Main {
  val fileName = "C:\\Users\\a.szczepanik\\Projekty\\language-teacher\\Words"
  val lines: Seq[String] = Source.fromFile(fileName).getLines.toSeq

  lines.map {
    line => {
      val Array(polish, english) = line.split("\\W+")
      Translate(polish, english)
    }
  }.foreach(println)
}

object Main extends App {
  val main = new Main

}