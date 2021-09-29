package ali.app.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRecView;
    private BookRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        adapter = new BookRecViewAdapter(this);

        booksRecView = findViewById(R.id.booksRecView);

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Some book", "Some author", 50, "https://img.lsukbp.com/2020/05/book-img2.jpg",
                "A very short description...", "Lorem ipsum dolor sit amet met imnum ajsdn jasknd djbf d nfgjdfgfdfgnj dfg"));

        books.add(new Book(1, "A clever book name", "Author2", 100, "https://img.lsukbp.com/2020/05/book-img2.jpg",
                "Lorem ipsum dolor sit amet met ipsum dolor sit amet met amen sja sf ", "Lorem ipsum dolor sit amet met imnum ajsdn jasknd djbf d nfgjdfgfdfgnj dfg"));

        adapter.setBooks(books);


    }
}