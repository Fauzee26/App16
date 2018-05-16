package fauzi.hilmy.app16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter();
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    String[] namaSahabat = {"Abu Bakar Ash-Shidiq", "Umar Bin Khattab", "Utsman Bin Affan", "Ali Bin Abi Thalib", "Saad Bin Abi Waqqash",
            "Thalhah Bin Ubaidillah", "Zubair Bin Awwam", "Said Bin Zaid", "Abdurrahman Bin Auf", "Abu Ubaidillah Bin Jarrah"};
    String[] deskripsi = {"\t Abu Bakar termasuk orang pertama yang memeluk Islam. Sepeninggal Nabi Muhammad, Abu Bakar lah yang menggantikan posisi ia dengan menjadi khalifah Islam, yaitu pada tahun 632 sampai 634 Masehi. \\n\n" +
            "\n" +
            "\t Abu Bakar lahir dengan nama Abdullah bin Abi Quhafah, nama lengkapnya yaitu Abdullah bin Utsman bin Amir bin Amru bin Ka’ab bin Taim bin Murrah bin Ka’ab. \\n\n" +
            "\n" +
            "\t Abu Bakar sendiri merupakan ayah dari Aisyah, istri Nabi Muhammad SAW.  Dengan kata lain, Abu Bakar adalah mertua Rasulullah. \\n\n" +
            "\n" +
            "\t Abu Bakar jugalah yang pertama kali membenarkan perjalanan Isra’ Mi’raj yang dilakukan Rasulullah. Karenanya, sejak saat itu ia dipanggil Abu Bakar ash-Shiddiq.\n", "\n" +
            "\t Selain Abu Bakar, Umar bin Khattab termasuk dalam salah satu sahabat nabi yang dijamin masuk surga. Umar sendiri merupakan khalifah kedua dalam Islam setelah Abu Bakar, yakni mulai tahun 634 sampai 644 Masehi. Sama seperti pendahulunya, Abu Bakar, Umar pun diberi julukan sebagai Khulafar Rasyidin atau khalifah yang diberi petunjuk. \\n\n" +
            "\n" +
            "\t Umar lahir dari seorang ibu bernama Hantamah binti Hasyim yang amat menyayanginya. Sebelum akhirnya menggantikan posisi Abu Bakar yang wafat, Umar sempat menjabat sebagai penasihat kepala.", "\n" +
            "\t Sahabat nabi lainnya yang juga dijamin masuk surga adalah Utsman bin Affan. Ia merupakan seorang pedagang kaya yang sangat dermawan. \n" +
            "\n" +
            "\t Setelah Umar bin Khattab wafat, Utsman-lah yang menggantikan posisinya memegang tampuk kepemimpinan. Utsman mulai menjalankan kepemimpinannya dari tahun 644 sampai tahun 656 Masehi. \n" +
            "\n" +
            "\t Selain dikenal sebagai sosok yang pemalu, Utsman mendapat julukan Dzunnurain  yang artinya adalah pemilik 2 cahaya, hal ini dikarenakan Utsman menikahi dua orang putri Rasulullah, yakni Ruqayyah dan Ummu Kultsum.", "\t Setelah syahidnya Utsman, poros kekhlifahan berpindah ke tangan Ali bin Abi Thalib. Ali sendiri merupakan salah satu orang yang pertama memeluk agama Islam, Selain merupakan sepupu Rasulullah, Ali juga menikahi Fatimah az-Zahra (putri Rasul). Dari pernikahan inilah lahir dua cucu Rasulullah; Hasan dan Husein.",
            "\t Bersama beberapa sahabat lain, Sa’ad bin Abi Waqqas juga termasuk salah seorang orang terdekat nabi yang menerima Islam sebagai pegangan hidupnya. \n" +
                    "\t Selain pernah ikut berjuang membela agama Islam, ia merupakan pemimpin pasukan Islam ketika berperang melawan tentara Persia di Qadissyah. Perang tersebut merupakan salah satu perang besar dan bersejarah bagi umat Islam.", "\t Selain 4 Khulafar Rasyidin, Thalhah bin Ubaidillah merupakan sahabat nabi dari suku Quraisy yang dijamin masuk surga. Selain pernah menjadi konsultan Rasul, ia juga pernah terlibat dalam Perang Uhud yang membuatnya mengalami luka yang amat parah. Thalhah kemudian berpulang ke pangkuan Allah setelah terkena panah musuh pada Perang Jamal.", "\t Az-Zubair merupakan putra dari bibi Rasulullah atau dengan kata lain ia adalah sepupu langsung Nabi SAW. Az-ubair sendiri termasuk dalam golongan as-Sabiqun al-Awwalun atau sahabat nabi yang dijamin masuk surga. Tidak hanya itu, ia merupakan orang pertama yang dengan berani pernah menghunus pedang di Perang fi Sabilillah.", "\t Mendapat julukan sebagai Abu al-Aawar, Sa’id bin Zaid merupakan sepupu dekat Umar bin Khattab. Selain masuk Islam pada awal kedatangan ajaran Islam di Makkah, ia merupakan salah satu sahabat nabi yang sudah dijamin masuk surga oleh Allah SWT .",
            "\t Barangkali nama Abdurrahman bin Auf sudah tidak asing di telinga kita. Ya, ia memang merupakan sahabat Nabi Muhammad SAW yang sangat terkenal. Ia juga termasuk salah satu dari 8 orang pertama yang memeluk Islam dan sudah dijanjikan surga oleh Allah SWT.", "\t Sahabat nabi yang juga tidak luput dari janji imbalan surga adalah Abu Ubaidah bin al-Jarrah. Ia adalah seorang muhajirin dari kaum Quraisy Mekah. Abu Ubaidah pernah ikut serta berhijrah ke Madinah dan terlibat dalam peperangan membela Islam. Ketika Abu Bakar dipilih sebagai khalifah, Abu Ubaidah-lah yang dipilih sebagai panglima perang dalam memimpin pasukan Muslim ketika berperang melawan kekaisaran Romawi."};

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapterr, parent, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.nama.setText(namaSahabat[position]);
            holder.deskripsi.setText(deskripsi[position]);
        }

        @Override
        public int getItemCount() {
            return namaSahabat.length;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView nama, deskripsi;

            public MyViewHolder(View itemView) {
                super(itemView);
                nama = itemView.findViewById(R.id.nama);
                deskripsi = itemView.findViewById(R.id.deskripsi);
            }
        }
    }
}
