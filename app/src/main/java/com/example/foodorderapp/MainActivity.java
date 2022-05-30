package com.example.foodorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.foodorderapp.Adapters.MainAdapter;
import com.example.foodorderapp.Models.MainModel;
import com.example.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.burger,"Burger","60","Delicious spicy Burger with extra Cheese, mayonnaise and Sausages "));
        list.add(new MainModel(R.drawable.pizza,"Pizza","300","simple crust, plenty of tomato sauce, and a sprinkle of cheese"));
        list.add(new MainModel(R.drawable.mushroom,"Portobello Mushroom","55","Meaty Portobello mushrooms make for perfect vegetarian"));
        list.add(new MainModel(R.drawable.pburger,"Pizza Burger","150","Burger O'clock is available to satiate your hunger"));
        list.add(new MainModel(R.drawable.drink,"Cold Drink","20 any","All kind of Cold Drink to make you chill and cool"));
        list.add(new MainModel(R.drawable.lassi,"Lassi","15","blended drink with dahi (yogurt), water, spices and fruit."));
        list.add(new MainModel(R.drawable.dessert,"Desserts","60","Variety of Dessert which contains both chocolaty and spicy taste"));
        list.add(new MainModel(R.drawable.momos,"Momo's","30","Veg/Non-veg Momo available loaded with cheese and Panner"));
        list.add(new MainModel(R.drawable.dhosa,"Dhosa/Idli","50 dhosa+idli","Taste worthy Idli and Thinnest Dhosa with fresh Chutney "));
        list.add(new MainModel(R.drawable.meduv,"Medu Vada","20","breakfast snack made from Vigna mungo with a crispy exterior and soft interior"));
        list.add(new MainModel(R.drawable.bchicken,"Butter Chicken","45"," curry made from chicken with a spiced tomato and butter (makhan) sauce"));
        list.add(new MainModel(R.drawable.shaw,"Shawarma","60"," a sandwich especially of sliced lamb or chicken, vegetables wrapped in pita bread"));
        list.add(new MainModel(R.drawable.chickenc,"Chicken Chingara","90","Cashews and almonds add to the richness of the dish makes savoury flavour"));
        list.add(new MainModel(R.drawable.chickena,"Chicken Angara","80","a smoky paneer dish prepared from whole and powdered spices"));
        list.add(new MainModel(R.drawable.chickenm,"Chicken Makhani","100","Prepared in a buttery gravy with the addition of cream makes silky smooth"));
        list.add(new MainModel(R.drawable.naan,"Naan","10/pcs"," a round flat leavened bread with extra butter especially for the Indian"));
        list.add(new MainModel(R.drawable.palakp,"Palak Paneer","50","consisting of paneer in a thick paste made from pured spinach"));
        list.add(new MainModel(R.drawable.fishc,"Fish Curry","120","The head of a red snapper is stewed in a curry with assorted vegetables"));
        list.add(new MainModel(R.drawable.biryani,"Biryani","70","a spiced mix of meat and rice, traditionally cooked over an open fire in leather pot"));
        list.add(new MainModel(R.drawable.vrice,"Veg.Fried Rice","60","a dish of cooked rice that has been stir-fried mixed with vegetable"));
        list.add(new MainModel(R.drawable.nvrice,"NonVeg.Fried Rice","65"," a cooked rice mixed with ingredients such as eggs,vegetables,seafood,meat"));
        list.add(new MainModel(R.drawable.vnoodle,"Veg.Noodle","60","noodle contains Veggies like carrots, cabbage, bell peppers, green beans & zucchini"));
        list.add(new MainModel(R.drawable.nvnoodle,"NonVeg.  Noodle","70","noodle contains extra chicken as well as fresh vegetables"));
        list.add(new MainModel(R.drawable.tnoodle,"Tripple Noodle","80","noodle contains veg/non.veg ingredient with soup and fried noodle"));
        list.add(new MainModel(R.drawable.mvsoup,"Mixed Vegetable Soup","30","soup loaded with fresh veggies and fried noodle"));
        list.add(new MainModel(R.drawable.msoup,"Manchow Soup","25","dark brown soup prepared with vegetables,corn,generous doses of soy sauce"));
        list.add(new MainModel(R.drawable.tsoup,"Tomato Soup","20","fresh tomatoes with just the right balance of acidity and sweetness"));
        list.add(new MainModel(R.drawable.csoup,"Corn Soup","30","healthy soups containing veggies with loaded corn and fried noodle"));
        list.add(new MainModel(R.drawable.samosa,"Samosa Pav","15","samosas are stuffed in pav (bread rolls) along with tasty green chutney"));
        list.add(new MainModel(R.drawable.vadap,"Vada Pav","12"," deep fried potato dumpling placed inside a pav sliced almost in half through middle"));
        list.add(new MainModel(R.drawable.cbhatue,"Chole Bhature","25","combination of chana masala and bhatura/puri, a fried bread made from maida."));
        list.add(new MainModel(R.drawable.pbhaji,"Pav Bhaji","22"," a spiced mixture of mashed vegetables in a thick gravy served with bread."));
        list.add(new MainModel(R.drawable.jalebi,"Jalebi","20","made by deep-frying a maida batter in circular shapes,which are soaked in sugar syrup"));
        list.add(new MainModel(R.drawable.fafda,"Fafda","15"," snack made with gram flour, turmeric and carom seeds with fresh chutney"));


        MainAdapter adapter= new MainAdapter(list,this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }

}