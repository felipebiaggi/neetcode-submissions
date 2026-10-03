class DynamicArray {

    int size = 0;
    int[] arr;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(this.getSize() == this.getCapacity()){
            this.resize();
        }

        this.arr[this.size] = n;
        this.size++;
    }

    public int popback() {
        this.size--;
        int num = this.arr[this.size];
        return num;
    }

    private void resize() {
        int[] oldArr = this.arr;
        this.arr = new int[oldArr.length * 2];

        for(int i = 0; i < oldArr.length; i++){
            this.arr[i] = oldArr[i];
        }
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return arr.length;
    }
}
