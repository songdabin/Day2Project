package com.example.day2project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView article_text = findViewById(R.id.article);
        registerForContextMenu(article_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    private void displayToast() {
        Toast.makeText(this, "Clicked menu1", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
    }

    @Override
    public boolean onContextItemSelected (MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_edit:
                Toast.makeText(this, "Edit choice clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.context_share:
                Toast.makeText(this, "Share choice clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.context_delete:
                Toast.makeText(this, "Delete choice clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}