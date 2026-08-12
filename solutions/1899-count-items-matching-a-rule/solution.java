class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int row = 0;row < items.size();row++){
            if (ruleKey.equals("type")){
                if(items.get(row).get(0).equals(ruleValue)){
                    count++;
                }
            }else if (ruleKey.equals("color")){
                if(items.get(row).get(1).equals(ruleValue)){
                    count++;
                }
            }else if (ruleKey.equals("name")){
                if(items.get(row).get(2).equals(ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }
}
