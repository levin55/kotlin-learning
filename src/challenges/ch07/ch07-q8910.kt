enum class CardSuit {
    SPADE,DIAMOND,HEART,CLUB
}

class InvalidCardNumber(message: String = "잘못된 카드 숫자입니다."): Exception(message)

class Card(var x:CardSuit,var num:Int){

    init {
        if(num < 1 || num > 13)
            throw InvalidCardNumber("잘못된 카드 숫자입니다.(카드 숫자의 범위는 1이상 13이하")
    }

    override fun toString(): String{
        //var changed:String = ""
        if(num == 1)
            return "${x} ACE"
        if(num == 11)
            return "${x} JACK"
        if(num == 12)
            return "${x} QUEEN"
        if(num == 13)
            return "${x} KING"
        else
               return "${x} ${num}"
    }
}

fun main(args: Array<String>) {
   var card1 = Card(CardSuit.SPADE,1)
    var card2 = Card(CardSuit.DIAMOND,2)
    var card3 = Card(CardSuit.HEART,3)
    var card4 = Card(CardSuit.CLUB,4)
    var card11 = Card(CardSuit.DIAMOND,11)
    var card12 = Card(CardSuit.HEART,12)
    var card13 = Card(CardSuit.CLUB,13)

    println(card2)
    println(card3)
    println(card4)
    println(card1)

    println(card11)
    println(card12)
    println(card13)

    var invalid = Card(CardSuit.SPADE,100)

}