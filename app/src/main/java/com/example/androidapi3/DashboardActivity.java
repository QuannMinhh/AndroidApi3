package com.example.androidapi3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView textViewMessage = findViewById(R.id.textViewMessage);
        // Hiển thị thông báo hoặc dữ liệu cần thiết sau khi đăng nhập thành công
    }
}
