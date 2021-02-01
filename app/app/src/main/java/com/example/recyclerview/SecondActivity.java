package com.example.recyclerview;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BookListAdapter bookListAdapter;
    ArrayList<Book> bookList;
    private RecyclerView.LayoutManager linearLayoutManager, gridLayoutManager;
    Boolean layoutType = false;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.recyclerView);
        bookList = new ArrayList<>();
        bookListAdapter = new BookListAdapter(bookList, this);
        linearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(bookListAdapter);

        bookList.add(new Book(R.drawable.book_bestseller, "BestSellers", "Book", 2000));
        bookList.add(new Book(R.drawable.book_fantasy, "Fantasies", "Book", 1500));
        bookList.add(new Book(R.drawable.book_comics, "Comics", "Magazine", 2500));
        bookList.add(new Book(R.drawable.book_manga, "Manga", "Book", 3500));
        bookList.add(new Book(R.drawable.book_times, "Times", "Magazine", 1000));
        bookList.add(new Book(R.drawable.book_history, "History", "Book", 2500));


    }
}