package net.mustafabaser.appointmentapp.appointments

import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import net.mustafabaser.appointmentapp.data.model.Appointment
import net.mustafabaser.appointmentapp.data.repository.AppointmentRepository
import net.mustafabaser.appointmentapp.util.UiState
import javax.inject.Inject

@HiltViewModel
class AppointmentViewModel @Inject constructor(
    val repository: AppointmentRepository
): ViewModel() {

    private val _appointments = MutableLiveData<UiState<List<Appointment>>>()
    val appointment: LiveData<UiState<List<Appointment>>>
        get() = _appointments

    fun getAppointments(){
        _appointments.value = UiState.Loading
        /* Delay for Loading (Synchronous)
        android.os.Handler(Looper.getMainLooper()).postDelayed({
            _appointments.value = repository.getAppointments()
        }, 2000)
        */
        _appointments.value = repository.getAppointments()
    }
}