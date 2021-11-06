package com.github.seeker.inventorymanager.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.seeker.inventorymanager.persistence.entity.Item

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<List<Item>>().apply {
        value = emptyList()
    }
    val text: LiveData<List<Item>> = _text
}
