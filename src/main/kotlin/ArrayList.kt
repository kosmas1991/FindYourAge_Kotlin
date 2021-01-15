fun main(args:Array<String>){
    var arraylist = ArrayList<String>(3)
    arraylist.add("midas")
    arraylist.add("john")
    arraylist.add("lia")

    for (i in arraylist)
        println(i)

    for (index in 0..arraylist.size-1)
        println(arraylist.get(index))
    if(arraylist.contains("john")){
        println("john is here")
    }
}