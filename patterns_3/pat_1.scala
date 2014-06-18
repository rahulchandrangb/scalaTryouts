object pat extends App {
	println("Pattern example 1..")
	
	def gameResults:Seq[(String,Int)]  = ("Rahul",6000)::("abcd",3000)::("efgh",9000)::Nil
	def hallOfFame  = for {
		results <- gameResults
		(name, score) = results
		if(score > 5000)
	} yield name
	println(hallOfFame)
}
