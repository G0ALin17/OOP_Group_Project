class Station(
    val name: String,
    var singlePrice: Double,
    var returnPrice: Double,
    var salesCount: Int = 0,
    var totalTakings: Double = 0.0,
    val specialOffers: MutableList<SpecialOffer> = mutableListOf())