#pragma once

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;

    TreeNode();
    TreeNode(int x);
    TreeNode(int x, TreeNode *left, TreeNode *right);
    
    static void deleteTree(TreeNode* root);
};
