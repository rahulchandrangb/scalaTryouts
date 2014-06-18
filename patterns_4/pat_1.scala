object pat extends App {
	println("Pattern matching over anonymous functions..")
	val wordFrequencies = List(("habitual", 6),("and", 56),	("consuetudinary", 2),("additionally", 27),("homely", 5),("society", 13))
	def wordsWithoutOutliers(wordFreqs:Seq[(String,Int)]):Seq[String] = wordFreqs.filter {case (_ , f) => f> 3 && f< 25} 
										    map {case (w ,_) => w}
	println(wordsWithoutOutliers(wordFrequencies))
}
	
