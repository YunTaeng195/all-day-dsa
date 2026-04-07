
def solution(n):
    answer = []
    
    def hanoi(n,before,tmp,after):
        if n==1:
            answer.append([before,after])
        else:
            hanoi(n-1,before,after,tmp)
            answer.append([before,after])
            hanoi(n-1,tmp,before,after)
    
    hanoi(n,1,2,3)
    return answer