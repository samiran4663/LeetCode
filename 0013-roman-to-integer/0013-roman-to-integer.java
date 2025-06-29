class Solution {
    public int romanToInt(String str) {
        int num=0;
        int n=str.length();
        str=str.toLowerCase();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='i' && (i+1<n && str.charAt(i+1)=='v')){
                num+=4;
                i++;
            }
            else if(str.charAt(i)=='i' && (i+1<n && str.charAt(i+1)=='x')){
                num+=9;
                i++;
            }
            else if(str.charAt(i)=='x' && (i+1<n && str.charAt(i+1)=='l')){
                num+=40;
                i++;
            }
            else if(str.charAt(i)=='x' && (i+1<n && str.charAt(i+1)=='c')){
                num+=90;
                i++;
            }
            else if(str.charAt(i)=='c' && (i+1<n && str.charAt(i+1)=='d')){
                num+=400;
                i++;
            }
            else if(str.charAt(i)=='c' && (i+1<n && str.charAt(i+1)=='m')){
                num+=900;
                i++;
            }
            else{
                if(str.charAt(i)=='i') num+=1;
                else if(str.charAt(i)=='v') num+=5;
                else if(str.charAt(i)=='x') num+=10;
                else if(str.charAt(i)=='l') num+=50;
                else if(str.charAt(i)=='c') num+=100;
                else if(str.charAt(i)=='d') num+=500;
                else if(str.charAt(i)=='m') num+=1000;
            }
        }
        return num;
    }
}