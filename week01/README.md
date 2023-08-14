## 1주차 STL, 비트 연산, 연결 리스트

<다양한 자료구조>
ArrayList : https://www.codetree.ai/missions/6/problems/dynamic-array-concept/introduction

LinkedList : https://www.codetree.ai/missions/6/problems/integer-command-processing-8/introduction

Stack : https://www.codetree.ai/missions/6/problems/process-numeric-commands/introduction

Queue : https://www.codetree.ai/missions/6/problems/process-numeric-commands-2/introduction

Deque : https://www.codetree.ai/missions/6/problems/integer-command-processing-3/introduction

HashMap : https://www.codetree.ai/missions/8/problems/hashmap-basic/introduction

TreeMap : https://www.codetree.ai/missions/8/problems/treemap-basic/introduction

HashSet : https://www.codetree.ai/missions/8/problems/hashset-basic/introduction

TreeSet : https://www.codetree.ai/missions/8/problems/treeset-basic/introduction

Priority Queue : https://www.codetree.ai/missions/8/problems/process-numeric-commands-6/introduction

<br><br><br>

## 1. 새로운 불면증 치료법

※ SW expert 아카데미의 문제를 무단 복제하는 것을 금지합니다.

정수 N, M 이 주어질 때, M의 이진수 표현의 마지막 N 비트가 모두 1로 켜져 있는지 아닌지를 판별하여 출력하라.

[입력]

첫 번째 줄에 테스트 케이스의 수 TC가 주어진다.
이후 TC개의 테스트 케이스가 새 줄로 구분되어 주어진다.
각 테스트 케이스는 다음과 같이 구성되었다.
첫 번째 줄에 정수 N, M이 주어진다. (1 ≤ N ≤ 30 , 0 ≤ M ≤ 108)

[출력]

각 테스트 케이스마다 한 줄씩

마지막 N개의 비트가 모두 켜져 있다면 ON

아니면 OFF 를 출력하라.

<br><br><br>

## 2. 10726 이진수 표현

※ SW expert 아카데미의 문제를 무단 복제하는 것을 금지합니다.

정수 N, M 이 주어질 때, M의 이진수 표현의 마지막 N 비트가 모두 1로 켜져 있는지 아닌지를 판별하여 출력하라.

[입력]

첫 번째 줄에 테스트 케이스의 수 TC가 주어진다.
이후 TC개의 테스트 케이스가 새 줄로 구분되어 주어진다.
각 테스트 케이스는 다음과 같이 구성되었다.
첫 번째 줄에 정수 N, M이 주어진다. (1 ≤ N ≤ 30 , 0 ≤ M ≤ 108)

[출력]

각 테스트 케이스마다 한 줄씩

마지막 N개의 비트가 모두 켜져 있다면 ON

아니면 OFF 를 출력하라.

<br><br><br>

## 3. 암호문 3

※ SW expert 아카데미의 문제를 무단 복제하는 것을 금지합니다.

0 ~ 999999 사이의 수로 표현되는 암호문이 있고, 이 암호문을 N개 모아 놓은 암호문 뭉치가 있다.

암호문 뭉치를 급히 수정해야 할 일이 발생했는데, 암호문은 특수 제작된 처리기로만 수정이 가능하다.

처리기는 다음과 같이 3개의 명령어로 제어한다.

1. I(삽입) x, y, s : 앞에서부터 x번째 암호문 바로 다음에 y개의 암호문을 삽입한다. s는 덧붙일 암호문들이다.[ ex) I 3 2 123152 487651 ]

2. D(삭제) x, y : 앞에서부터 x번째 암호문 바로 다음부터 y개의 암호문을 삭제한다.[ ex) D 4 4 ]

3. A(추가) y, s : 암호문 뭉치 맨 뒤에 y개의 암호문을 덧붙인다. s는 덧붙일 암호문들이다. [ ex) A 2 421257 796813 ]

위의 규칙에 맞게 작성된 명령어를 나열하여 만든 문자열이 주어졌을 때, 암호문 뭉치를 수정하고, 수정된 결과의 처음 10개 암호문을 출력하는 프로그램을 작성하여라.

[입력]

첫 번째 줄 : 원본 암호문 뭉치 속 암호문의 개수 N ( 2000 ≤ N ≤ 4000 의 정수)

두 번째 줄 : 원본 암호문 뭉치

세 번째 줄 : 명령어의 개수 ( 250 ≤ M ≤ 500 의 정수)

네 번째 줄 : 명령어

위와 같은 네 줄이 한 개의 테스트 케이스이며, 총 10개의 테스트 케이스가 주어진다.

[출력]

#기호와 함께 테스트 케이스의 번호를 출력하고, 공백 문자 후 수정된 암호문 뭉치의 앞 10개 암호문을 출력한다.

<br><br><br>

## 4. 수열 편집

※ SW Expert 아카데미의 문제를 무단 복제하는 것을 금지합니다.

N개의 10억 이하 자연수로 이뤄진 수열이 주어진다. 이 수열은 완성된 것이 아니라 M번의 편집을 거쳐 완성된다고 한다.

완성된 수열에서 인덱스 L의 데이터를 출력하는 프로그램을 작성하시오.

다음은 미완성 수열과 편집의 예이다.

| 인덱스 | 0   | 1   | 2   | 3   | 4   |
| ------ | --- | --- | --- | --- | --- |
| 수열   | 1   | 2   | 3   | 4   | 5   |

I 2 7 -> 2번 인덱스 앞에 7을 추가하고, 한 칸 씩 뒤로 이동한다.

| 인덱스 | 0   | 1   | 2   | 3   | 4   | 5   |
| ------ | --- | --- | --- | --- | --- | --- |
| 수열   | 1   | 2   | 7   | 3   | 4   | 5   |

D 4 -> 4번 인덱스 자리를 지우고, 한 칸 씩 앞으로 이동한다.

| 인덱스 | 0   | 1   | 2   | 3   | 4   |
| ------ | --- | --- | --- | --- | --- |
| 수열   | 1   | 2   | 7   | 3   | 5   |

C 3 8 -> 3번 인덱스 자리를 8로 바꾼다.

| 인덱스 | 0   | 1   | 2   | 3   | 4   |
| ------ | --- | --- | --- | --- | --- |
| 수열   | 1   | 2   | 7   | 8   | 5   |

만약 편집이 끝난 후 L이 존재하지 않으면 -1을 출력한다.

[입력]

첫 줄에 테스트케이스의 수 T가 주어진다. 1<=T<=50

다음 줄부터 테스트 케이스의 별로 첫 줄에 수열의 길이 N, 추가 횟수 M, 출력할 인덱스 번호 L이 주어지고, 다음 줄에 수열이 주어진다.

그 다음 M개의 줄에 걸쳐 추가할 인덱스와 숫자 정보가 주어진다. 5<=N<=1000, 1<=M<=1000, 6<=L<=N+M

각 I, D, C 명령에서 입력 받는 인덱스의 위치가 존재하지 않는 불가능한 경우는 입력으로 들어오지 않는다.

[출력]

각 줄마다 "#T" (T는 테스트 케이스 번호)를 출력한 뒤, 답을 출력한다.
