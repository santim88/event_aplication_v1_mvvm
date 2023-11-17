package com.unalminas.eventsapp.domain.framework.db.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.unalminas.eventsapp.domain.framework.db.dao.AssistantDao
import com.unalminas.eventsapp.domain.framework.db.entity.AssistantEntity

@Database(entities = [AssistantEntity::class], version = 1)
abstract class AssistantDataBase : RoomDatabase() {
    abstract fun AssistantDao(): AssistantDao
}