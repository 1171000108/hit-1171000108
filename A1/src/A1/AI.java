
/**
 * AI core codes
 * estimated value 1 bilion
 */

public class AI {

public static void doConversation(String str){
        str=str.replace("吗","");
        str=str.replace("?","!");
        str=str.replace("？","!");
        System.out.println(str);
      }

public static void TestAI(){
        doConversation("在吗？");
        doConversation("你好");
        doConversation("你能听懂汉语吗？");
        doConversation("真的吗？");
      }

public static void main(String[] args) {
        /*
           For test
         */
        TestAI();
      }
}
