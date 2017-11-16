package com.greenfox.dzsofa.androidp2p;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.greenfox.dzsofa.androidp2p.adapters.MessageAdapter;
import com.greenfox.dzsofa.androidp2p.models.Message;
import com.greenfox.dzsofa.androidp2p.models.MessageResponse;
import com.greenfox.dzsofa.androidp2p.services.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    EditText editText;
    Button button;
    MessageAdapter msgAdapter;
    Retrofit retrofit;
    ApiService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        msgAdapter = new MessageAdapter(this);
        listView.setAdapter(msgAdapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msgAdapter.add(new Message("Dzsofa", editText.getText().toString()));
            }
        });
        retrofit = new Retrofit.Builder()
                .baseUrl("https://dzsofap2p.herokuapp.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        service = retrofit.create(ApiService.class);

        service.getMessages().enqueue(new Callback<MessageResponse>() {
            @Override
            public void onResponse(Call<MessageResponse> call, Response<MessageResponse> response) {
                response.body().messages.
            }

            @Override
            public void onFailure(Call<MessageResponse> call, Throwable t) {
            }
        });

        msgAdapter.clear();
        msgAdapter.addAll();
    }
}
