package com.subi.ecommerce;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;
import com.subi.ecommerce.adapter.SanPhamAdapter;
import com.subi.ecommerce.model.Sanpham;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Sanpham> list = new Sanpham().getAll();
    SanPhamAdapter sanPhamAdapter;
    private RecyclerView recyclerView;
    private TextInputEditText find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        //Set tiêu đề
        setTitle("TRANG CHỦ");
        //Set tìm kiếm
        setFindNews();
    }

    private void setFindNews() {
        recyclerView.setFilterTouchesWhenObscured(true);
        find.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int
                    count) {
                System.out.println("Text [" + s + "] - Start [" + start + "] - Before [" + before + "] - Count [" + count + "]");
                if (count < before) {
                    sanPhamAdapter.resetData();
                }
                sanPhamAdapter.getFilter().filter(s.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void init() {
        find = findViewById(R.id.tvFind);
        recyclerView = findViewById(R.id.rcvListNews);
        //Cài đặt layout cho list, set cố cột là 2 cột
        LinearLayoutManager layoutManager
                = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        //Set list vào adapter
        sanPhamAdapter = new SanPhamAdapter(this, list);
        recyclerView.setAdapter(sanPhamAdapter);
    }

    @Override
    public void onBackPressed() {

    }

    //icon giỏ hàng
//Set menu cho action bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_giohang, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.giohang:
                startActivity(new Intent(this, GioHangActivity.class));
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}