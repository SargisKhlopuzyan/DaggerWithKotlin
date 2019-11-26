package com.example.dagger.component

import com.example.dagger.dagger_objects.Car
import dagger.Component

/**
 * Created by FastShift, Inc., on 11/26/2019.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
@Component
/**(modules = [CarModule::class])*/
interface CarComponent {
    fun getCar(): Car
}