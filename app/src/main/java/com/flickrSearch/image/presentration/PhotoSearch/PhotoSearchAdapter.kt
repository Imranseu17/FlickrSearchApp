package com.flickrSearch.image.presentration.PhotoSearch

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.flickrSearch.image.models.Photo
import com.flickrSearch.image.databinding.ItemPhotoBinding
import kotlin.collections.ArrayList

class PhotoSearchAdapter() :
    RecyclerView.Adapter<PhotoViewHolder>(),Filterable
{

    private lateinit var itemList:ArrayList<Photo>
    private lateinit var itemListFilter: ArrayList<Photo>
    private lateinit var context:Context
    private lateinit var listener:PhotoItemListener

    constructor(context: Context,items: ArrayList<Photo>,listener: PhotoItemListener) : this() {
        this.itemListFilter = items
        this.itemList = items
        this.listener = listener
        this.context = context

    }


    interface PhotoItemListener {
        fun onClickedPhotos(photo: String)
    }


    fun setItems(items: ArrayList<Photo>) {
        this.itemList?.clear()
        this.itemList?.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val binding: ItemPhotoBinding =
            ItemPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PhotoViewHolder(binding, listener)
    }

    override fun getItemCount(): Int = itemListFilter.size

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) =
        holder.bind(itemListFilter[position])


    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence): FilterResults {
                val charString = charSequence.toString()
                if (charString.isEmpty()) {
                       itemListFilter = itemList
                } else {
                    val filteredList: ArrayList<Photo> = ArrayList()
                    for (row in itemList) {

                        if (row.owner!!
                                .contains(charSequence)
                            || row.title
                                !!.contains(charSequence)
                        ) {
                            filteredList.add(row)
                        }
                    }
                    itemListFilter = filteredList
                }
                val filterResults = FilterResults()
                filterResults.values = itemListFilter
                return filterResults
            }

            override fun publishResults(charSequence: CharSequence, filterResults: FilterResults) {
                itemListFilter = filterResults.values as ArrayList<Photo>

                // refresh the list with filtered data
                notifyDataSetChanged()
            }
        }
    }
}

class PhotoViewHolder(private val itemBinding: ItemPhotoBinding,
                     private val listener: PhotoSearchAdapter.PhotoItemListener) :
    RecyclerView.ViewHolder(itemBinding.root),
    View.OnClickListener {

    private lateinit var Photo: Photo

    init {
        itemBinding.root.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    fun bind(item: Photo) {
        this.Photo = item
        itemBinding.name.text = "Owner: "+item.owner
        itemBinding.access.text = "Secret: "+item.secret+" Server: "+item.server
        itemBinding.address.text = "Title: "+ item.title
        Glide.with(itemBinding.root)
            .load(item.urlH)
            .into(itemBinding.image)
    }

    override fun onClick(v: View?) {
       listener.onClickedPhotos(Photo.urlH!!)
    }


}

