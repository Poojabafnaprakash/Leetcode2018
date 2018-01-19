package LeetcodeEasy;

import java.util.HashMap;
import java.util.Map;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x) {
		val = x;
	}
}

public class TwoSum2 {
	public Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	public boolean result = false;
	
	public boolean findTarget(TreeNode root, int k) {
		
		int diff = k - root.val;
		
		if (root != null) {
			if (map.containsKey(diff)) {
				result = true;
				return result;
			} else {
				map.put(root.val, diff);
				if (root.left != null) {
					findTarget(root.left, k);
				}
				if (root.right != null) {
					findTarget(root.right, k);
				}
			}
		}
		return result;
	}
}
