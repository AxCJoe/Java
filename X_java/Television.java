public class Television {
    int channelNo;//メンバ変数
    String chname;
    void setChannel(int newChannelNo){
      //同じクラスの中で値を格納
      channelNo = newChannelNo;
      //「自分自身のクラス」にあるメンバ変数の正式な記述方法が下記ですが、this省略可です。
      //this.channelNo = newChannelNo; 
    }

    void setchname(String newChname)
    {
        chname = newChname;
    }
    void dispChannel(){
      System.out.println("現在のチャンネルは " + channelNo + " です," + "チャンネルの名前は："+chname);
    }
}
