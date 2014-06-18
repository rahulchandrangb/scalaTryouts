object extract extends App {
	println("Extractor example")	
	trait User { def name:String  }

	class FreeUser(val name:String) extends User
	class PremiumUser(val name:String) extends User
	
	object FreeUser {
		def unapply(user: FreeUser) :Option[String] = Some(user.name)
	}
	object PremiumUser {
		def unapply(user: PremiumUser):Option[String] = Some(user.name)
	}
	
	val user:User = new FreeUser("Rahul")
	user match {
		case FreeUser(name) => println("Hello" + name)
		case PremiumUser(name) => println ("Welcome dear,"+name)
	}


}

