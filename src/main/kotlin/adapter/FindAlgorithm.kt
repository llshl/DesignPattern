package adapter

interface FindAlgorithm {
    fun find(global: Boolean)
}

class FindMovieAlgorithm : FindAlgorithm{
    override fun find(global: Boolean) {
        println("find movie " + if(global) "globally" else "")
    }
}