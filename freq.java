public class freq
{
    public static void main(String[] args) {
        String s="aaabbcc";
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++)
        {
            if(freq[i]!=0){
            System.out.println((char)i+"------"+freq[i]);
            }
        }

    }
}