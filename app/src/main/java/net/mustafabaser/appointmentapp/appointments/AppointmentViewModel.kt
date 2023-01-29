package net.mustafabaser.appointmentapp.appointments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.mustafabaser.appointmentapp.data.model.Appointment
import net.mustafabaser.appointmentapp.data.repository.AppointmentRepository

class AppointmentViewModel(
    val repository: AppointmentRepository
): ViewModel() {

    private val _appointments = MutableLiveData<List<Appointment>>()
    val appointment: LiveData<List<Appointment>>
        get() = _appointments

    fun getAppointments(){
        _appointments.value = repository.getAppointments()
    }
}