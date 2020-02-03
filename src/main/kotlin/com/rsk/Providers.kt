package com.rsk

import java.security.Provider
import java.security.Security

class Providers {

//  method doesn't use any instance data so should probably be static
//  Kotlin doesn't have static, so we use companion objects
    fun getProviders() : List<Provider> {
        val providers = Security.getProviders()
        val listOfProviders: List<Provider> = providers.asList()

        return listOfProviders
    }

//  companion objects are used instead of static methods
    companion object{
//      can ave same name as another method from the class
        fun getProviders() : List<Provider> {
            val providers = Security.getProviders()
            val listOfProviders: List<Provider> = providers.asList()

            return listOfProviders
        }
    }
}