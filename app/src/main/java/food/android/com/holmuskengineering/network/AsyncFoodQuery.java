package food.android.com.holmuskengineering.network;

import android.os.AsyncTask;
import android.util.Log;

import java.util.List;

import food.android.com.holmuskengineering.callback.AsyncCallback;
import food.android.com.holmuskengineering.network.model.FoodItem;
import retrofit.RestAdapter;

public class AsyncFoodQuery extends AsyncTask<String,Object,List<FoodItem>> {

    private static final String FOOD_QUERY;
    private static final RestAdapter REST_ADAPTER;
    private static final HolmuskApi QUERY_API;

    private static final String TAG  = AsyncFoodQuery.class.getName();

    static {
        FOOD_QUERY = "http://test.holmusk.com";
        REST_ADAPTER = new RestAdapter.Builder().setEndpoint(FOOD_QUERY).build();
        QUERY_API = REST_ADAPTER.create(HolmuskApi.class);
    }
    private AsyncCallback<List<FoodItem>> callback;

    public AsyncFoodQuery(AsyncCallback<List<FoodItem>> callback) {
        super();
        this.callback = callback;
    }

    /**
     * Override this method to perform a computation on a background thread. The
     * specified parameters are the parameters passed to {@link #execute}
     * by the caller of this task.
     * <p/>
     * This method can call {@link #publishProgress} to publish updates
     * on the UI thread.
     *
     * @param params The parameters of the task.
     * @return A result, defined by the subclass of this task.
     * @see #onPreExecute()
     * @see #onPostExecute
     * @see #publishProgress
     */
    @Override
    protected List<FoodItem> doInBackground(String... params) {
        String query = "";
        if (params.length > 0) {
            query = params[0];
        }
        Log.d(TAG, query);

        List<FoodItem> foodItem = QUERY_API.getFoodItem(query);
        Log.d(TAG,foodItem.toString());
        return foodItem;
    }

    @Override
    protected void onPostExecute(List<FoodItem> s) {
        super.onPostExecute(s);
        Log.d(TAG, s.toString());
        this.callback.publishResult(s);
    }
}

