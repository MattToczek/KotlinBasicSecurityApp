import com.rsk.Providers
import java.security.Security.getProviders

fun main(args: Array<String>) {

//  using companion object inside rsk.Providers class (same as static method in Java)
    val allProviders = Providers.getProviders()

    val it = allProviders.iterator()

//  .hasNext() is Java usually
    while(it.hasNext()){
        val provider = it.next()
        println(provider.name)

//      .forEach() is idiomatic use of Kotlin syntax
        provider.forEach{key, value -> println("\t$key: $value")}
    }

}

fun listProvidersInstance() {
    //  no 'new' keyword needed in kotlin
    val providers = Providers()
    val allProviders = providers.getProviders()

    val it = allProviders.iterator()

//  .hasNext() is Java usually
    while(it.hasNext()){
        val provider = it.next()
        println(provider.name)

//      .forEach() is idiomatic use of Kotlin syntax
        provider.forEach{key, value -> println("\t$key: $value")}
    }
}

fun listProviders(){
    val providers = getProviders()

    val it = providers.iterator()

//  .hasNext() is Java usually
    while(it.hasNext()){
        val provider = it.next()
        println(provider.name)

//      .forEach() is idiomatic use of Kotlin syntax
        provider.forEach{key, value -> println("\t$key: $value")}
    }
}