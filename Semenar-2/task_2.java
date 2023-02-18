

public class task_2 {
    public static void main(String[] args) {
        String str = "aaaaabbbbbfggg ";
        System.out.println(getCompressedString(str));
    }

    private static String getCompressedString(String s){
        StringBuilder sb = new StringBuilder();


        char[] arr = s.toCharArray();
        int count = 1;
        for (int i=1; i<arr.length; i++){
            if (arr[i]==arr[i-1]){
                count++;
            }
            else {
                sb.append(arr[i-1]).append(count);
                count=1;
            }

        }
        return sb.toString();
    }
}
