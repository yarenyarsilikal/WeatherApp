package com.yarenyarsilikal.weatherapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yarenyarsilikal.weatherapp.databinding.ItemWeatherTodayBinding

class TodaysWeatherAdapter(private val todaysWeather: List<WeatherModel>) :
    RecyclerView.Adapter<TodaysWeatherAdapter.TodaysWeatherViewHolder>() {

    class TodaysWeatherViewHolder(val binding: ItemWeatherTodayBinding) : RecyclerView.ViewHolder(
        binding.root
    ) {

        fun bind(todaysWeather: WeatherModel) {
            binding.tvDegree.text = todaysWeather.degree
            binding.tvHour.text = todaysWeather.hour
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodaysWeatherViewHolder =
        TodaysWeatherViewHolder(
            ItemWeatherTodayBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )


    override fun onBindViewHolder(holder: TodaysWeatherViewHolder, position: Int) {
        holder.bind(todaysWeather[position])
    }

    override fun getItemCount(): Int = todaysWeather.size
}


