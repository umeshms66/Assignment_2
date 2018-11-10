import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView; 

public class CountryLine extends ListFragment {

    String[] describtion = new String[]{"Kannada is declared as one of the official languages of India","Angeles is one of the most substantial economic engines","Sydney is the state capital of New South Wales ","Karachi is the capital of the Pakistani province of Sindh"};
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.country_details,
                container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1, description);
        setListAdapter(adapter);
        return view;
    }
    @Override
    public void onListItemClick(ListView l,
                                View v,
                                int position,
                                long id) {
        CountryLine txt = (CountryLine)getFragmentManager().findFragmentById(R.id.fragment3);
        txt.change("Description: "+ description[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}
