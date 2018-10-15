fun main(args: Array<String>){

    val a: String? = null

    try {

        a?.let {
            println("Okay 1")
        }

        if(a!!.isEmpty()){ // pasti error masuk exception
            println("Okay")
        }

    }catch (e: Exception){
        println("Masuk exception $e")
    }finally {
        println("pasti kesini")
    }

    println("Hallo mas bro")

}