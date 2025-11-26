package OOP_Group_Project

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
