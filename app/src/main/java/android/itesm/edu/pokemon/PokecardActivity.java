package android.itesm.edu.pokemon;

import android.itesm.edu.pokemon.model.PokeCard;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class PokecardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokecard);
        PokeCard pokeCard = (PokeCard) getIntent().getSerializableExtra("pokemon");
    }

    private void loadPokemon(PokeCard pokeCard){
        TextView id, name, artist;
        ImageView image;
        id = findViewById(R.id.id_card);
        name = findViewById(R.id.card_name);
        artist = findViewById(R.id.author_card);
        image = findViewById(R.id.card);
        RequestOptions options = new RequestOptions().centerCrop().placeholder(R.drawable.load_card).error(R.drawable.load_card);
        id.setText(pokeCard.getId());
        name.setText(pokeCard.getName());
        artist.setText(pokeCard.getArtist());

        Glide.with(this).load(pokeCard.getImageUrl()).apply(options).into(image);
    }
}
