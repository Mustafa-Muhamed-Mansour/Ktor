package com.example.entity

import org.ktorm.dsl.isNotNull
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object ProductModel: Table<Nothing>(tableName = "product") {
    val id = int(name = "id").primaryKey()
    val product = varchar(name = "product")
}