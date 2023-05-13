
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    Tree tree;
    @BeforeEach
    public void newMyTree(){
        File fileInput = new File("src/goods_in_the_store.csv");
        tree = new Tree().createTree(fileInput);
    }
    @Test
    void insertNodePlusSize1() {
        int before = tree.getSize();
        tree.insertNode(new Store());
        assertEquals(tree.getSize(),before + 1);
    }

    @Test
    void deleteNodereturn() {
        Store store = Store.createStoreFromString(2, 2, "banana","Yellow Bananas", 30, 50, "kg");
        int before = tree.getSize();
        tree.deleteNode(store);
        int after = tree.getSize();
        assertEquals(before,after + 1);
    }
}s