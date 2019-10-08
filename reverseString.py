def main():
    inString = input("Please enter a string you would like to reverse: ")
    result = ""

    for i in inString:
        result = i + result

    return result

print(main())
