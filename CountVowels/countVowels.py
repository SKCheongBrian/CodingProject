def main():
    vowels = ['a','e','i','o','u']
    userInput = input("Enter a word for the vowels to be counted: ")
    
    count = 0
    a = 0
    e = 0
    countI = 0
    o = 0
    u = 0

    for i in userInput.lower():
        if i in vowels:
            count += 1
            if i == 'a':
                a += 1
            if i == 'e':
                e += 1
            if i == 'i':
                countI += 1
            if i == 'o':
                o += 1
            if i == 'u':
                u += 1
    print(f"Number of vowels is {count}")
    print(f"Number of a's is {a}")
    print(f"Number of e's is {e}")
    print(f"Number of i's is {countI}")
    print(f"Number of o's is {o}")
    print(f"Number of u's is {u}")

main()
