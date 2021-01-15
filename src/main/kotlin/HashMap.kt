fun main(args:Array<String>){
    var hashmap = HashMap<Int,String>(3)
    hashmap.put(1,"kosmas")
    hashmap.put(2,"litsa")
    hashmap.put(3,"john")

    for(i in hashmap.keys){
        println(hashmap.get(i))
    }
    if(hashmap.contains(2)){
        println("contains 2")
    }
    if (hashmap.containsValue("kosmas")){
        println("kosmas is here bro")
    }
}