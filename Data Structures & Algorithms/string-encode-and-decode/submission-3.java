class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodeStr = new StringBuilder();
        for(String str : strs) {
            encodeStr.append(str.length()).append('#').append(str);
        }
        return(encodeStr.toString()); 
    }

    public List<String> decode(String str) {
        List<String> decodeList = new ArrayList<>();
        if(str == null || str.isEmpty()) return decodeList;

        int i = 0;
        while(i < str.length()){
            int hashIdx = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, hashIdx));

            i = hashIdx + 1;
            String s = str.substring(i, i + length);
            decodeList.add(s);

            i += length;
        }
        return(decodeList);
    }
}
