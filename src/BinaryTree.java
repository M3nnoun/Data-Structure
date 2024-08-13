public class BinaryTree {
    static class Element {
        int data;
        Element leftChild;
        Element rightChild;

        Element(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public static Element createElement(int data) {
        return new Element(data);
    }

    public static void linkArbre(Element root, Element left, Element right) {
        root.leftChild = left;
        root.rightChild = right;
    }

    public static void prefixe(Element BT) {
        if (BT != null) {
            System.out.print(BT.data + " - ");
            prefixe(BT.leftChild);
            prefixe(BT.rightChild);
        }
    }

    public static void infixe(Element BT) {
        if (BT != null) {
            infixe(BT.leftChild);
            System.out.print(BT.data + " - ");
            infixe(BT.rightChild);
        }
    }

    public static void postfixe(Element BT) {
        if (BT != null) {
            postfixe(BT.leftChild);
            postfixe(BT.rightChild);
            System.out.print(BT.data + " - ");
        }
    }

    public static void insertElement(Element[] BST, int data) {
        Element newElement = new Element(data);
        if (BST[0] == null) {
            BST[0] = newElement;
        } else {
            Element position, ptr;
            ptr = BST[0];
            while (ptr != null) {
                position = ptr;
                if (data > ptr.data) {
                    if (ptr.rightChild == null) {
                        ptr.rightChild = newElement;
                        return;
                    }
                    ptr = ptr.rightChild;
                } else {
                    if (ptr.leftChild == null) {
                        ptr.leftChild = newElement;
                        return;
                    }
                    ptr = ptr.leftChild;
                }
            }
        }
    }

    public static void insertElementRecursive(Element[] BST, int data) {
        BST[0] = insertRecursive(BST[0], data);
    }

    private static Element insertRecursive(Element node, int data) {
        if (node == null) {
            return new Element(data);
        }
        if (data > node.data) {
            node.rightChild = insertRecursive(node.rightChild, data);
        } else {
            node.leftChild = insertRecursive(node.leftChild, data);
        }
        return node;
    }

    public static int elementCounter(Element BT) {
        if (BT == null)
            return 0;
        return elementCounter(BT.leftChild) + elementCounter(BT.rightChild) + 1;
    }

    public static void displayLeafs(Element BT) {
        if (BT != null) {
            if (BT.leftChild == null && BT.rightChild == null) {
                System.out.print(BT.data + " - ");
            } else {
                displayLeafs(BT.leftChild);
                displayLeafs(BT.rightChild);
            }
        }
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int heightArbre(Element BT) {
        if (BT == null)
            return 0;
        if (BT.leftChild == null && BT.rightChild == null)
            return 1;
        return 1 + max(heightArbre(BT.leftChild), heightArbre(BT.rightChild));
    }
}
