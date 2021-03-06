package nju.zhizaolian.activities;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import nju.zhizaolian.R;
import nju.zhizaolian.adapters.CustomAdapter;
import nju.zhizaolian.models.Custom;

public class CustomListActivity extends ActionBarActivity {
    private ArrayList<Custom> customList;
    private ListView customListView;
    private RefreshTask refreshTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        customListView= (ListView) findViewById(R.id.custom_listView);
        customList=new ArrayList<Custom>();
        CustomAdapter customAdapter=new CustomAdapter(this,customList);
        customListView.setAdapter(customAdapter);
        Custom a=new Custom();
        a.setName("luck");
        a.setPhone("143423425");
        a.setCompanyName("hadohfo");
        a.setCompanyPhone("1242354235");
        a.setCompanyAddress("fdhfkashg");
        customAdapter.add(a);
        Custom b=new Custom();
        b.setName("luck");
        b.setPhone("143423425");
        b.setCompanyName("hadohfo");
        b.setCompanyPhone("1242354235");
        b.setCompanyAddress("fdhfkashg");

        customAdapter.add(b);
         Custom a1=a;
        customAdapter.add(a1);
        Custom a2=a;
        customAdapter.add(a2);
        Custom a3=a;
        customAdapter.add(a3);
        refreshTask=new RefreshTask();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custom_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public class RefreshTask extends AsyncTask<Void,Void,Boolean>{



        @Override
        protected Boolean doInBackground(Void... params) {
            return false;
        }
    }

}
