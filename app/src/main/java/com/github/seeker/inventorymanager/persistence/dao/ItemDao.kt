package com.github.seeker.inventorymanager.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.github.seeker.inventorymanager.persistence.entity.Item

@Dao
interface ItemDao {
    @Query("SELECT * FROM item")
    fun getAllItems(): Array<Item>

    @Insert
    fun addItem(item: Item)

    @Update
    fun updateItem(item: Item)
}
