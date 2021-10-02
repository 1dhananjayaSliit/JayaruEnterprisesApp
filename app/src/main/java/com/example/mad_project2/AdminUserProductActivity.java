package com.example.mad_project2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mad_project2.models.Cart;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AdminUserProductActivity extends AppCompatActivity {

    private DatabaseReference cartList;
    RecyclerView.LayoutManager layoutManager;
    private DatabaseReference cartListRef;

    private String userID = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_user_product);

        userID = getIntent().getStringExtra("uid"):

        cartList = FirebaseDatabase.getInstance().getReference()
                .child("Cart List").child("Admin View").child(userID);
    }

    @Override
    protected void onstart()
    {
        super.onStart();

        FirebaseRecyclerOptions<Cart> options =
                new FirebaseRecyclerOptions.Builder<Cart>()
                        .setQuery(cartListRef, Cart.class)
                        .build();

        FirebaseRecyclerAdapter <Cart, CartViewHolder> adapter = new FirebaseRecyclerAdapter {
            @override
                    protected  void onBindViewHolder(@NonNull CartViewHolder Object holder;
        holder, int position);
    }

    @NonNull
            @Override
    public  CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return null;
    }

    }
    public TextView userName, userPhoneNumber, userTotalPrice, userDataTime, usserShipping;
    public Button ShowOrderBtn;

    public static class AdminOrdersViewHolder(View item) {
        super(itemView);

        userName = itemView.findViewById(R.id.order_user_name);
        userPhoneNumber = itemView.findViewById(R.id.phone_number);
        userTotalPrice = itemView.findViewById(R.id.order_total_price);
        userDataTime = itemView.findViewById(R.id.oder_direct_time);
        usserShipping = itemView.findViewById(R.id.order_user_name);
        ShowOrderBtn = itemView.findViewById(R.id.show_all_product_btn);
    }
}
}