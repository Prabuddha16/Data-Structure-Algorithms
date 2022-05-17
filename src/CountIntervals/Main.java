package CountIntervals;

class Node{
    int val;
    boolean lazy;
    Node left;
    Node right;
    int tl,tr;
    Node(int l, int r){
        val = 0;
        lazy = false;
        left = null;
        right = null;
        tl = l;
        tr = r;
    }

    void push(){
        int tm = (this.tl + this.tr)/2;
        if(this.left == null || this.right == null){
            this.left = new Node(this.tl,tm);
            this.right = new Node(tm+1,this.tr);
        }

        if(this.lazy){
            this.left.lazy = true;
            this.right.lazy = true;
            this.left.val = tm - this.tl + 1;
            this.right.val = this.tr - (tm+1) + 1;
            this.lazy = false;
        }
    }

    int query(int l, int r){
        if(l>r || r<this.tl || l>this.tr) return 0;
        if( l<= this.tl && r>= this.tr) return this.val;
        this.push();
        int ans = 0;
        if(this.left != null) ans += this.left.query(l,r);
        if(this.right != null) ans += this.right.query(l,r);
        return ans;
    }

    void update(int l, int r){
        if(l>r || r<this.tl || l>this.tr) return;
        if( l<= this.tl && r>= this.tr){
            this.val = this.tr-this.tl+1;
            this.lazy = true;
            return;
        }
        this.push();
        if(this.left != null)
        this.left.update(l,r);
        if(this.right != null)
        this.right.update(l,r);
        this.val = 0;
        if(this.left != null) this.val += this.left.val;
        if(this.right != null) this.val += this.right.val;
    }
};

class CountIntervals {
    Node root;
    CountIntervals() {
        root = new Node(1,1000000000);
    }

    void add(int left, int right) {
        root.update(left,right);
    }

    int count() {
        return root.query(1,1000000000);
    }
}