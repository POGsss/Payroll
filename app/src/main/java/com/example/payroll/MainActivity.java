package com.example.payroll;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;

import androidx.fragment.app.FragmentManager;

import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;

import android.os.Bundle;

import android.view.MenuItem;

import android.view.View;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.bottomappbar.BottomAppBar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class MainActivity extends AppCompatActivity {
    // Declarations
    BottomAppBar bottomAppBar;
    BottomNavigationView bottomNavigationView;
    FloatingActionButton fabAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization
        bottomAppBar = findViewById(R.id.bottomAppBar);
        bottomNavigationView = findViewById(R.id.bottomNavigation);
        fabAdd = findViewById(R.id.fabAdd);

        // Floating Button Functionality
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivity(intent);
            }
        });


        // Bottom Nav Functionality
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                if(item.getItemId() == R.id.dashboard){
                    selectedFragment = new DashboardFragment();
                }
                else if(item.getItemId() == R.id.employees){
                    selectedFragment = new EmployeesFragment();
                }
                else if(item.getItemId() == R.id.payroll){
                    selectedFragment = new PayrollFragment();
                }
                else if(item.getItemId() == R.id.account){
                    selectedFragment = new AccountFragment();
                }

                if (selectedFragment != null) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.setReorderingAllowed(true);
                    transaction.replace(R.id.frame_layout, selectedFragment);
                    transaction.commit();
                }
                return true;
            }
        });
    }
}
