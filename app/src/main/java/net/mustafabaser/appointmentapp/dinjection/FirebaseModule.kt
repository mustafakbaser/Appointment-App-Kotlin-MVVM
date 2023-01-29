package net.mustafabaser.appointmentapp.dinjection

import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn (SingletonComponent::class)
@Module
object FirebaseModule {
    @Provides
    @Singleton
    fun provideFirebaseStoreInstance(): FirebaseFirestore{
        return FirebaseFirestore.getInstance()
    }
}