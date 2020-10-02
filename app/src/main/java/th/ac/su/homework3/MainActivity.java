package th.ac.su.homework3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import th.ac.su.homework3.model.WordItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter adapter = new MyAdapter();

        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);

        RecyclerView rv = findViewById(R.id.word_list_recycler_view);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
    }
}

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

         private WordItem[] items = {
                new WordItem(R.drawable.justin, "Justin Bieber", "นักร้องชาวแคนาดา"),
                new WordItem(R.drawable.ruel, "Ruel", "นักร้องชาวออสเตรเลีย"),
                new WordItem(R.drawable.lauv, "Lauv", "นักร้องชาวอเมริกัน"),
                new WordItem(R.drawable.arina, "Ariana Grande", "นักร้องชาวอเมริกัน"),
                new WordItem(R.drawable.ed, "Ed Sheeran", "นักร้องชาวอังกฤษ"),
                new WordItem(R.drawable.bruno, "Bruno Mars", "นักร้องชาวอเมริกัน"),
                new WordItem(R.drawable.rihanna, "Rihanna", "นักร้องชาวบาร์เบโดส"),
                new WordItem(R.drawable.cononn, "Conon Gray", "นักร้องชาวอเมริกัน"),
                new WordItem(R.drawable.tylor, "Taylor Swift", "นักร้องชาวอเมริกัน"),
                new WordItem(R.drawable.theweekend, "Abel Tesfaye", "นักร้องชาวแคนาดา"),
        };

        MyAdapter() {

        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.activity_word_item, parent, false);
            MyViewHolder vh = new MyViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.ImageView.setImageResource(items[position].imageResId);
            holder.wordTextView.setText(items[position].word);
            holder.wordTextView2.setText(items[position].word2);
        }

        @Override
        public int getItemCount() { return 10; }


        static class MyViewHolder extends RecyclerView.ViewHolder {
            ImageView ImageView;
            TextView wordTextView;
            TextView wordTextView2;

            MyViewHolder(@NonNull View itemView) {
                super(itemView);
                ImageView = itemView.findViewById(R.id.image_view);
                wordTextView = itemView.findViewById(R.id.textView);
                wordTextView2 = itemView.findViewById(R.id.textView2);

            }
        }
    }






