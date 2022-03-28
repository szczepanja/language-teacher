class Translator {
  def pairWords[T](polish: Seq[T], english: Seq[T]): Seq[(T, T)] = {
    polish.zip(english)
  }

  def polToEng(input: Seq[(String, String)]): String = {
    input.map {
      case (polish, english) => s"($polish,$english)"
    }.mkString
  }

  def translate(polish: Seq[String], english: Seq[String]): String = {
    s"$polish = $english".stripMargin


    polToEng(pairWords(polish, english))
  }
}
