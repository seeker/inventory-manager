package com.github.seeker.inventorymanager.ui.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.seeker.inventorymanager.persistence.entity.Item

class ItemViewModel : ViewModel() {
    val items: MutableLiveData<List<Item>> by lazy {
        MutableLiveData<List<Item>>();
    }
}