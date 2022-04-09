from typing import Optional, List

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        if not root:
            return []

        result = [ str(root.val)+"->" + path for path in self.binaryTreePaths(root.left)]
        result += [ str(root.val)+"->" + path for path in self.binaryTreePaths(root.right)]
        return result or [str(root.val)]  # if empty return leaf itself
        

if __name__ == "__main__":
    s = Solution()
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.right = TreeNode(5)
    print(s.binaryTreePaths(root))
