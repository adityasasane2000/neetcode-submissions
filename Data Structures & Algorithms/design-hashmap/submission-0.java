class MyHashMap {

    class obj {
        int key;
        int val;

        public obj(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    ArrayList<obj> map;

    public MyHashMap() {
        map = new ArrayList<obj>();
    }
    
    public void put(int key, int value) {

        // int flag = 0;

        for(obj ele : map){
            if(ele.key == key){
                ele.val = value;
                return;
            }
        }

        map.add(new obj(key, value));
    }
    
    public int get(int key) {
        for(obj ele: map){
            if(ele.key == key){
                return ele.val;
            }
        }

        return -1;
    }
    
    public void remove(int key) {
        for(int i=0;i<map.size();i++){
            if(map.get(i).key == key){
                map.remove(i);
                break;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */