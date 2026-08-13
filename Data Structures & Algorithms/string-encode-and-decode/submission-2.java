class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodeStr = new StringBuilder();
        int keyMaker = 1000;

        if(strs.size() == 0) {
            return("-2");
        }

        for(int i = 0; i < strs.size(); i++) {
            String str = strs.get(i);
            if(str.equals("")) {
                encodeStr.append("-1");
            } else {
            char[] charList = str.toCharArray();

            for(int j = 0; j < charList.length; j++) {
                char ch = charList[j];
                int chNum = (int) ch;
                int key = chNum + keyMaker;
                encodeStr.append(Integer.toString(key));
                if(j < charList.length - 1){
                    encodeStr.append(",");
                }
            }
            }

            if(i < strs.size() - 1) {
                encodeStr.append(" ");
            }
        }
        return (encodeStr.toString());
    }

    public List<String> decode(String str) {
        List<String> decodeList = new ArrayList<>();
        int keyParser = 1000;

        if(str.equals("-2")) {
            return decodeList;
        }
        String[] strList = str.split("\\s+");

        for(String s : strList) {
            StringBuilder decodeStr = new StringBuilder();
            if(s.equals("-1")) {
                decodeList.add("");
            } else {
            String[] sList = s.split(",");
            for(String ch : sList) {
                int key = Integer.parseInt(ch);
                int parsedKey = key - keyParser;
                char asciiChar = (char) parsedKey;

                decodeStr.append(asciiChar);
            }
            
            decodeList.add(decodeStr.toString());
            }
        }

        return decodeList;
    }
}
