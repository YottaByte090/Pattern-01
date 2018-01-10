# Pattern 01 (한국어)
> 그냥 평범한 패턴.

**경고 : 소스가 엉망입니다! 알아서 해독하길.**  
## 이건 무엇인가요?
제가 5살이였을 때, 머릿속으로 한 패턴을 구상했습니다.  
그 패턴을 출력하는 프로그램을 한번 만들어 봤습니다.  
제가 구상한 패턴은 다음과 같습니다.  

1. 문자 2개를 생각합니다. 처음으로 생각한 문자를 A, 두번째로 생각한 문자를 B라고 가정하겠습니다.
2. 처음 생각한 문자와 두번째로 생각한 문자를 적습니다. (AB)
3. 방금 만들어진 문자열을 반전합니다. A는 B로, B는 A로 바꿉니다. (BA)
4. 2에서 만든 문자열의 뒤에 3에서 만든 문자열을 붙입니다. (ABBA)
5. 4에서 만든 문자열을 반전합니다. (BAAB)
6. 4에서 만든 문자열의 뒤에 5에서 만든 문자열을 붙입니다. (ABBABAAB)

## 문제 해결
1. Q : 값이 출력되지 않습니다. 어떻게 해결하나요?  
A : 12회 이상 반복하면 값이 출력되지 않는 문제가 있습니다. 고치는법 모릅니다.

2. Q : 'Something went wrong. (1)'이 출력됐습니다. 어떻게 해결하나요?  
A : getInput()함수 쪽에서 문제가 발생했습니다. 직접 고쳐서 쓰세요.

3. Q : 'Something went wrong. (2)'이 출력됐습니다. 어떻게 해결하나요?  
A : 음... 왜 이게 출력되는지 저도 모르겠습니다.

# Pattern 01 (English)
> Just a pattern.

**Warning : The source is a mess! Be careful.  
Warning : Sorry for my English.**
## What is it?
When I was 5 years old, I thought about this pattern.  
I made this program that prints the pattern
1. Remember the two letters. The first one is A, and the second one is B.
2. Write A and B. (AB)
3. Change A to B and B to A. (BA)
4. Attach the string created in 3 after the string created in 2. (ABBA)
5. Change A to B and B to A. (BAAB)
6. Attach the string created in 5 after the string created in 4. (ABBABAAB)

## Troubleshooting
1. Q : Nothing printed.  
A : The program doesn't print anything if you repeat 12 or more times. I don't know how to fix this bug.

2. Q : It prints 'Something went wrong. (1)'. How to fix it?  
A : There was some problem at getInput() function. Fix it yourself.

3. Q : It prints 'Something went wrong. (2)'. How to fix it?  
A : Umm... I don't know why it doesn't work.
