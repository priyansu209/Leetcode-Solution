class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder xPart=new StringBuilder();
        StringBuilder yPart=new StringBuilder();

        StringBuilder remain=new StringBuilder();

        for(char ch: s.toCharArray()){
            if(ch==x)xPart.append(ch);
            else if(ch==y)yPart.append(ch);
            else{
                remain.append(ch);
            }
        }
        return yPart.toString()+remain.toString()+xPart.toString(); 
    }
}