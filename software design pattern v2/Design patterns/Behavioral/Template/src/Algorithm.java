public abstract class Algorithm {
    protected int[] nums;
    public Algorithm(int[] nums) {
        this.nums = nums;
    }

    protected abstract void initialize();
    protected abstract void  sorting();
    protected abstract void showResult();


    public void sort() {
        initialize();
        sorting();
        showResult();
    }
}
