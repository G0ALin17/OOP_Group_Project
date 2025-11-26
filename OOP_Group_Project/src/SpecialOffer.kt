package OOP_Group_Project // work by Member C

class SpecialOffer(
    val offerName: String,
    val station: Station,
    val discount: Double,
    val description: String
) {

    fun showOfferDetails(): String {
        return "Offer name: $offerName, Station: ${station.name}, Discount: $discount%, Info: $description"
    }
}
