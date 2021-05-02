package com.github.seeker.inventorymanager.hilt.di

import android.content.Context
import androidx.room.Room
import com.github.seeker.inventorymanager.persistence.InventoryDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext applicationContext: Context): InventoryDatabase {
        return Room.databaseBuilder(applicationContext, InventoryDatabase::class.java, "inventory-database").build();
    }
}
