package fr.estiam.helpdesklite.model

object TicketRules {
    fun canTransition(from: Status, to: Status): Boolean {
        // TODO Exercise 2: Implement the status transition policy.
        return (from == Status.OPEN && to == Status.IN_PROGRESS) ||
                (from == Status.IN_PROGRESS && to == Status.RESOLVED)
    }

    fun sortByPriority(tickets: List<SupportTicket>): List<SupportTicket> {
        // TODO Exercise 2: Order the catalogue and handle equal priorities consistently.
        return tickets.sortedByDescending { it.priority.ordinal }
    }
}
