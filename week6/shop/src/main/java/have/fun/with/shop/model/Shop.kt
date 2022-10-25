data class Shop(
	val products: Collection<Product>,
	val categories: Collection<Category>,
	val brands: Collection<Brand>
)

data class Product(
	val id: Int,
	val title: String,
	val description: String,
	val categoryId: Int,
	val brandId: Int,
	val cost: Int
)

data class Category(
	val id: Int,
	val title: String	
)

data class Brand(
	val id: Int,
	val title: String	
)