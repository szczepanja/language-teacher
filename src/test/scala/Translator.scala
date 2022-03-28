class Translator {
  def pairWords[T](polish: Seq[T], english: Seq[T]): Seq[(T, T)] = {
    polish.zip(english)
  }

  def polToEng(input: Seq[(String, String)]): Seq[String] = {
    input.map {
      case (polish, english) => s"($polish, $english)"
    }
  }

  def translate(polishWord: Seq[String], englishWord: Seq[String]): Seq[String] = {
    polToEng(pairWords(polishWord, englishWord))
  }
}
