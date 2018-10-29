package net.nurmasp.filmcatalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;



import com.bumptech.glide.Glide;

/**
 * Created by asus on 10/30/2018.
 */



public class DetailMovie extends AppCompatActivity {

    private ImageView image;

    private TextView title, date, overview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        image = (ImageView) findViewById(R.id.big_img);

        title = (TextView) findViewById(R.id.txt_title);

        date = (TextView) findViewById(R.id.txt_release);

        overview = (TextView) findViewById(R.id.txt_sinopsis);

        MovieDetails details = (MovieDetails) getIntent().getExtras().getSerializable("MOVIE_DETAILS");

        if (details !=null){
            Glide.with(this).load("https://image.tmdb.org/t/p/w500/"+details.getPoster_path()).into(image);
            title.setText(details.getOriginal_title());
            date.setText(details.getRelease_date());
            overview.setText(details.getOverview());

        }
    }
}
