package com.codemix.hsc_ict;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import com.google.android.material.navigation.NavigationView;

import static android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;

public class welcome extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private Button knowledge;
    protected AdView mAdView;
    private Button mcqnew;


    private DrawerLayout Q;
    private NavigationView nv;
    ActionBarDrawerToggle toggle;


    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_welcome);


        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        this.Q = (DrawerLayout) this.findViewById(R.id.main_layout);
        toggle = new ActionBarDrawerToggle(this, Q, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        Q.addDrawerListener(toggle);
        toggle.syncState();
        nv = (NavigationView)findViewById(R.id.navigationid);
        nv.setNavigationItemSelectedListener(this);




        Button button = (Button) findViewById(R.id.knowledge);
        this.knowledge = button;
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                welcome.this.startActivity(new Intent(welcome.this, shortquestion.class));
            }
        });
        Button button2 = (Button) findViewById(R.id.mcqnew);
        this.mcqnew = button2;
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                welcome.this.startActivity(new Intent(welcome.this, mcqquestion.class));
            }
        });
        setTitle("এইচএসসি আইসিটি 2020 ");
        this.mAdView = (AdView) findViewById(R.id.adView);
        this.mAdView.loadAd(new Builder().build());
        this.mAdView.setAdListener(new AdListener() {
            public void onAdClicked() {
            }

            public void onAdClosed() {
            }

            public void onAdFailedToLoad(int i) {
            }

            public void onAdLeftApplication() {
            }

            public void onAdLoaded() {
            }

            public void onAdOpened() {
            }
        });
    }



    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(welcome.this);
        builder.setTitle("অনুগ্রহপূর্বক রেটিং দিয়ে উৎসাহ প্রদান করুন!");
        builder.setIcon(R.drawable.k);
        builder.setMessage("রেটিং দিন' বাটনে ক্লিক করে আপনার মূল্যবান মতামত ও ৫ স্টার রেটিং দিন। বের হতে চাইলে 'বের হন' বাটনে ক্লিক করুন!")
                .setPositiveButton("রেটিং দিন", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        String url = "https://play.google.com/store/apps/details?id=com.codemix.bangladada";
                        Intent up = new Intent(Intent.ACTION_VIEW);
                        up.setData(Uri.parse(url));
                        startActivity(up);
                    }
                })
                .setNeutralButton("আরো অ্যাপস", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        String url = "https://play.google.com/store/apps/developer?id=Code+Mix";
                        Intent up = new Intent(Intent.ACTION_VIEW);
                        up.setData(Uri.parse(url));
                        startActivity(up);
                    }
                })
                .setNegativeButton(" বের হন", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }


                });
        AlertDialog alert = builder.create();
        alert.show();

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.home) {
            Intent intent = new Intent(welcome.this, MainActivity.class);
            startActivity(intent);
        }

        String str = "https://www.facebook.com/codemix7";
        String str2 = "android.intent.action.VIEW";
        if (menuItem.getItemId() == R.id.facebook) {
            Intent intent = new Intent(str2);
            intent.setData(Uri.parse(str));
            startActivity(intent);
        }
        if (menuItem.getItemId() == R.id.rateid) {
            Intent intent2 = new Intent(str2);
            intent2.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.codemix.bangladada"));
            startActivity(intent2);
        }

        if (menuItem.getItemId() == R.id.moreappsmend) {
            Intent intent4 = new Intent(str2);
            intent4.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Code+Mix"));
            startActivity(intent4);
        }
        if (menuItem.getItemId() == R.id.contact) {
            AlertDialog.Builder builder = new AlertDialog.Builder(welcome.this);
            builder.setTitle("অনুগ্রহপূর্বক রেটিং দিয়ে উৎসাহ প্রদান করুন!");
            builder.setIcon(R.drawable.k);
            builder.setMessage("রেটিং দিন' বাটনে ক্লিক করে আপনার মূল্যবান মতামত ও ৫ স্টার রেটিং দিন। বের হতে চাইলে 'বের হন' বাটনে ক্লিক করুন!")
                    .setPositiveButton("রেটিং দিন", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            String url = "https://play.google.com/store/apps/details?id=com.codemix.bangladada";
                            Intent up = new Intent(Intent.ACTION_VIEW);
                            up.setData(Uri.parse(url));
                            startActivity(up);
                        }
                    })
                    .setNeutralButton("আরো অ্যাপস", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            String url = "https://play.google.com/store/apps/developer?id=Code+Mix";
                            Intent up = new Intent(Intent.ACTION_VIEW);
                            up.setData(Uri.parse(url));
                            startActivity(up);
                        }
                    })
                    .setNegativeButton(" বের হন", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }


                    });
            AlertDialog alert = builder.create();
            alert.show();
        }
        if (menuItem.getItemId() == R.id.gk) {
            Intent intent6 = new Intent(str2);
            intent6.setData(Uri.parse("https://play.google.com/store/apps/details?id=hreday.sagar.sokoldoronersms"));
            startActivity(intent6);
        }
        if (menuItem.getItemId() == R.id.EnglishSikun) {
            Intent intent7 = new Intent(str2);
            intent7.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.codemix.osudigas"));
            startActivity(intent7);
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.id_about:
                Intent i = new Intent(welcome.this, About.class);
                startActivity(i);

                break;
            case R.id.id_share:

                Intent s = new Intent(Intent.ACTION_SEND);
                s.setAction(Intent.ACTION_SEND);
                s.setType("text/plain");
                s.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.codemix.bangladada");

                startActivity(s);
                break;
            case R.id.id_update:
                String url = "https://play.google.com/store/apps/details?id=com.codemix.bangladada";
                Intent up = new Intent(Intent.ACTION_VIEW);
                up.setData(Uri.parse(url));
                startActivity(up);

                break;
        }


        if (toggle.onOptionsItemSelected(item))


            return true;
        return super.onOptionsItemSelected(item);


    }

}
