package com.example.dagger.dagger_objects

import android.util.Log
import javax.inject.Inject

/**
 * Created by FastShift, Inc., on 11/27/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
class DieselEngine @Inject constructor() : Engine {

    override fun start() {
        Log.e(TAG, "Diesel engine started")
    }

    companion object {
        private const val TAG: String = "Car"
    }

}