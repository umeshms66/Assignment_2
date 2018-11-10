import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView; 

public class CountryDetails extends Fragment {
    TextView state,native;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.country_details,
                container, false);
        state = (TextView)view.findViewById(R.id.State);
        native = (TextView)view.findViewById(R.id.Native);
        return view;
    }
    public void change(String ustate, String unative){
        state.setText(ustate);
        native.setText(unative);
    }
}
