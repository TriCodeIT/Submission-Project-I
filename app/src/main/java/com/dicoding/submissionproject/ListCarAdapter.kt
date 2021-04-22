package com.dicoding.submissionproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCarAdapter(private val listCar: ArrayList<Car>): RecyclerView.Adapter<ListCarAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_car, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val car = listCar[position]

        Glide.with(holder.itemView.context)
            .load(car.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvType.text = car.type
        holder.tvDetail.text = car.product_details
    }

    override fun getItemCount(): Int {
        return listCar.size
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvType: TextView = itemView.findViewById(R.id.tv_item_type_car)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail_car)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo_car)
    }
}