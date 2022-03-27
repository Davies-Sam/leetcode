from typing import Optional

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return None
        root.left, root.right = root.right, root.left
        self.invertTree(root.left)
        self.invertTree(root.right)
        return root
    
    def preOrderTraversal(self, root):
        if root:
            print(root.val)
            self.preOrderTraversal(root.left)
            self.preOrderTraversal(root.right)
    

if __name__ == "__main__":
    s = Solution()
    root = TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)),TreeNode(7, TreeNode(6), TreeNode(9)))

    print("Original Tree:")
    s.preOrderTraversal(root)

    s.invertTree(root)

    print("Inverted Tree:")
    s.preOrderTraversal(root)