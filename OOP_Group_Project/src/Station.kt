class Station(
    val name: String,
    var singlePrice: Double,
    var returnPrice: Double,
    var salesCount: Int = 0,
    val specialOffers: MutableList<SpecialOffer> = mutableListOf())