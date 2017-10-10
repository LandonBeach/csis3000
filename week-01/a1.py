x = int(input("Please enter an integer: "))
list_set = range(x)
super_set = []
temp_set = []
length = 2 ** len(list_set) - 1
length_bin = str(bin(length))
length_bin = length_bin[2:]
print("Original set contains:", list_set)


def update_length():
    global length
    global length_bin
    global temp_set
    length = length - 1
    length_bin = str(bin(length))
    temp_set = []
    length_bin = length_bin[2:]
    return


while length > 0:
    for n in range(-len(length_bin), 0):
        if length_bin[n] == '1':
            temp_set.append(list_set[n])

super_set.append(temp_set)
update_length()

print("Super set conatins: ", super_set)
