public class testbasics {
    public static void main(String[] args){
        basics basicsjava = new basics();

        System.out.println("--------------------");
        basicsjava.print1To255();

        System.out.println("--------------------");
        basicsjava.printOdd1To255();

        System.out.println("--------------------");
        int sum = basicsjava.sum1To255();
        System.out.println(sum);

        System.out.println("--------------------");
        basicsjava.iterateAnArray();

        System.out.println("--------------------");
        int[] findMaxArr = {-3,-5,-6,5,0,10,100,23,-5};
        int max = basicsjava.findMax(findMaxArr);
        System.out.println(max);

        System.out.println("---------------------");
        System.out.println(basicsjava.arrayOfOdd1To255().toString());
        
    }
}