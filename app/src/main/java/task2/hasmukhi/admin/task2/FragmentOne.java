package task2.hasmukhi.admin.task2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    private Button btnGoToB;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_one, container, false);

        btnGoToB=(Button)view.findViewById(R.id.btn_goto_b);
        btnGoToB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Go to Next Fragment
                FragmentTwo fragmentTwo=new FragmentTwo();
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,fragmentTwo)
                        .addToBackStack("")
                        .commit();

                //Go Back
                getFragmentManager().popBackStack();
            }
        });
        return view;
    }

}
