data class Movie(var name: String,var genre: String,var point: Double)

fun main(args: Array<String>) {
    var movie = Movie("겨울왕국","Animation",9.0)
    println(movie)
}