class Solution {
    public String sortVowels(String s) 
    {
        Map<Character,Integer> vowelsMap=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)    =='o' || s.charAt(i)=='u')
            {
                vowelsMap.put(s.charAt(i),vowelsMap.getOrDefault(s.charAt(i),0)+1);
            }
            
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(vowelsMap.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){

                public int compare(Map.Entry<Character, Integer> e1,
                       Map.Entry<Character, Integer> e2)
                       {
                        return e2.getValue().compareTo(e1.getValue());
                       }
        });
        Map<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> e : list) {
            sortedMap.put(e.getKey(), e.getValue());
        }
        List<Character> vowelsList=new ArrayList<>();
        for(Map.Entry<Character,Integer>mpp:sortedMap.entrySet())
        {
            char ch=mpp.getKey();
            int cnt=mpp.getValue();
            for(int i=1;i<=cnt;i++)
            {
                vowelsList.add(ch);
            }
        }
        int k=0;
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)    =='o' || s.charAt(i)=='u')
            {
                sb.setCharAt(i,vowelsList.get(k));
                k++;
            }
        }
        return sb.toString();
    }
}