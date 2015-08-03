package food.android.com.holmuskengineering;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.util.List;

import food.android.com.holmuskengineering.callback.AsyncCallback;
import food.android.com.holmuskengineering.network.AsyncFoodQuery;
import food.android.com.holmuskengineering.network.model.FoodItem;


/**
 * A placeholder fragment containing a simple view.
 */
public class SearchFoodActivityFragment extends Fragment implements AsyncCallback<List<FoodItem>> {

    private AsyncFoodQuery foodQuery;
    private Button button;
    private static final String TAG = SearchFoodActivityFragment.class.getName();

    public SearchFoodActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        foodQuery = new AsyncFoodQuery(this);

        return inflater.inflate(R.layout.fragment_search_food, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button = (Button)this.getActivity().findViewById(
                R.id.button_press);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              beginQueryTest();
            }
        });
    }

    public void beginQueryTest() {
        AutoCompleteTextView textView = (AutoCompleteTextView)this.getActivity().findViewById(
                R.id.autoCompleteTextView);
        foodQuery.execute(new String[]{textView.getText().toString()});
    }

    @Override
    public void publishResult(List<FoodItem> result) {
        if (result != null) {
            Log.d(TAG,result.toString());
        }
    }
}
