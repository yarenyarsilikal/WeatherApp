package com.yarenyarsilikal.weatherapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yarenyarsilikal.weatherapp.databinding.FragmentWeatherBinding

class WeatherFragment : Fragment() {

    private var _binding: FragmentWeatherBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWeatherBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    fun init() {
        val todaysWeathers =
            listOf(
                WeatherModel("25", "", "15:00"),
                WeatherModel("26", "", "16:00"),
                WeatherModel("27", "", "17:00"),
                WeatherModel("27", "", "18:00"),
                WeatherModel("26", "", "19:00"),
                WeatherModel("24", "", "20:00"),
                WeatherModel("23", "", "21:00")
            )
        binding.rvTodayWeather.adapter = TodaysWeatherAdapter(todaysWeathers)
        binding.rvTodayWeather.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}