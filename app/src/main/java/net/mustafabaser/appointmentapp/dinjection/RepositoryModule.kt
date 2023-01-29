package net.mustafabaser.appointmentapp.dinjection

import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.mustafabaser.appointmentapp.data.repository.AppointmentRepository
import net.mustafabaser.appointmentapp.data.repository.AppointmentRepositoryImplementation
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Provides
    @Singleton
    fun provideAppointmentRepository(database: FirebaseFirestore): AppointmentRepository{
        return AppointmentRepositoryImplementation(database)
    }
}