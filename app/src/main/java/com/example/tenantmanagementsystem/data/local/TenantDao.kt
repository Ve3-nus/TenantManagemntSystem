package com.example.tenantmanagementsystem.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.tenantmanagementsystem.data.model.Tenant

// @Dao (Data Access Object) defines the SQL operations available on the "tenants" table
@Dao
interface TenantDao {

    // @Insert generates the SQL INSERT statement; "suspend" runs it off the main UI thread
    @Insert
    suspend fun insertTenant(tenant: Tenant)

    // @Query runs a custom SQL SELECT and returns LiveData so the UI updates automatically on changes
    @Query("SELECT * FROM tenants ORDER BY name")
    fun getAllTenants(): LiveData<List<Tenant>>
}