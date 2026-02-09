n = int(input())
l1 = input().split()[1:]
l2 = input().split()[1:]

s = set(l1 + l2)

for i in range(1, n + 1):
    if str(i) not in s:
        print("Oh, my keyboard!")
        break
else:
    print("I become the guy.")
