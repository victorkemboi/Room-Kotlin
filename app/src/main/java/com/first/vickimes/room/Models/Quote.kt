package com.first.vickimes.room.Models

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by vicki mes on 3/23/2018.
 */
@Entity(tableName = "quote")
data class Quote(


        @ColumnInfo(name = "quote")
        var quote : String,

        @PrimaryKey(autoGenerate = true)
        var uid: Long? = null

)