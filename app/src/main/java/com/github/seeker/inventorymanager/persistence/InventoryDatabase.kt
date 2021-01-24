package com.github.seeker.inventorymanager.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.github.seeker.inventorymanager.persistence.dao.ItemDao
import com.github.seeker.inventorymanager.persistence.entity.Item

@Database(version = 1, entities = [Item::class])
abstract class InventoryDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}
