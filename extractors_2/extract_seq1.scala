object extract extends App {
	trait UsrNm
	class LoginUsrNm(val name:String) extends UsrNm
	
	object LoginUsrNm{
		def unapplySeq(name : String ):Option[Seq[String]] = {
			val names = name.split(" ")
			if(names.forall(_.isEmpty)) None else Some(names)
		}
	}
	def matchCaseFun(name: String):String = name match {
		case LoginUsrNm(firstName,_*) =>  s"Hello $firstName!!"
		case _ => "Please provide a name!!"
			
	}

	println("Running case empty")
	println(matchCaseFun(""))
	println("Running case Rahul Chandran")
	println(matchCaseFun("Rahul Chandran"))
}
