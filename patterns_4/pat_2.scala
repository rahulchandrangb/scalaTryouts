object pat extends App {
	println("Pattern match over partial functions using collect method")
	val wordFrequencies = List(("habitual", 6),("and", 56),("consuetudinary", 2),("additionally", 27),("homely", 5),("society", 13))

	def wordFreqCheckBtwn(wordFreqs:Seq[(String,Int)]):Seq[String] = wordFreqs.collect{
										case (word,freq)  if(freq>3) && freq < 25 => word 
									}
	println(wordFreqCheckBtwn(wordFrequencies))

}
