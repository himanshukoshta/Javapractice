public class D2array {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < arr.length; i++)
        {
            for(int j=0;j< arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class aer{
    public static void main(String[] args) {
        int sum=0;
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int u=0;u< arr1.length;u++)
        {
            for (int o=0;o< arr1.length;o++)
            {
                sum+=arr1[u][o];
            }
        }
        System.out.println(sum);
    }
}

class re{
    public static void main(String[] args) {
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int q=0;q< arr2.length;q++){
            int rowsum=0;
            for (int w=0;w< arr2.length;w++)
            {
                rowsum+=arr2[q][w];
            }
            System.out.println(rowsum);
        }
    }
}

class er{
    public static void main(String[] args) {
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int e=0;e< arr3[0].length;e++){
            int colsum=0;
            for (int r=0;r< arr3.length;r++)
            {
                colsum+=arr3[r][e];
            }
            System.out.println(colsum);
        }
    }
}

class qw{
    public static void main(String[] args) {
        int[][] arr4 = {
                {1, 2, 3},
                {4, 55, 6},
                {7, 8, 9}
        };
        int max=arr4[0][0];
        for (int t=0;t<arr4.length;t++){
            for (int y=0;y< arr4.length;y++){
                if(arr4[t][y]>max){
                    max=arr4[t][y];
                }
            }
        }
        System.out.println(max);
    }
}

class ws{
    public static void main(String[] args) {
        int[][] arr5 = {
                {1, 2, 3},
                {4, 55, 6},
                {7, 8, 9}
        };
        int min= arr5[0][0];
        for (int u=0;u< arr5.length;u++)
        {
            for (int o=0;o< arr5.length;o++)
            {
                if (arr5[u][o]<min)
                {
                    min=arr5[u][o];
                }
            }
        }
        System.out.println(min);
    }
}