package com.github.seeker.inventorymanager.hilt.di

import androidx.room.Room
import com.github.seeker.inventorymanager.persistence.InventoryDatabase
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    provideInventoryDatabase(): InventoryDatabase {
        return Room.databaseBuilder(applicationContext, InventoryDatabase::class.java, "inventory-database").build()
    }
}
