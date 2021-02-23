package com.example.getdistance

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.SphericalUtil

class MainActivity : AppCompatActivity() {
    var sydney: LatLng = LatLng((-34).toDouble(), 151.0)
    var Brisbane: LatLng = LatLng(-27.470125, 153.021072)
    var distance: Double? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        distance = SphericalUtil.computeDistanceBetween(sydney, Brisbane)
///aa
        Toast.makeText(this, "Distance between Sydney and Brisbane is \n " + String.format("%.2f", distance!! / 1000) + "km", Toast.LENGTH_SHORT).show();
    }
}