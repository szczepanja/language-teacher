import scala.io.Source

/*
* Language Teacher¶
Create a new project for a command-line application that teaches a language (e.g. English).
The application works with a file that stores translations. The file is loaded at the startup and updated with new translations at shutdown (exit).
The application uses another file for a user score. The file contains words, how often they were asked for and the ratio of successful answers.
The application is meant to ask words to translate from Polish to English and vice versa and score answers (a success = 1 or a failure = 0).
Words with lower score should be asked more often (e.g. twice as often as others).
Publish the project to GitHub and announce on slack.
* */

object TranslatorTest extends App {
  val translator = new Translator
  val fileName = "C:\\Users\\a.szczepanik\\Projekty\\language-teacher\\Words"
  val fileContent = Source.fromFile(fileName).getLines.toSeq

  case class Words(a: String, b: List[String])

  def reverseWords(words: String) = {
    val word = words.split("\\W+")

    word.zip(0 until word.size).foreach(tuple => if (tuple._2 == 1) println(tuple._1))
  }


  def readWords: Unit = {
    fileContent.foreach(reverseWords)
  }

  println(readWords)

  val polish: Seq[String] = Seq("Książka", "Drzewo")
  val english: Seq[String] = Seq("Book", "Tree")

  val actual = translator.translate(polish, english)
  val expected = Seq(("Książka", " Book"), ("Drzewo", " Tree"))

  //  println(s"Received: $actual, expected: $expected")
}
