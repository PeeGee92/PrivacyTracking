package comp_431.privacytracking.company;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import comp_431.privacytracking.LoginActivity;
import comp_431.privacytracking.R;
import comp_431.privacytracking.company.adapters.UserContractsAdapter;

public class Request1Activity extends AppCompatActivity {

    RecyclerView.Adapter adapter;

    @BindView(R.id.rbCompaniesList)
    RecyclerView companiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request1);
        companiesList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new UserContractsAdapter(getAllCompanyList());
        companiesList.setAdapter(adapter);
    }
    private List<String> getAllCompanyList(){
        return LoginActivity.db.CompanyDAO().getAllExceptMe(LoginActivity.currentUser.toString());
    }
    @OnClick({R.id.userList})
    public void onViewClicked(View view){
        switch (view.getId()){
        }
    }

}