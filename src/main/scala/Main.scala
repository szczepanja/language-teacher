import scala.io.Source
import scala.io.StdIn.readLine
import scala.sys.exit

case class Translate(polish: String, english: String)

class Main {
  val fileName = "C:\\Users\\a.szczepanik\\Projekty\\language-teacher\\Words"
  val lines: Seq[String] = Source.fromFile(fileName).getLines.toSeq

  val commands: Seq[Translate] = lines.map {
    line => {
      val Array(polish, english) = line.split("\\W+")
      Translate(polish, english)
    }
  }

  val question: String = readLine(s"Translate the word: ")
}

object Main extends App {
  val main = new Main

  while (true) {
    println(main.question)
    exit(0)
  }
}