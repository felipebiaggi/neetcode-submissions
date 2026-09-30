class DynamicArray {

    int[] arr;
    int size;


    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(this.getSize() == this.getCapacity()){
            this.resize();
        }

        this.set(this.getSize(), n);
        size++;
    }

    public int popback() {
        size--;
        int pop = this.get(this.getSize());
        return pop;
    }

    private void resize() {
        int[] oldArray = this.arr;
        int capacity = this.getCapacity();
        this.arr = new int[capacity * 2];

        for(int i = 0; i < capacity; i++){
            this.arr[i] = oldArray[i];
        }
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.arr.length;
    }
}
