import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView; 

public class CountryList extends ListFragment {

    String[] users = new String[] { "INDIA","USA","AUSTRALIA","PAKISTAN" };
    String[] native = new String[]{"Karnataka","Los Angeles","Sydney","Karachi"};
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.country_list,
                container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1, users);
        setListAdapter(adapter);
        return view;
    }
    @Override
    public void onListItemClick(ListView l,
                                View v,
                                int position,
                                long id) {
        CountryDetails txt = (CountryDetails)getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change("State: "+ users[position],"Native : "+ native[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}
