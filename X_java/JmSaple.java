public class JmSaple {

    int memberVar = 10;//メンバ変数memberVarを定義

    void methodA()
    {

        int localVarA = 20;//ローカル変数localVarAを定義
        //メンバ変数なので他のmethodAから参照可能
        System.out.println("メンバ変数(memberVar):"+this.memberVar);
        //methodA内に定義したローカル変数なのでmethodAから参照可能
        System.out.println("ローカル変数(localVarA):"+ localVarA);
        //methodA内に定義したローカル変数ではないのでmethodAから参照不可
        //System.out.println("ローカル変数(localVarB)：" + localVarB);
    }

    void methodB()
    {
        int localVarB = 20;//ローカル変数localVarBを定義
    }
    
}
