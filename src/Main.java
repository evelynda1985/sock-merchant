public class Main {

    public static int sockMerchant(int n, int[] ar){
        int counter = 0;
        int[] arCopy = ar;
        int tempSock1;
        int tempSock2;

        for(int index = 0; index < n; index++){
            tempSock1 = arCopy[index] ;
            for(int indexInterArray = index + 1; indexInterArray < n; indexInterArray++){
                tempSock2 = arCopy[indexInterArray];
                if(tempSock2 == tempSock1 & tempSock2 != -1 & tempSock1 != -1){
                    arCopy[indexInterArray] = -1;
                    arCopy[index] = -1;
                    tempSock1 = -1;
                    counter ++;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        int n = 9;
        int[] ar= new int[]{ 10, 20,20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(n, ar));
    }
}

