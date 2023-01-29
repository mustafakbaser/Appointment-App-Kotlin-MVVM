package net.mustafabaser.appointmentapp.appointments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import dagger.hilt.android.AndroidEntryPoint
import net.mustafabaser.appointmentapp.R
import net.mustafabaser.appointmentapp.databinding.FragmentAppointmentDetailBinding
import net.mustafabaser.appointmentapp.databinding.FragmentAppointmentListingBinding
import net.mustafabaser.appointmentapp.util.UiState

@AndroidEntryPoint
class AppointmentListingFragment : Fragment() {
    val viewModel: AppointmentViewModel by viewModels()
    val TAG: String = "AppointmentListingFragment"
    lateinit var binding: FragmentAppointmentListingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAppointmentListingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getAppointments()
        viewModel.appointment.observe(viewLifecycleOwner){ state ->
            /*it.forEach{
                Log.e("Dummy Data", it.toString())
            }*/

            when(state){
                is UiState.Loading -> {
                    Log.e("Dummy Data", "Loading")
                }
                is UiState.Failure -> {
                    Log.e("Dummy Data", state.error.toString())
                }
                is UiState.Success -> {
                    state.data.forEach{
                        Log.e("Dummy Data", state.toString())
                    }
                }
            }
        }
    }
}