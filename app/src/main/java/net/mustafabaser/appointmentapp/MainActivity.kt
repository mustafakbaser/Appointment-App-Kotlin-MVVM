package net.mustafabaser.appointmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Firebase.firestore

        // Create a new user with a first and last name
        val user = hashMapOf(
            "firstName" to "Frodo",
            "lastName" to "Baggins",
            "birthDate" to 1815,
            "phoneNumber" to "+90 012 345 67 89",
            "email" to "frodobaggins@gmail.com"
        )

        // Add a new document with a generated ID
        db.collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("Database", "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w("Database", "Error adding document", e)
            }
    }
}