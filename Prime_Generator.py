
class Solution:        
    def primeRange(self,M,N):
        for i in range(M, N+1):
            for x in range(2, i):
                if (i % x == 0):
                    break
            else:
                print(i, end=" ")


import math

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        M = int(input())
        N = int(input())
        ob=Solution()
        ob.primeRange(M,N)