package com.example.entities

import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object ProductModelForDatabase: Table<Nothing>(tableName = "product") {
    val id = int(name = "id").primaryKey()
    val product = varchar(name = "product")
}