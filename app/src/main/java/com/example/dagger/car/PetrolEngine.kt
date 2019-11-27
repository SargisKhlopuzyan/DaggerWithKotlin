package com.example.dagger.car

import android.util.Log
import javax.inject.Inject

/**
 * Created by FastShift, Inc., on 11/27/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
class PetrolEngine @Inject constructor() : Engine {

    override fun start() {
        Log.e(TAG, "Petrol engine started")
    }

    companion object {
        private const val TAG: String = "Car"
    }
}