package food.android.com.holmuskengineering;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.List;

import food.android.com.holmuskengineering.adapter.GridAdapter;
import food.android.com.holmuskengineering.callback.AsyncCallback;
import food.android.com.holmuskengineering.network.AsyncFoodQuery;
import food.android.com.holmuskengineering.network.model.FoodItem;


/**
 * A placeholder fragment containing a simple view.
 */
public class SearchFoodActivityFragment extends Fragment
        implements AsyncCallback<List<FoodItem>>, AdapterView.OnItemClickListener {

    private AsyncFoodQuery foodQuery;
    private Button button;
    private static final String TAG = SearchFoodActivityFragment.class.getName();
    private GridView mGridView;
    private GridAdapter mAdapter;

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

        mGridView = (GridView) this.getActivity().findViewById(R.id.grid);
        mAdapter = new GridAdapter(this.getActivity().getApplicationContext(),
                this.getLayoutInflater(null));
        mGridView.setAdapter(mAdapter);
        mGridView.setOnItemClickListener(this);
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
            mAdapter.updateData(result);
        }
    }

    /**
     * Callback method to be invoked when an item in this AdapterView has
     * been clicked.
     * <p/>
     * Implementers can call getItemAtPosition(position) if they need
     * to access the data associated with the selected item.
     *
     * @param parent   The AdapterView where the click happened.
     * @param view     The view within the AdapterView that was clicked (this
     *                 will be a view provided by the adapter)
     * @param position The position of the view in the adapter.
     * @param id       The row id of the item that was clicked.
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this.getActivity().getApplicationContext(),"Grid Item Clicked",
                Toast.LENGTH_LONG);
    }
}
