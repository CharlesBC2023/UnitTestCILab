import java.util.ArrayList;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        ArrayList<Character> charHolder = new ArrayList<>();
        int count = 0;
        for (char c: myString.toCharArray())
        {
            if(Character.isUpperCase(c)){
                count++;
            }
            charHolder.add(c);
        }
        if(count==0){
            return true;
        }else if(count == myString.length()){
            return true;
        }else if(Character.isUpperCase(charHolder.get(0)) && count == 1){
            return true;
        }

        return false;
    }

}

