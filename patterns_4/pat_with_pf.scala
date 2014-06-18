object PartfunDemo extends App {
	println("Doing the 2nd example with partial function..")
	val wordFreqs = List(("rahul",9),("Tom",3),("Raju",5),("Exception",1))
	def pf = new PartialFunction [(String,Int),String] {
		def apply(wordFreqSeq:(String,Int)) = wordFreqSeq match {
			case (w,f) if f>2 => w 
		}
		def isDefinedAt(wordFreqSeq:(String,Int)) = wordFreqSeq match {
			case (w,f) if f>1 => true
			case _ => false
		}
	}
	println(wordFreqs collect pf)
}
