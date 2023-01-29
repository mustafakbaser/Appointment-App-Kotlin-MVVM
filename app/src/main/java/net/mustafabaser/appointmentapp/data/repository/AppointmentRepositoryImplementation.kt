package net.mustafabaser.appointmentapp.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ServerTimestamp
import net.mustafabaser.appointmentapp.data.model.Appointment
import java.util.*

class AppointmentRepositoryImplementation(val database: FirebaseFirestore): AppointmentRepository {
    override fun getAppointments(): List<Appointment> {
        // Receive data from Firebase
        return arrayListOf(
            // Test with Dummy Data
            Appointment(
                id = "1",
                assignedEmployeeId="101",
                assignedUserId= "1243",
                date= Date(),
                messageText= "Merhaba, köpeğimin sağ adelesindeki zedelenmenin kontrolü yapılacak.",
                animalGenre = "Köpek"
            ),
            Appointment(
                id = "2",
                assignedEmployeeId="114",
                assignedUserId= "803",
                date= Date(),
                messageText= "Merhaba, kedimin rutin aşısı için randevu aldım.",
                animalGenre = "Kedi"
            ),
            Appointment(
                id = "3",
                assignedEmployeeId="94",
                assignedUserId= "2022",
                date= Date(),
                messageText= "Merhaba, kedimin tüy tıraşı için randevu aldım.",
                animalGenre = "Kedi"
            )
        )
    }
}