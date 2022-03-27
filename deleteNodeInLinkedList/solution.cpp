#include <cstddef>
#include <iostream>
#include "solution.hpp"

void Solution::deleteNode(ListNode* node)
{

    node->val = node->next->val;
    node->next = node->next->next;
    
}

int main(int argc, char* argv[])
{
    Solution s = Solution();

    LinkedList myLL = LinkedList();
    
    myLL.push_back(4);
    myLL.push_back(5);
    myLL.push_back(1);
    myLL.push_back(9);

    std::cout << "Original Linked List:" << std::endl;

    myLL.PrintList();

    ListNode* five = myLL.GetNode(5);

    s.deleteNode(five);

    std::cout << "After Removing 5" << std::endl;

    myLL.PrintList();

}