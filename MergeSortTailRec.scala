object tailMergeSort extends App {
	implicit def IntIntLess(x:Int,y:Int):Boolean = x < y 
	implicit def DoubleDoubleLess(x:Double,y:Double):Boolean = x < y

	def mergeSortTailRec[T](xs:List[T])(implicit f: (T,T) => Boolean):List[T] = {
	  @scala.annotation.tailrec
	  def merge(ls:List[T],rs:List[T],acc:List[T]=List()):List[T] = (ls,rs) match {
		case (Nil,_) => acc ++ rs 
	    	case (_,Nil) => acc ++ ls
		case (l::ls1,r::rs1) => if(f(l,r)) merge(ls1,rs,acc :+ l)
					else merge(ls,rs1, acc :+ r)
	  }
	  val m= xs.length/2
	  if(m==0) xs
	  else{
	    val (l,r) = xs splitAt m
	    merge(mergeSortTailRec(l),mergeSortTailRec(r))
	  }
	}
	println(mergeSortTailRec(List(4,3,2,1))) 
}
