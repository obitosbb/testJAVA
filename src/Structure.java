

/**
 * @author: wbb
 * @date 2021/11/12 2:21 下午
 */
public class Structure {

    static int arr[][] = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};

    // 二维数组中查找
    private static Boolean findNumberInArr(int arr[][], int rows, int columns, int number){

        if (null != arr && rows > 0 && columns > 0){
            int row = 0;
            int column = columns -1;
            while(row < rows && column >= 0){
                if(arr[row][column] == number){
                    return true;
                } else if(arr[row][column] > number){
                    column --;
                } else{
                    row ++;
                }
            }
        }

        return false;
    }

    static char[] string = {'w','e',' ','a','r','e',' ','h','a','p','p','y'};
    static char[] chars = {'2','0','%'};

    private static char[] replaceSpaces(char[] string, char[] chars){

        int stringSize = 0;
        int index = 0;

        while (string.length >= index){
            stringSize++;
            if(' ' == string[index]){
                stringSize +=2;
            }
        }
        System.out.println(stringSize);
        return string;
    }

    public static void main(String[] args) {

        //System.out.println(findNumberInArr(arr, 4,4,0));

        System.out.println(replaceSpaces(string, chars));
    }
}
