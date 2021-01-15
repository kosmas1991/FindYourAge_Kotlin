fun main(args:Array<String>){
    kosmas@for(i in 1..10){

        for(y in 1..10){
            if(y==8 && i==2)
                break@kosmas
            println("y -> $y" + " i -> $i")
        }
    }
}