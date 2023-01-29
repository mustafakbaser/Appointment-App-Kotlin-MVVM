package net.mustafabaser.appointmentapp.data.repository

import net.mustafabaser.appointmentapp.data.model.Appointment
import net.mustafabaser.appointmentapp.util.UiState

interface AppointmentRepository {

    fun getAppointments(): UiState<List<Appointment>>
}