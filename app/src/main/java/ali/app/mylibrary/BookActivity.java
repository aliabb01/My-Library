package ali.app.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookActivity extends AppCompatActivity {
    
    private TextView txtBookName, txtAuthor, txtPages, txtDescription;
    private Button btnAddToWantToRead, btnAddToAlreadyRead, btnAddToCurrentlyReading, btnAddToFacourites;
    private ImageView bookImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initViews();

        String longDescription = "Lorem ipsum dolor sit amet met imnum dor dolor wa sad retuy iqna asni skupmun" + "\n" +
                "Lorem ipsum dolor sit amet met imnum dor dolor wa sad retuy iqngo kemg kfe gsa";

        //TODO: Get the data from recycler view in here
        Book book = new Book(1, "Some book", "Some author", 50, "https://img.lsukbp.com/2020/05/book-img2.jpg",
                "A very short description...", longDescription);

        setDate(book);
    }

    private void setDate(Book book) {
        txtBookName.setText(book.getName());
        txtAuthor.setText(book.getAuthor());
        txtPages.setText(String.valueOf(book.getPages()));
        txtDescription.setText(book.getLongDesc());

        Glide.with(this)
                .asBitmap().load(book.getImageUrl())
                .into(bookImage);
    }

    private void initViews() {
        txtAuthor = findViewById(R.id.book_author);
        txtBookName = findViewById(R.id.book_name);
        txtPages = findViewById(R.id.book_pages);
        txtDescription = findViewById(R.id.book_longDesc);

        btnAddToAlreadyRead = findViewById(R.id.btnAlreadyRead);
        btnAddToCurrentlyReading = findViewById(R.id.btnCurrentlyReading);
        btnAddToFacourites = findViewById(R.id.btnFavouriteBooks);
        btnAddToWantToRead = findViewById(R.id.btnWantToRead);

        bookImage = findViewById(R.id.book_bookImg);
    }
}