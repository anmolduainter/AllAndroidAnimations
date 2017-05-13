package com.example.joginderpal.allandroidanimations;

import android.animation.Animator;
import android.graphics.Color;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.transition.TransitionManager;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ImageView im;
    AppBarLayout appBarLayout;
    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar toolbar;
    boolean loading_anim=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= (Toolbar) findViewById(R.id.tooolbar);
        appBarLayout= (AppBarLayout) findViewById(R.id.appbar_main);
        collapsingToolbarLayout= (CollapsingToolbarLayout) findViewById(R.id.collapsinggToolbar);
        setSupportActionBar(toolbar);
        im= (ImageView) findViewById(R.id.image_collapsing);
        Glide.with(MainActivity.this).load(R.drawable.photo).into(im);

        rv= (RecyclerView) findViewById(R.id.recycler_view);
        rv.addItemDecoration(new com.example.joginderpal.allandroidanimations.DividerItemDecoration(ContextCompat.getDrawable(getApplicationContext(),
                R.drawable.item_decorator)));
        layoutManager=new LinearLayoutManager(MainActivity.this);
        rv.setLayoutManager(layoutManager);
        adapter=new RecyclerAdapter(MainActivity.this,MainActivity.this);
        rv.setAdapter(adapter);

        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {

            int scroll=-1;
            int a=0;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {


               if (scroll==-1){
                   scroll=appBarLayout.getTotalScrollRange();
               }

               if (verticalOffset * -1 >= scroll-150 ){
                   collapsingToolbarLayout.setTitle("Animations");
                   collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);

               }
                else if (loading_anim){

                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                        //  Animator anim= ViewAnimationUtils.createCircularReveal(im,(im.getRight()),im.getTop(),0,Math.max(im.getWidth(),im.getHeight()));
                        Animator anim= ViewAnimationUtils.createCircularReveal(appBarLayout,(appBarLayout.getRight()),appBarLayout.getTop(),0,Math.max(appBarLayout.getWidth(),appBarLayout.getHeight()));
                        anim.start();
                    }
                    loading_anim=false;

                }
              else{
                   collapsingToolbarLayout.setTitle(" ");

               }


            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_search,menu);
        MenuItem search=menu.findItem(R.id.action_search);
        SearchView searchView= (SearchView) search.getActionView();
        searchView.setQueryHint("Search the Animations");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.action_search:
                appBarLayout.setExpanded(false);
                TransitionManager.beginDelayedTransition((ViewGroup)findViewById(R.id.tooolbar));
                MenuItemCompat.expandActionView(item);
                return true;

        }


        return super.onOptionsItemSelected(item);
    }
}
