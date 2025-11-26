class TicketMachine(
    val originStation: Station,
    val stations: MutableList<Station> = mutableListOf(),
    var moneyInserted: Double = 0.0,
    val auth: Authentication = Authentication(),
    var currentUser: User? = null)