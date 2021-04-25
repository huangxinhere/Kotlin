class CountryApp {
    fun filterCountries(
        countries: List<Country>,
        test:(Country) -> Boolean): List<Country>//增加了一个函数类型的参数test————解决类型
        //参数类型 -> 返回类型
    {
        val res = mutableListOf<Country>()
        for (c in countries){
            if (test(c)){//直接调用test来筛选
                res.add(c)
            }
        }
        return res
    }

    //将此方法弄成filterCountry的参数————类型？引用？
    class FindCountry {
        fun isBigEuropeanCountry(country: Country): Boolean{
            return country.continent == "EU" && country.population >10000
        }

    }

}

fun main(args : Array<String>){
    val countryApp = CountryApp()
    val findCountry = CountryApp.FindCountry()
    val countries = listOf<Country>()//空
    countryApp.filterCountries(countries ,findCountry::isBigEuropeanCountry)
    //或者匿名函数，没有函数名称
    countryApp.filterCountries(countries,fun(country: Country): Boolean{
        return country.continent == "EU" && country.population > 10000
    })
    //Lambada:推导类型，只要一个代表变量的country；return省略，返回的是有值的表达式；->连接参数和返回值
    countryApp.filterCountries(countries) { country ->
        country.continent == "EU" && country.population > 10000
    }
}

data class Country(
    val name: String,
    val continent: String,
    val population: Int
)
