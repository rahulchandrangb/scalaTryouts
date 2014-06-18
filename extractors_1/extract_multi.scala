object extractor extends App{

	println("Extracting multival..")
	trait User {
		def name: String
		def score: Int
	}
	class FreeUser(val name: String,val score:Int,val upgradeProb:Double) extends User
	class PremiumUser(val name:String, val score:Int) extends User

	object FreeUser{
		def unapply(s:FreeUser):Option[(String,Int,Double)] = Some(s.name,s.score,s.upgradeProb)
	}
	
	object PremiumUser{
		def unapply(s:PremiumUser):Option[(String,Int)] = Some (s.name,s.score)
	}
	
	val usr1 : User  = new PremiumUser("Rahul",10)
	val usr: User = new FreeUser("Root",20,0.87)	
	usr match {
		case FreeUser(name,_,p) =>
			if(p>0.75) println(s"Hi $name, wud u like to upgrade")
			else println(s"Hello $name")
		case PremiumUser(name,score) =>
			println(s"Welcome back dear $name")
	}



}
