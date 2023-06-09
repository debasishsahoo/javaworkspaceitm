package problams;

public class Equal_Matrices {

	public static void main(String[] args) {
		int rowCount1, colCount1, rowCount2, colCount2;
        boolean flag = true;

        //Input matrix m1
        int m1[][] = {
                {19, 8, 17},
                {6, 14, 16},
                {4, 15, 17}
        };

        //Input matrix m2
        int m2[][] = {
                {19, 8, 17},
                {6, 14, 16},
                {4, 15, 17}
        };

        // Finding row and column count for matrix m1
        rowCount1 = m1.length;
        colCount1 = m1[0].length;

        // Finding row and column count for matrix m2
        rowCount2 = m2.length;
        colCount2 = m2[0].length;

        //Checking if size of both the matrices m1 & m2are equal
        if(rowCount1 != rowCount2 || colCount1 != colCount2){
            System.out.println("Given matrices are not equal");
        }
        else {
            // Here we are matching each element of m1 & m2 if
            // any element doesn't match we are setting the flag to false
            for(int i = 0; i < rowCount1; i++){
                for(int j = 0; j < colCount1; j++){
                    if(m1[i][j] != m2[i][j]){
                        flag = false;
                        break;
                    }
                }
            }

            //If flag is not true it means the matrices are not equal
            if(flag)
                System.out.println("Given matrices are equal");
            else
                System.out.println("Given matrices are not equal");
        }

	}

}
