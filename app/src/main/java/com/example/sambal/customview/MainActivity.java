package com.example.sambal.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.bigb,R.drawable.srk,R.drawable.salman,R.drawable.aamir,R.drawable.akshay,
            R.drawable.hrx,R.drawable.ranveer};
    String[] NAMES = {"Amitabh Bacchan","Sharukh Khan","Salman Khan","Aamir Khan","Akshay Kumar","Hritik Roshan","Ranveer Singh"};

    String[] DESCRIPTION = {"Actor","Actor","Actor","Actor","Actor","Actor","Actor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView= (ListView) findViewById(R.id.listView);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView);
            TextView textView_name=(TextView)convertView.findViewById(R.id.textView_name);
            TextView textView_Description=(TextView)convertView.findViewById(R.id.textView_Description);

            imageView.setImageResource(IMAGES[position]);
            textView_name.setText(NAMES[position]);
            textView_Description.setText(DESCRIPTION[position]);

            return convertView;
        }
    }
}
