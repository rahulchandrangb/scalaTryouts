//Example for  for-comprehension

object pat extends App{
	println("Explaining for comprehension...")
	val lists = List(1,2,3):: List.empty::List(4,5) :: Nil
	val list_size = for{
		list @ head::_ <- lists
	} yield list.size

	println("List size of filtered unempty lists:")
	println(list_size)
}
