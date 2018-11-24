package thiagoantunes.engineeringevaluation.Data.source.local;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;


import thiagoantunes.engineeringevaluation.Data.City;

@Dao
public interface CityDao {

    @Query("SELECT * FROM cities")
    List<City> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<City> cities);
}