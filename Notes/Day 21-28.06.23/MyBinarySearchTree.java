public class MyBinarySearchTree {

  public static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }
  }

  public static boolean search(Node root, Node nodeToBeSearched) {
    if (root == null) return false;
    if (root.data == nodeToBeSearched.data) {
      return true;
    }
    boolean result = false;

    if (root.data > nodeToBeSearched.data) result =
      search(root.left, nodeToBeSearched); else if (
      root.data < nodeToBeSearched.data
    ) result = search(root.right, nodeToBeSearched);

    return result;
  }

  public static Node insert(Node root, Node nodeToBeInserted) {
    if (root == null) {
      root = nodeToBeInserted;
      return root;
    }
    if (root.data > nodeToBeInserted.data) {
      if (root.left == null) root.left = nodeToBeInserted; else insert(
        root.left,
        nodeToBeInserted
      );
    } else if (root.data < nodeToBeInserted.data) if (
      root.right == null
    ) root.right = nodeToBeInserted; else insert(root.right, nodeToBeInserted);
    return root;
  }

  public static void inOrder(Node root) {
    if (root == null) return;
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }

  public static void main(String[] args) {
    // Create binary search tree
    Node rootNode = createBinarySearchTree();
    Node node55 = new Node(55);
    boolean result = search(rootNode, node55);
    System.out.println("Searching for node 55 : " + result);
    System.out.println("---------------------------");
    Node node13 = new Node(13);
    Node root = insert(rootNode, node13);
    System.out.println("Inorder traversal of binary tree after adding 13:");
    inOrder(root);
  }

  public static Node createBinarySearchTree() {
    Node rNode = new Node(40);
    Node node20 = new Node(20);
    Node node10 = new Node(10);
    Node node30 = new Node(30);
    Node node60 = new Node(60);
    Node node50 = new Node(50);
    Node node70 = new Node(70);
    Node node5 = new Node(5);
    Node node55 = new Node(55);

    insert(null, rNode);
    insert(rNode, node20);
    insert(rNode, node10);
    insert(rNode, node30);
    insert(rNode, node60);
    insert(rNode, node50);
    insert(rNode, node70);
    insert(rNode, node5);
    insert(rNode, node55);
    return rNode;
  }
}
