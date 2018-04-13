package nl.rocvantwente.rsk01.mystudentinfo;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private StudentsAdapter mAdapter;

    private class DownloadStudentsTask extends AsyncTask<String , Void , List<StudentPartialInfo>>
    {

        @Override
        protected List<StudentPartialInfo> doInBackground(String... urls) {
            QueryUtils utils = new QueryUtils(getApplicationContext());
            List<StudentPartialInfo> students = new ArrayList<StudentPartialInfo>();
            // Don't perform the request if there are no URLs, or the first URL is null.
            if (urls.length < 1 || urls[0] == null) {
                return null;
            }

            List<StudentPartialInfo> result = utils.fetchStudentData(urls[0]);
            return result;
        }

        @Override
        protected void onPostExecute(List<StudentPartialInfo> students) {
            mAdapter.clear();

            if(students != null && !students.isEmpty()){
                mAdapter.addAll(students);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdapter = new StudentsAdapter(this , new ArrayList<StudentPartialInfo>());
        ListView studentsListView = (ListView)findViewById(R.id.list_view_students);
        studentsListView.setAdapter(mAdapter);
        String api_url = "http://mgroesink-001-site7.itempurl.com/api/students";
        DownloadStudentsTask task = new DownloadStudentsTask();
        task.execute(api_url);
    }
}
