#include <iostream>
#include "solution.hpp"

int main(int argc, char* argv[])
{

    // Create a complete binary tree
    TreeNode* root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->left->left = new TreeNode(4);
    root->left->right = new TreeNode(5);
    // root->right->left = new TreeNode(6);

    // Create a solution instance
    Solution s;
    
    // Count the nodes
    int count = s.countNodes(root);

    // Print the result
    std::cout << "Number of nodes in the tree: " << count << std::endl;

    // Clean up memory
    TreeNode::deleteTree(root);
}