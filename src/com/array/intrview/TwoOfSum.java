package com.array.intrview;

import java.util.HashMap;
import java.util.Map;

public class TwoOfSum {

    public int[] twoOfSum(int[] nums, int target)
    {
        // Arrasy to return the result
        int[] arr = new int[2];

        // map for number and index pair

        Map<Integer, Integer>
                map = new HashMap<Integer, Integer>();

        // Iterate through the array

        for (int i =0; i < nums.length; i++)
        {
            /* Check if the map has an element  which is equal to the diff betweent the tagget and current element*/

            Integer val = map.get(target - nums[i]);
            if(val == null)
            {
                /* no match found , add the current item
                * and index to map*/
                map.put(nums[i], i);
            }
            else {
                /* match found , update the index values*/
                arr[0] = val;
                arr[1] = i;
                break;
            }

        }
        return arr;

    }
}
