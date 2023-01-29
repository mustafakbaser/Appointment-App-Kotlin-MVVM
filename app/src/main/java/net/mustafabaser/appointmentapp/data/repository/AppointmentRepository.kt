package net.mustafabaser.appointmentapp.data.repository

import net.mustafabaser.appointmentapp.data.model.Appointment

interface AppointmentRepository {

    fun getAppointments(): List<Appointment>
}