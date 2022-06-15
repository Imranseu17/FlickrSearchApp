package com.flickrSearch.image.presentration.list

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.flickrSearch.image.models.Photo
import com.flickrSearch.image.databinding.ItemPhotoBinding
import java.util.*


class PhotoAdapter(): RecyclerView.Adapter<PhotoViewHolder>()
{

    private lateinit var itemList:ArrayList<Photo>
    private lateinit var context: Context
    private lateinit var listener:PhotoListItemListener

    constructor(context: Context,items: ArrayList<Photo>,listener: PhotoListItemListener) : this() {
    this.itemList = items
    this.listener = listener
    this.context = context

}


    interface PhotoListItemListener {
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
        return PhotoViewHolder(binding, listener = listener )
    }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) =
        holder.bind(itemList[position])


}

class PhotoViewHolder(private val itemBinding: ItemPhotoBinding,
                     private val listener: PhotoAdapter.PhotoListItemListener) :
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