package net.mustafabaser.appointmentapp.appointments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import net.mustafabaser.appointmentapp.R
import net.mustafabaser.appointmentapp.databinding.FragmentAppointmentDetailBinding

@AndroidEntryPoint
class AppointmentDetailFragment : Fragment() {
    val TAG: String = "AppointmentDetailFragment"
    lateinit var binding: FragmentAppointmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAppointmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}