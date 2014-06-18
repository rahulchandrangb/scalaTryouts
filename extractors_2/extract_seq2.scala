object extract extends App{
	println("Extract seq..2\nFixed and var parameters in case parameters...")
	trait UsrName
	class LoginUsrNm(val name: String) extends UsrName
	object LoginUsrNm {
		def unapplySeq(name:String) :Option[(String,String,Seq[String])] = {
			val names = name.trim.split(" ")
			if(names.size < 2) None
			else Some((names.last,names.head,names.drop(1).dropRight(1)))
		}
	}
	
	val s = "Rahul chalil veetil chandran"
	 s match {
		case LoginUsrNm(lastname,firstname,_*) => println(s"Hello $firstname $lastname!")
		case _ => "Please fill last and first name !!"
	}
}	


