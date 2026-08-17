class Triplet{
    double root;
    int x,y;
    Triplet(double root, int x, int y){
        this.root = root;
        this.x = x;
        this.y = y;
    }
}
class TripletComparator implements Comparator<Triplet>{
    public int compare(Triplet a, Triplet b){
        if(a.root > b.root){
            return 1;
        }else if(a.root < b.root){
            return -1;
        }
        return 0;
    }
}
    class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<Triplet> queue = new PriorityQueue<Triplet>(new TripletComparator());

        for(int[] val : points){
            double dist = Math.sqrt(((-val[0]) * (-val[0])) + ((-val[1]) * (-val[1])));
            queue.add(new Triplet(dist, val[0], val[1]));
        }

        int[][] res = new int[k][2];
        int index = 0;
        while(k-- > 0){
            res[index][0] = queue.peek().x;
            res[index][1] = queue.peek().y;
            index++;
            queue.remove();
        }

        return res;
    }
}
