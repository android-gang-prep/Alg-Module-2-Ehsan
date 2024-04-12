package com.ehsannarmani.algoritm

fun convertCurrency(){
    print("Enter the number of dollars: ")
    val dollars = readln().toDouble()
    val cents = dollars*100

    println("Converted Coins: ${getCurrency(cents)}")
}

fun getCurrency(cents:Double):List<Coins>{
    val coins = mutableListOf<Coins>()

    var currentAmount = 0
    for (i in 0 until Coins.entries.count()){
        val coin = Coins.entries[i]
        if (cents >= coin.price){
            val givenThisCoin = (cents.minus(currentAmount)/coin.price).toInt()
            currentAmount += coin.price*givenThisCoin
            repeat(givenThisCoin){
                coins.add(coin)
            }
            if (currentAmount == cents.toInt()) {
                break
            }

        }
    }
    return coins
}

enum class Coins(val price:Int){
    Quarters(price = 25),Dimes(price = 10),Nickles(price = 5),Pennies(price = 1)
}