class Solution {
    public String interpret(String command) {
        String temp = command.replace("()", "o");
        return temp.replace("(al)", "al");
    }
}