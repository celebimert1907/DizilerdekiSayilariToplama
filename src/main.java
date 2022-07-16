public class main {
    public static void main(String[] args) {

        int[] list = {1,2,3,4};

        /*
        Sum numSum = new Sum();
        numSum.print(list);*/

        int sum = 0;
        for (int i : list){
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
