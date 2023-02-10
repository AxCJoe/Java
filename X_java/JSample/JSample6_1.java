package JSample;

public class JSample6_1
{
        public static void main(String[]args){

    int[][]myNumbers = {{1,2,3,4},{5,6,7}};
    //配列名.length で、縦方向の要素数を取得(今回は2)
        for(int i = 0;i< myNumbers.length;i++)
        {
        System.out.println("行ごとに繰り返し");
        for(int j = 0;j<myNumbers[i].length;++j)
         {
            //配列名[0].length で、横方向の要素数を取得(今回は4と3)
            System.out.println("列の要素数は" + myNumbers[i].length);
            System.out.println(myNumbers[i][j]);
         }
        }
    }
}    
