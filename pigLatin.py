def main():
    #initialise consonants and vowels
    consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
    vowels = ['a', 'e', 'i', 'o', 'u']
    userInput = input("Please enter a word: ")
    lowerInput = userInput.lower()
    result = ""

    #create loop to check whether is is a single consonant or a group
    if lowerInput[0] in consonants:
        i = 0
        while True:
            if lowerInput[i] in consonants:
                i += 1
            else:
                break

        result = userInput[i:] + userInput[0:i] + 'ay'

    #check if start with vowel
    if lowerInput[0] in vowels:
        result = userInput + 'way'

    return result

print(main())
