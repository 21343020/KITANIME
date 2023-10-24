package ac.id.unp.ft.elektronika.aplikasiku;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    EditText search;
    ToggleButton toggle_button;
    ListView list;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        search = findViewById(R.id.search);
        toggle_button = findViewById(R.id.toggle_button);
        list = findViewById(R.id.list);

    }
}
