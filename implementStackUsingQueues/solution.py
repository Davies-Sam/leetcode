from collections import deque

class MyStack:
    def __init__(self):
        self.q = deque()
        self.temp = deque()
        
    def push(self, x: int) -> None:
        self.temp.append(x)
        while self.q:
            self.temp.append(self.pop())
        self.q, self.temp = self.temp, self.q

    def pop(self) -> int:
        return self.q.popleft()

    def top(self) -> int:
        return self.q[0]
    
    def empty(self) -> bool:
        return not self.q


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()

if __name__ == "__main__":
    obj = MyStack()
    obj.push(1)
    obj.push(2)
    obj.top()
    obj.pop()
    print(obj.empty())