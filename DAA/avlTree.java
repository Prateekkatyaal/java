package DAA;

public class avlTree {
    
    class Node{
        int key, height;
        Node left, right;

        Node(int key){
            this.key = key;
            left = right = null;
            height = 1;
        }
    }

    Node root;

        avlTree(){
            root = null;
        }

        int height(Node root){
            if(root == null) return 0;

            return root.height;
        }

        Node rightRotateNode(Node y){
            Node x = y.left;
            Node T2 = x.right;

            x.right = y;
            y.left = T2;

            y.height = Math.max(height(y.left), height(y.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;

            return x;

        }

        Node leftRotateNode(Node x){
            Node y = x.right;
            Node T2 = y.left;

            y.left = x;
            x.right = T2;

            y.height = Math.max(height(y.left), height(y.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;

            return y;
        }

        int getBalance(Node root){
            if(root == null) return 0;

            return height(root.left) - height(root.right);

        }

        Node insertTree(Node root, int key){
            if(root == null) return new Node(key);

            if(key < root.key) root.left = insertTree(root.left, key);
            else if(key > root.key) root.right = insertTree(root.right, key);
            else return root;

            root.height =  1 + Math.max(height(root.left), height(root.right));

            int balance = getBalance(root);

            if(balance > 1 && key < root.left.key) return rightRotateNode(root);

            if(balance < -1 && key > root.right.key) return leftRotateNode(root);

            if(balance > 1 && key > root.left.key){
                root.left = leftRotateNode(root.left);
                return rightRotateNode(root);
            }

            if(balance < -1 && key < root.right.key){
                root.right = rightRotateNode(root.right);
                return leftRotateNode(root);
            }

            return root;

        }

        void insert(int key){
            root = insertTree(root, key);
        }

        void preorder(Node root){
            if(root != null){
                System.out.print(root.key + " ");
                preorder(root.left);
                preorder(root.right);
            }
        }

        void delete(int key){
            root = deleteRec(root, key);
        }

        Node minValNode(Node root){
            Node current = root;
            while(current != null) current = current.left;
            return current;
        }

        Node deleteRec(Node root, int key){
            if(root == null) return root;

            if(key < root.key) root.left = deleteRec(root.left, key);
            else if(key > root.key) root.right = deleteRec(root.right, key);

            else{
                if(root.left == null || root.right == null){
                    Node temp = null;
                    if(temp == root.left){
                        temp = root.right;
                    }else{
                        temp = root.left;
                    }

                    if(temp == null){
                        temp = root;
                        root = null;
                    }else{
                        root = temp;
                    }
                }else{
                    Node temp = minValNode(root.right);
                    root.key = temp.key;
                    root.right = deleteRec(root.right, temp.key);
                }
            }
            if(root == null) return root;

            root.height = Math.max(height(root.left), height(root.right)) + 1;

            int balance = getBalance(root);

            if(balance > 1 && getBalance(root.left) >= 0) return rightRotateNode(root);

            if(balance > 1 && getBalance(root.left) < 0){
                root.left = leftRotateNode(root.left);
                return rightRotateNode(root);
            }

            if(balance < -1 && getBalance(root.right) <= 0) return leftRotateNode(root);
            
            if(balance < -1 && getBalance(root.right) > 0){
                root.right = rightRotateNode(root.left);
                return leftRotateNode(root);
            }

            return root;
        }
    public static void main(String[] args) {
        avlTree tree = new avlTree();

        tree.insert(10); 
        tree.insert(20); 
        tree.insert(30); 
        tree.insert(40); 
        tree.insert(50); 
        tree.insert(25);

        tree.preorder(tree.root);
    }
}
