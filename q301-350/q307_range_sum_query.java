class NumArray {
    SegmentTree ans;

    class SegmentTree {
        int start, end;
        int sum;
        SegmentTree left, right;

        public SegmentTree (int start, int end, int sum) {
            this.start = start;
            this.end = end;
            this.sum = sum;
            this.left = null;
            this.right = null;
        }

    }

    public SegmentTree build(int start, int end, int[] nums) {
        SegmentTree res = new SegmentTree(start, end, 0);
        if (start == end) {
            res.sum = nums[start - 1];
            return res;
        }
        int middle = start + (end - start) / 2;
        res.left = build(start, middle, nums);
        res.right = build(middle + 1, end, nums);
        res.sum = res.left.sum + res.right.sum;
        return res;
    }

    public NumArray(int[] nums) {
        if (nums == null || nums.length == 0) return;
        ans = build(1, nums.length, nums);
    }

    public void update(SegmentTree res, int p, int val) {
        if (res.start == res.end) {
            res.sum = val;
            return;
        }
        int middle = res.start + (res.end - res.start) / 2;
        if (p <= middle) {
            update(res.left, p, val);
        } else {
            update(res.right, p, val);
        }
        res.sum = res.left.sum + res.right.sum;
    }

    public void update(int i, int val) {
        update(ans, i + 1, val);
    }

    public int query(SegmentTree res, int i, int j) {
        if (res == null) return 0;
        if (i <= res.start && j >= res.end) return res.sum;
        int middle = res.start + (res.end - res.start) / 2;
        int fff = 0;
        if (i <= middle) fff += query(res.left, i, j);
        if (j >= middle) fff += query(res.right, i, j);
        return fff;
    }


    public int sumRange(int i, int j) {
        return query(ans, i + 1, j + 1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */
