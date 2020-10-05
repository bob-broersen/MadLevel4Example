package com.broersen.madlevel4example

import androidx.room.*

@Dao
interface reminderDao {

    @Query("SELECT * FROM reminderTable")
    fun getAllReminder():List<Reminder>

    @Insert
    fun addReminder(reminder: Reminder)

    @Delete
    fun deleteReminder(reminder: Reminder)

    @Update
    fun updateReminder(reminder: Reminder)
}