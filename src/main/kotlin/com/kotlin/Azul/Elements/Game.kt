package com.kotlin.Azul.Elements

class Game() {
    //todo
    val numPlayers: Int = 2
    //val players:
    var table: Table = Table()
    var bag: Bag = Bag()
    var currentPlayer: Player = Player("Hannah", 0, Board() )
    var nextPlayer: Player = Player("Daniel", 0, Board())
}