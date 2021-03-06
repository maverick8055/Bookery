package com.example.bookery;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Admin_BookList extends Activity {
    ListView listView;
    DatabaseHelper db;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_booklist);


        listView = (ListView) findViewById(R.id.listBook);

        db = new DatabaseHelper(this);
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList= db.getAllBookList();
        // Create the adapter to convert the array to views
        BookAdapter adapter = new BookAdapter(this, bookList);
        // Attach the adapter to a ListView
        listView.setAdapter(adapter);
    }
}
