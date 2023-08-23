package com.aydanilozyurek.javamaps.roomdb;

import com.aydanilozyurek.javamaps.model.Place;

import androidx.room.Database;
import androidx.room.RoomDatabase;

    @Database(entities = {Place.class}, version = 1)

    public abstract class PlaceDatabase extends RoomDatabase {
        public abstract PlaceDAO placeDAO();
    }

