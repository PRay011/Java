package 第四题;

public class Fourth {
    public static void main(String[] args) {
        int[] Nums = new int[50];
        int i=100;
        int j=0;//用于数组的录入，后续可做为for循环的上限，但其实可以用Nums.lenth
        while(100<=i&&i<=200)
        {
            if(i%5==0&&i%6==0)
            {

            }
            else if(i%5==0||i%6==0)
            {
                j++;
                Nums[j]=i;
            }
            else
            {
                //到底要不要else呢
            }
            i++;
        }
        for (int k = 1; k < j+1; k++)
        {
            System.out.print(Nums[k] + " ");
            if(k%10==0)
            {
                System.out.println();
            }
        }

    }
}
