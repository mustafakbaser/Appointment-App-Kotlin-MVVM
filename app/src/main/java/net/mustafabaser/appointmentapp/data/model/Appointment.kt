package net.mustafabaser.appointmentapp.data.model

import com.google.firebase.firestore.ServerTimestamp
import java.util.*

data class Appointment(
    val id: String,
    val assignedEmployeeId: String,
    val assignedUserId: String,
    @ServerTimestamp
    val date: Date,
    val messageText: String,
    val animalGenre: String
    )