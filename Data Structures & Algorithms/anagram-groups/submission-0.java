class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String s:strs){
            char [] ch=s.toCharArray();
            Arrays.sort(ch);
            String newS=new String(ch);
            mp.putIfAbsent(newS, new ArrayList<>());
            mp.get(newS).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
