object extract extends App{
	println("Starting Boolean Extractor")
	trait User{
		def name: String
	}
	class FreeUser(val name:String,val prob:Double) extends User
	class PremiumUser(val name:String) extends User
	//class premiumCandidate(val name:String,val prob:Double) extends User
	object FreeUser{
		def unapply(user:FreeUser): Option[(String,Double)] = Some(user.name,user.prob)
	}
	object PremiumUser {
		def unapply(user:PremiumUser) : Option[String] = Some (user.name)
	}
	object premiumCandidate{
		def unapply(user:FreeUser): Boolean = user.prob > 0.75
	}

	val usr:User = new FreeUser("Rahul",0.8)
	usr match{
		case freeUsr @ premiumCandidate() => 
			println("Magic Happened!!")
		case _ =>
			println("None..!!")
	}
}
