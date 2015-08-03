package food.android.com.holmuskengineering.network;

import java.util.List;

import food.android.com.holmuskengineering.network.model.FoodItem;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by VIJETA on 3/8/2015.
 */
public interface HolmuskApi {
    @GET("/food/search")
    public List<FoodItem> getFoodItem(@Query("q")String query);
}
