object extract extends App {
	println("Stream Extractor Infix....")

	val inf_test = 12 #:: 23 #:: Stream.empty
	inf_test match {
		case first #:: second #:: _ =>
			println(s"First:$first, second: $second")
		case _ =>
			println("Un identified Case!!")
	}
}
