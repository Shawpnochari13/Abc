package com.techjany.abcbuilders;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.techjany.abcbuilders.Retrofit.activity.Testimonials;

public class Navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    Button btnGallery,btnLocation,btnTestimonials,btnContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        btnGallery = (Button) findViewById(R.id.btnGallery);
        btnGallery.setOnClickListener(this);
        btnLocation = (Button) findViewById(R.id.btnLocation);
        btnLocation.setOnClickListener(this);
        btnTestimonials = (Button) findViewById(R.id.btnTestimonials);
        btnTestimonials.setOnClickListener(this);
        btnContact = (Button) findViewById(R.id.btnContact);
        btnContact.setOnClickListener(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.viewgallery) {
            Intent intent = new Intent(this,Gallery.class);
            startActivity(intent);
        } else if (id == R.id.ourlocations) {
            Intent intent = new Intent(this,Locations.class);
            startActivity(intent);
        } else if (id == R.id.testimonials) {
            Intent intent = new Intent(this,Testimonials.class);
            startActivity(intent);
        } else if (id == R.id.contactus) {
            Intent intent = new Intent(this,ContactUS.class);
            startActivity(intent);
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.btnGallery:
                Intent intent = new Intent(this,Gallery.class);
                startActivity(intent);
                break;

            case R.id.btnLocation:
                Intent intent2 = new Intent(this,Locations.class);
                startActivity(intent2);
                break;

            case R.id.btnTestimonials:
                Intent intent3 = new Intent(this,Testimonials.class);
                startActivity(intent3);
                break;

            case R.id.btnContact:
                Intent intent4 = new Intent(this,ContactUS.class);
                startActivity(intent4);
                break;

            default:
                break;
        }
    }
}
