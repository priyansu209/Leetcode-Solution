class Solution {
    List<String> ans=new ArrayList<>();

    public void Combo(String digits, int n, int i, Map<Character, String> mp, StringBuilder temp){
        if(i==n){
           ans.add(temp.toString());
           return;
        }

        String choice=mp.get(digits.charAt(i));

        for(int j=0;j<choice.length();j++){
            temp.append(choice.charAt(j));
            Combo(digits,n,i+1,mp,temp);
            temp.deleteCharAt(temp.length()-1);
        }
        return ;
    }


    public List<String> letterCombinations(String digits) {
        Map<Character, String> mp= new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");

        int n=digits.length();
        StringBuilder temp=new StringBuilder();
        Combo(digits,n,0,mp,temp);

        return ans; 
    }
}



