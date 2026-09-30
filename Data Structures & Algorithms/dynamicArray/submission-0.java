class DynamicArray {

    public int[] arr;
    public int size = 0;

    public DynamicArray(int capacity) {
        if(capacity > 0){
            arr = new int[capacity];
            return;
        }

        arr = new int[0];
        return;
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
        this.size++;
    }

    public int popback() {
        int currentSize = this.getSize();
        int pop = this.get((currentSize - 1));
        this.size--;

        return pop;
    }

    private void resize() {
        int[] old = arr;
        arr = new int[old.length * 2];

        for(int i = 0; i < old.length; i++){
            arr[i] = old[i];
        }
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return arr.length;
    }
}
