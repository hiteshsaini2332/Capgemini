package generics.warehousemanagement;

public class Test {
    static void main() {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Milk"));

        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics Items:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Items:");
        WarehouseUtils.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Items:");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
