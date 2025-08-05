class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int count = f.length;
        List<Integer> list1 = new ArrayList<>();
        for(int num:f)
        list1.add(num);
        List<Integer> list2 = new ArrayList<>();
        for(int num:b)
        list2.add(num);

        for(int i=0;i<list1.size();i++) {
            // if(list1.get(i)<list2.get(i)) {
            //     count-=list1.get(i);
            //     list2.remove(i);
            //     break;
            // }
            // else if(list1.get(i)==list2.get(i)) {
            //     count-=list1.get(i);
            //     list2.remove(i);
            //     break;
            // }
            // else
            // continue;
            for(int j=0;j<list2.size();j++) {
                if(list2.get(j)>=list1.get(i)) {
                    count--;
                    list2.remove(j);
                    break;
                }
            }
        }
        return count;
    }
}