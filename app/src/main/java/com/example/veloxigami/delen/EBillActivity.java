package com.example.veloxigami.delen;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class EBillActivity extends AppCompatActivity {

    private FirebaseDatabase db;

    private TextView billProfession, billDateAndTime, billAddress,
            billStatus, rate, sgst, cgst,
            discount, grandTotal, startTime, endTime,
            totalTime, paymentStatus,placeInfo,jobInfo;
    private ImageView profImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebill);

        billProfession = findViewById(R.id.bill_profession);
        billDateAndTime = findViewById(R.id.bill_date_and_time);
        billAddress = findViewById(R.id.bill_address);
        billStatus = findViewById(R.id.bill_job_status);
        rate = findViewById(R.id.rate_txt);
        sgst = findViewById(R.id.sgst_txt);
        cgst = findViewById(R.id.cgst_txt);
        discount = findViewById(R.id.discount_txt);
        grandTotal = findViewById(R.id.grand_total_txt);
        startTime = findViewById(R.id.start_time_txt);
        endTime = findViewById(R.id.end_time_txt);
        totalTime = findViewById(R.id.total_time_txt);
        paymentStatus = findViewById(R.id.payment_status_txt);
        profImg = findViewById(R.id.bill_prof_img);
        placeInfo = findViewById(R.id.place_info_txt);
        jobInfo = findViewById(R.id.job_info_txt);
        final Context context = this;
        Intent intent = getIntent();


        Toolbar toolbar = findViewById(R.id.toolbar_bill);
        toolbar.setTitle(intent.getStringExtra("OrderNo"));
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_arrow_back);

        db = FirebaseDatabase.getInstance();

        Log.v("OrderNo",intent.getStringExtra("OrderNo"));
        db.getReference().child("Bills").child(intent.getStringExtra("OrderNo")).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                BillStructure bill = dataSnapshot.getValue(BillStructure.class);
                billProfession.setText(bill.getProfession());
                billDateAndTime.setText(bill.getDateAndTime());
                billAddress.setText(bill.getAddress());
                billStatus.setText(bill.getStatus());
                rate.setText(bill.getRate());
                sgst.setText(bill.getTax_sgst());
                cgst.setText(bill.getTax_cgst());
                discount.setText(bill.getDiscount());
                grandTotal.setText(bill.getGrand_total());
                startTime.setText(bill.getStart_time());
                endTime.setText(bill.getEnd_time());
                totalTime.setText(bill.getTotal_time());
                paymentStatus.setText(bill.getPayment_status());
                placeInfo.setText(bill.getPlace());
                jobInfo.setText(bill.getJob_info());
                if(bill.getImgurl().isEmpty()){
                    Picasso.with(context).load("https://firebasestorage.googleapis.com/v0/b/delen-93390.appspot.com" +
                            "/o/images.png?alt=media&token=84dda21b-4cac-4564-8dd3-d612d330a76b").into(profImg);}
                else{
                    Picasso.with(context).load(bill.getImgurl()).into(profImg);}
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
