package com.masdika.livil2.listviewl2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.listview);
        String[] values = new String[] {
                "Android", "iPhone", "CentOS", "Windows Mobile", "Blackberry", "WebOS", "Ubuntu", "Windows7", "Debian", "Mac OS X",
                "Linux", "OS/2", "Android", "iPhone", "Slackware", "Windows Mobile", "Blackberry", "WebOS", "Ubuntu", "Windows7", "Mac OS X",
                "Linux", "OS/2", "Fedora", "Slackware", "Mint", "Windows 10", "Knoppix", "FreeBSD", "Raspbian", "Windows 98", "MS DOS",
                "openBSD", "Windows Me"
        };

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; i++){
            list.add(values[i]);
        }

        //final StableArrayAdapter adapter = new StableArrayAdapter (this, android.R.layout.simple_list_item_1, list);
        //listView.setAdapter(adapter);

        final MySimpleArrayAdapter adapter = new MySimpleArrayAdapter(this, values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);
//                view.animate().setDuration(2000).alpha(0).withEndAction(new Runnable() {
//                    @Override
//                    public void run() {
//                        list.remove(item);
//                        adapter.notifyDataSetChanged();
//                        view.setAlpha(1);
//                    }
//                });
                Toast.makeText(MainActivity.this, String.valueOf(parent.getItemAtPosition(position)), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
