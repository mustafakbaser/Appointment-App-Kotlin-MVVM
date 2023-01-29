package net.mustafabaser.appointmentapp.data.repository

import net.mustafabaser.appointmentapp.data.model.Appointment

class AppointmentRepositoryImplementation: AppointmentRepository {
    override fun getAppointments(): List<Appointment> {
        // Receive data from Firebase
        return arrayListOf()
    }
}