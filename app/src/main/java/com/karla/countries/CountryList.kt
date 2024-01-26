package com.karla.countries

class CountryList {


    fun getCountry(): ArrayList<Country> {

        val listaPaises = ArrayList<Country>()
        listaPaises.add(Country("Estados Unidos", "37.7749", "-122.4194"))
        listaPaises.add(Country("Brasil", "-14.2350", "-51.9253"))
        listaPaises.add(Country("India", "20.5937", "78.9629"))
        return listaPaises
    }



}

