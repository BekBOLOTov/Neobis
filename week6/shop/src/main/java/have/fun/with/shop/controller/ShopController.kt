package have.`fun`.with.shop.controller

import Brand
import Category
import Product
import Shop
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ShopController {

    @GetMapping
    fun getShop(): Shop {
        return Shop(
            getProducts(),
            getCategories(),
            getBrands()
        )
    }

    @GetMapping("/products")
    fun getProducts(): Collection<Product> {
        return listOf(
            Product(0, "some product", "all you need", 0, 0, 15)
        )
    }

    @GetMapping("/brands")
    fun getBrands(): Collection<Brand> {
        return listOf(
            Brand(0, "adidas")
        )
    }

    @GetMapping("/category")
    fun getCategories(): Collection<Category> {
        return listOf(
            Category(
                0,
                "shoes"
            )
        )
    }

}