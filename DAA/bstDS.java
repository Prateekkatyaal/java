package DAA;

public class bstDS{

    class Node{
        int key;
        Node right, left;

        public Node(int key){
            this.key = key;
            right = left = null;
        }
    }

    Node root;

    bstDS(){
        root = null;
    }

    void insert(int key){
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }

        if(key < root.key) root.left = insertRec(root.left, key);
        else if(key > root.key) root.right = insertRec(root.right, key);

        return root;

    }

    void inorder(){
        inorderRec(root);
    }

    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    Node search(Node root, int key){
        if(root == null || key == root.key) return root;

        if(key < root.key) return search(root.left, key);

        return search(root.right, key);

    }

    void delete(int key){
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key){
        if(root == null) return root;

        if(key < root.key) root.left = deleteRec(root.left, key);
        else if(key > root.key) root.right = deleteRec(root.right, key);
        
        else{
            if(root.left == null) return root.left;
            else if(root.right == null) return root.right;

            root.key = minKey(root.right);
            root.right = deleteRec(root.right, key);

        }
        return root;
    }

    int minKey(Node root){
        int mink = root.key;
        while(root != null){
            mink = root.left.key;
            root = root.left;
        }
        return mink;
    }
    boolean isBalanced(Node root){
        int lh; int rh;

        if(root == null) return true;

        lh = height(root.left);
        rh = height(root.right);

        if(Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }

        return false;
    }

    int height(Node root){
        if(root == null) return 0;

        return 1 +  Math.max(height(root.left), height(root.right));
        
    }
    public static void main(String[] args) {
        bstDS tree = new bstDS();

        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 

        tree.inorder();

    }
}