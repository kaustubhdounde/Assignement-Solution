public class RomanToIntegerConverter {
    public static Integer romanToInteger(String roman) {
        if (roman == null || roman.length() == 0) {
            return 0;
        }
        
        Map<String, Integer> romanValues = new Map<String, Integer>{
            'I' => 1,
            'V' => 5,
            'X' => 10,
            'L' => 50,
            'C' => 100,
            'D' => 500,
            'M' => 1000
        };
        
        Integer result = 0;
        Integer prevValue = 0;
        
        for (Integer i = roman.length() - 1; i >= 0; i--) {
            String currentSymbol = roman.substring(i, i + 1);
            Integer currentValue = romanValues.get(currentSymbol);
            
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            
            prevValue = currentValue;
        }
        
        return result;
    }
}
