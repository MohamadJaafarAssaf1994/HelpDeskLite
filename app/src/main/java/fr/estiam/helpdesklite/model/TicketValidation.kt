package fr.estiam.helpdesklite.model

object TicketValidation {
    fun isTitleValid(title: String): Boolean {
        // TODO Exercise 1: Evaluate a title supplied by the form.   DONE
        return title.isNotBlank()
    }

    fun isDescriptionValid(description: String): Boolean {
        // TODO Exercise 1: Evaluate the description against the assessment's length rule. DONE
        return description.trim().length >= 10
    }

    fun create(
        id: String,
        title: String,
        description: String,
        priority: Priority,
        createdAt: Long,
    ): SupportTicket? {
        // TODO Exercise 1: Validate, normalize and set the initial status.  DONE
        if (!isTitleValid(title) || !isDescriptionValid(description)) {
            return null
        }
        return SupportTicket(
            id,
            title.trim(),
            description.trim(),
            priority,
            Status.OPEN,
            createdAt
        )
    }
}
