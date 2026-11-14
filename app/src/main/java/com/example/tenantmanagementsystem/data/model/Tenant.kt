package com.example.tenantmanagementsystem.data.model

// Room annotations tell Room how to turn this class into a SQLite table
import androidx.room.Entity
import androidx.room.PrimaryKey
// Serializable is built into Java/Kotlin: no plugin needed
import java.io.Serializable

// @Entity marks this class as a database table named "tenants"
@Entity(tableName = "tenants")
data class Tenant(
    val name: String,
    val phone: String,
    val rent: String,
    // @PrimaryKey uniquely identifies each row; autoGenerate = true lets SQLite assign 1, 2, 3...
    // Placed last with "= 0" so existing Tenant(name, phone, rent) calls still work
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
// ": Serializable" means "a Tenant can be packed up and sent
// to another screen". Safe Args needs this in Practical 3
) : Serializable {

    // Unchanged: the text shown by @{tenant.summary()}
    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
    }
}