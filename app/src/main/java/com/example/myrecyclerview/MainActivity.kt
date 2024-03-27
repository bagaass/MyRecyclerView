package com.example.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

private val Any.context: Any
    get() {
        TODO("Not yet implemented")
    }

class ListHeroAdapter(val ListHero: ArrayList<Hero>) : RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_hero, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, from, photo) = ListHero[position]


        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)


        holder.tvName.text = name
        holder.tvFrom.text = from
    }

    class RequestOptions {
        fun override(i: Int, i1: Int): Any {}

        }

        override fun getItemCount(): Int {
            return ListHero.size
        }

        inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val itemView: Any
                get() {
                    TODO()
                }
            var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
            var tvFrom: TextView = itemView.findViewById(R.id.tv_item_from)
            var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        }

        class RecyclerView {
            open class ViewHolder(value: View) {

            }

        }
    }
