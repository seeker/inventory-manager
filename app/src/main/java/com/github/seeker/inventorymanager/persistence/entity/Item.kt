package com.github.seeker.inventorymanager.persistence.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item (
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var code: String, // TODO allow multiple codes (EAN, QR) per item?
    var count: Int
)
