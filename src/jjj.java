import java.sql.SQLOutput;

public class jjj {
    public String remover(char a, String s) {
        char temp[] = s.toCharArray();
        int j=0,count =0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != a) {
                temp[j++] =temp[i];
            } else {
                count++;
            }
            while(count >0) {
                temp[j++] = '\0';
                count--;
            }
        }
        s = new String(temp);
        return s;
    }
    public static void main(String[] args) {
        // put your code here
        jjj ad = new jjj();
        System.out.println(ad.remover('e', "geeksforgeek"));
    }
}
