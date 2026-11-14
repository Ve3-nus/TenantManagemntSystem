package com.example.tenantmanagementsystem.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tenantmanagementsystem.data.model.Tenant

// @Database registers the tables (entities) and schema version for Room to generate TenantDatabase_Impl
@Database(entities = [Tenant::class], version = 1)
abstract class TenantDatabase : RoomDatabase() {

    // Exposes the DAO so the Repository can read and write tenants
    abstract fun tenantDao(): TenantDao

    companion object {
        // @Volatile ensures changes to INSTANCE are immediately visible across all threads
        @Volatile
        private var INSTANCE: TenantDatabase? = null

        // Singleton pattern: returns one shared database instance instead of opening multiple connections
        fun getDatabase(context: Context): TenantDatabase {
            return INSTANCE ?: synchronized(this) {
                val database = Room.databaseBuilder(
                    context.applicationContext,
                    TenantDatabase::class.java,
                    "tenant_database"
                ).build()
                INSTANCE = database
                database
            }
        }
    }
}