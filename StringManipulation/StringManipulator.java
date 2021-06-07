public class StringManipulator {
    public String trimAndConcat(String str1, String str2){
        String string1 = str1.trim();
        String string2 = str2.trim();
        String string3 = string1.concat(string2);
        return string3;
    }

    public Integer getIndexOrNull(String str1, char i){
        int a = str1.indexOf(i);
        return a;
    }

    public Integer getIndexOrNull(String str1, String str2 ){
        int a = str2.indexOf(str1);
        return a;
    }

    
    public String concatSubstring(String str1, int num1, int num2, String str2) {
        int j = num1;
        String strResult = "";
        for(int i = j; i < num2; i++){
            char a = str1.charAt(i);
            strResult += a;
        }
        String str = strResult.concat(str2);
        return str;
    }
}
