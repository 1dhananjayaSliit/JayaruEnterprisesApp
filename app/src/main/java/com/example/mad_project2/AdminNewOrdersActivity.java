package com.example.mad_project2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mad_project2.models.AdminOrders;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;

public class AdminNewOrdersActivity {

    private RecyclerView ordersList;
    private DatabaseReference orderRef;

    @NotNull
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_admin_new_orders);

        orderRef = FirebaseDatabase.getInstance().getReference().child("Orders");

        ordersList = ordersList.findViewById();
        ordersList.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onstart();

        FirebaseRecycleroptions<AdminOrders> options =
                new FirebaseRecyclerOptions.Bilder<AdminOrders>()
                        .setQuery(orderRef, AdminOrders.class)
                        .build();

        FirebaseRecycleroptions<AdminOrders, AdminNewOrdersviewHolder> adapter =
                new FirebaseRecycleroptions<AdminOrders, AdminNewOrdersviewHolder> (options) {
                    @Override
                    protected void onBindViewHolder (@NonNull AdminNewOrdersActivity hold){
                        AdminNewOrdersActivity holder;
                        holder.userName.setText("Name: +  model.getName());
                        holder.userPhoneNumber.setText("Phone: +  model.getPhone());
                        holder.userTotalPrice.setText("Toatal Amount: +  model.getToatalAmount());
                        holder.userDataTime.setText("Order at: +  model.getDate());
                        holder.usserShippingAddress.setText("Shipping Address: +  model.getAddress());

                        holder.ShoOrderBtn.setOnClickListner(new onClickListner()) {
                            @overide
                                    public void onClick(View view){
                                Intent intent = new Intent(AdminNewOrdersActivity.this, AdminUserProductActivity);
                                int.putExtra(name:"uid", model.getPhone());
                                startActivity(intent);
                            }
                        }


                    }
                    @NonNull
                    @Override
                    public AdminNewOrdersActivity onCreateViewHolder(@NonNull ViewGroup){
                        return view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orders_layout, parent, false);
                        return  new AdminNewOrdersviewHolder(view);
                    }
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
